package com.jianglinnana.house.support;

import cn.dev33.satoken.exception.SaTokenException;
import com.jianglinnana.house.exception.HouseApiException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author jianglinnana
 */
@RestControllerAdvice
public class ControllerExceptionHandler {

    /**
     * 权限框架异常处理器
     *
     * @param e 权限框架异常
     * @return 错误包装信息
     */
    @ExceptionHandler(SaTokenException.class)
    @ResponseStatus(HttpStatus.FORBIDDEN)
    public ResponsePackage saTokenExceptionHandler(SaTokenException e) {
        return ResponsePackage.fail(new ErrorMessage(ErrorCode.S0001,
                e.getMessage(), "无访问权限"));
    }

    /**
     * 系统异常处理器
     *
     * @param e 系统异常
     * @return 错误包装信息
     */
    @ExceptionHandler(HouseApiException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ResponsePackage houseApiExceptionHandler(HouseApiException e) {
        ErrorMessage errorMessage = new ErrorMessage(e.getErrorCode(), e.getMessage(), e.getUserPromptMsg());
        return ResponsePackage.fail(errorMessage);
    }

    /**
     * 通用异常处理器
     *
     * @param e 异常
     * @return 错误包装信息
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponsePackage handleGlobalException(Exception e) {
        e.printStackTrace();
        return ResponsePackage.fail(new ErrorMessage(ErrorCode.B0001,
                e.getMessage(), "诶呀～服务器开了个小差 X﹏X"));
    }
}
