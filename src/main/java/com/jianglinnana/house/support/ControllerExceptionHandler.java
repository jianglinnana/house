package com.jianglinnana.house.support;

import org.springframework.web.bind.annotation.*;

/**
 * @author jianglinnana
 */
@RestControllerAdvice
public class ControllerExceptionHandler {
    /**
     * 通用异常处理器
     *
     * @param e 异常
     * @return 错误包装信息
     */
    @ExceptionHandler(Exception.class)
    public ResponsePackage handleGlobalException(){
        System.out.println("haha");
        return ResponsePackage.fail(new ErrorMessage(ErrorCode.A0001,"sa","asd"));
    }
}
