package cn.dictionary.application.dao.mapper;

import cn.dictionary.application.dao.pojo.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author gejj
 * @data 2023/6/6 15:57
 */
@Mapper
public interface UserMapper {
    User selectByUsername(String username);
}
