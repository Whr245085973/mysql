package com.han.mysql.mapper;

import com.han.mysql.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Author: CREATED BY W.H.R
 * @Date: 2021/1/5 11:17
 **/
@Mapper
public interface UserMapper {

    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /**
     * 根据字段查询
     * @param paramMap
     * @return
     */
    List<User> selectByCondition(Map<String, Object> paramMap);

}
