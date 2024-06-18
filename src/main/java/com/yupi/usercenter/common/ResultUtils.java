package com.yupi.usercenter.common;

public class ResultUtils {
    /**
     * 成功
     * @param data
     * @param <T>
     * @return
     */
    public static <T> BaseResponse<T> success(T data){
        return new BaseResponse<>(0,data,"OK");
    }

    /**
     * 失败
     */
    public static  BaseResponse error(ErrorCode errorCode, String message, String description){
        return new BaseResponse<>(errorCode);
    }

    public static  BaseResponse error(ErrorCode errorCode,String description){
        return new BaseResponse<>(errorCode.getCode(),null,errorCode.getMessage(),description);
    }

    public static  BaseResponse error(int code,String message,String description){
        return new BaseResponse<>(code,null,message,description);
    }
}
