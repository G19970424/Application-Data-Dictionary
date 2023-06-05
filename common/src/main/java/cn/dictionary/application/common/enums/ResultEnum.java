package cn.dictionary.application.common.enums;

import lombok.Getter;
/**
 * @Description 系统状态码枚举
 * @Author gejj
 * @Date 2023/6/4 15:41
 * @Version 1.0
 **/
@Getter
public enum ResultEnum {
    REQUEST_SUCCESS(200,"请求成功"),
    PARAMETER_ABNORMALITY(400,"参数异常"),
    REQUEST_FAILURE(401,"请求失败"),
    SERVER_EXCEPTION(500,"服务器异常")

    ;
    ResultEnum(Integer code,String message){
        this.code = code;
        this.message =message;
    }

    private Integer code;
    private String message;
}
