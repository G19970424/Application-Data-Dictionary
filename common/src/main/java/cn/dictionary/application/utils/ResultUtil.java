package cn.dictionary.application.utils;

import cn.dictionary.application.common.entity.Result;
import cn.dictionary.application.common.enums.ResultEnum;

/**
 * @Description 公共接口，返回结果集
 * @Author gejj
 * @Date 2023/6/4 15:41
 * @Version 1.0
 **/
public class ResultUtil {
    private static Result result;

    static {
        result = new Result();
        result.setDate(DateUtil.getInstance().nowDate());
    }

    public static Result ok(){
        result.setCode(ResultEnum.REQUEST_SUCCESS.getCode());
        result.setMessage(ResultEnum.REQUEST_SUCCESS.getMessage());
        return result;
    }

    public static Result ok(String message){
        result.setCode(ResultEnum.REQUEST_SUCCESS.getCode());
        result.setMessage(message);
        return result;
    }

    public static Result ok(Integer code){
        result.setCode(code);
        result.setMessage(ResultEnum.REQUEST_SUCCESS.getMessage());
        return result;
    }

    public static Result ok(Integer code,String message){
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

    public static Result ok(Integer code,String message,Object data){
        result.setCode(code);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public static Result fail(){
        result.setCode(ResultEnum.REQUEST_FAILURE.getCode());
        result.setMessage(ResultEnum.REQUEST_FAILURE.getMessage());
        return result;
    }

    public static Result fail(Integer code){
        result.setCode(code);
        result.setMessage(ResultEnum.REQUEST_FAILURE.getMessage());
        return result;
    }

    public static Result fail(String message){
        result.setCode(ResultEnum.REQUEST_FAILURE.getCode());
        result.setMessage(message);
        return result;
    }

    public static Result fail(Integer code,String message){
        result.setCode(code);
        result.setMessage(message);
        return result;
    }

}
