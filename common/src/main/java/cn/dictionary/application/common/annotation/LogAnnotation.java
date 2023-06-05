package cn.dictionary.application.common.annotation;

import cn.dictionary.application.common.enums.LogOperationEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description 日志注解，用于记录日志使用
 * @Author gejj
 * @Date 2023/6/4 15:41
 * @Version 1.0
 **/
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface LogAnnotation {
    /** 主要功能 */
    String title() default "";
    /**
     * 主要内容
     * 原数据类型：{原数据内容：""},{修改后数据:""}
     * 例如：java.lang.Object:{原数据内容："1234"},{修改后数据:"9876"}
     **/
    String content() default "";
    /**
     * 操作类型
     * 根据用户操作获取
     **/
    LogOperationEnum operation();

}
