package com.yupi.usercenter.exception;

import com.yupi.usercenter.common.BaseResponse;
import com.yupi.usercenter.common.ErrorCode;
import com.yupi.usercenter.common.ResultUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
    /**
     * 专门捕获自定义异常
     * @param e
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public BaseResponse businessExceptionHandler(BusinessException e) {
        log.error("BusinessException{}",e.getMessage(),e);
        return ResultUtils.error(e.getCode(),e.getMessage(), e.getDescription());

    }
    /**
     * 如果要是捕获java自带异常的话
     */
    @ExceptionHandler(RuntimeException.class)
    public BaseResponse runtimeExceptionHandler(RuntimeException runtimeException){
        log.error("运行时异常{}",runtimeException);
        return ResultUtils.error(ErrorCode.SYSTEM_ERROR, runtimeException.getMessage(),"");
    }
}
