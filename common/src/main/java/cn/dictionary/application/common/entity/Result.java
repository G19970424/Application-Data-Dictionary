package cn.dictionary.application.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

/**
 * @Description 公共接口entity对象
 * @Author gejj
 * @Date 2023/6/4 15:41
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Result <T>{
    private Integer code;
    private String message;
    private T data;
    private Date date;


}
