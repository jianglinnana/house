package com.jianglinnana.house.log;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.jianglinnana.house.util.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * 日志输出
 *
 * @author jianglinnana
 */
@Aspect
@Component
@Slf4j
public class ControllerLogAop {

    @Pointcut("execution(* *..*.*.controller..*.*(..))")
    public void controller() {
    }

    @Around("controller()")
    public Object controller(ProceedingJoinPoint joinPoint) throws Throwable {
        String className = joinPoint.getTarget().getClass().getSimpleName();
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();

        // Get request attribute
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = Objects.requireNonNull(requestAttributes).getRequest();

        printRequestLog(request, className, methodName, args);
        long start = System.currentTimeMillis();
        Object returnObj = joinPoint.proceed();
        printResponseLog(request, className, methodName, returnObj, System.currentTimeMillis() - start);
        return returnObj;
    }

    private void printRequestLog(HttpServletRequest request, String clazzName, String methodName, Object[] args) throws JsonProcessingException {
        log.debug("Request URL: [{}], URI: [{}], Request Method: [{}], IP: [{}]",
                request.getRequestURL(),
                request.getRequestURI(),
                request.getMethod(),
                request.getRemoteAddr());

        if (args == null || !log.isDebugEnabled()) {
            return;
        }

        boolean hasServletArg = false;
        for (Object arg : args) {
            if (arg instanceof HttpServletRequest ||
                    arg instanceof HttpServletResponse ||
                    arg instanceof MultipartFile) {
                hasServletArg = true;
                break;
            }
        }

        if (!hasServletArg) {
            String requestBody = JsonUtil.toJsonString(args);
            log.debug("{}.{} Parameters: [{}]", clazzName, methodName, requestBody);
        }
    }

    private void printResponseLog(HttpServletRequest request, String className, String methodName, Object returnObj, long usage) throws JsonProcessingException {
        if (log.isDebugEnabled()) {
            String returningData = null;
            if (returnObj != null) {
                if (returnObj.getClass().isAssignableFrom(byte[].class)) {
                    returningData = "Binary data";
                } else {
                    returningData = JsonUtil.toJsonString(returnObj);
                    returningData = "";
                }
            }
            log.debug("{}.{} Response: [{}], usage: [{}]ms", className, methodName, returningData, usage);
        }
    }
}
