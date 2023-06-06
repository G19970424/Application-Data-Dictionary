package cn.dictionary.application.dao.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author gejj
 * @data 2023/6/6 16:01
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Permission {
    private String id;
    private String expression;
}
