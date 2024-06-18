package com.yupi.usercenter.exception;

import com.yupi.usercenter.common.ErrorCode;

public class BusinessException  extends RuntimeException
{
    /**
	 *自定义异常类 相对于java自带的异常   自定义更多字段
	 */
	private final  int code;
    private  final  String description;

    public BusinessException(String message, int code, String description) {
        super(message);
        this.code = code;
        this.description = description;
    }


    public BusinessException(ErrorCode error) {
        super(error.getMessage());
        this.code = error.getCode();
        this.description
            = error.getDescription();
    }

    public BusinessException(ErrorCode error,String description) {
        super(error.getMessage());
        this.code = error.getCode();
        this.description
                = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
}
