package cn.dictionary.application.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @Description 用于系统时间获取
 * @Author gejj
 * @Date 2023/6/4 15:41
 * @Version 1.0
 **/
public class DateUtil {

    public static volatile DateUtil instance;

    private DateUtil(){

    }

    public static DateUtil getInstance(){
        if(instance == null){
            synchronized (DateUtil.class){
                if(instance == null){
                    instance = new DateUtil();
                }
            }
        }
        return  instance;
    }

    /**
     * 获取当前系统时间
     * @return
     */
    public Date nowDate(){
        return new Date();
    }

    /**
     * 获取当前系统时间字符串
     * 时间格式 "yyyy-MM-dd HH:mm:ss"
     * @return
     */
    public String  nowDateFormat(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return df.format(nowDate());
    }

}
