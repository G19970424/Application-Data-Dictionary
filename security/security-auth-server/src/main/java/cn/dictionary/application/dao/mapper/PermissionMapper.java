package cn.dictionary.application.dao.mapper;

import cn.dictionary.application.dao.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author gejj
 * @data 2023/6/6 16:02
 */
@Mapper
public interface PermissionMapper {
    List<Permission> selectPermissionsByUserId(String id);
}
