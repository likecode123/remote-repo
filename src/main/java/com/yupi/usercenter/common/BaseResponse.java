package com.yupi.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 * @param <T>
 */
@Data
public class BaseResponse<T>  implements Serializable {
    private int code;
    private T data;
    private String message;
    private String description;


    public BaseResponse(int code, T data, String message,String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }

    public BaseResponse(int code, T data) {
//        使用this调用其他构造方法
        this(code, data, "","");
    }

    public BaseResponse(int code, T data, String message) {
        this(code, data, message, "");
    }

    public BaseResponse(ErrorCode errpCode){
        this(errpCode.getCode(),null,errpCode.getMessage(),errpCode.getDescription());

    }
}
