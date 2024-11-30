package com.pocket.mapper;

import com.pocket.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Map;

/**
 * @author sqnugy
 * @version 1.0
 * @ClassName UserMapper
 * @description
 * @date 2024-11-25
 */

@Mapper
public interface UserMapper {



    /**
     * 根据openid查询用户
     * @param openId
     * @return
     */
    @Select("select * from user where openid = #{openid}")
    User getByOpenId(String openId);

    /**
     * 插入数据
     * @param user
     */
    void insert(User user);

    /**
     * 根据userid查询用户
     * @param userId
     * @return
     */
    @Select("select * from user where id = #{id}")
    User getById(Long userId);

    /**
     * 根据动态条件统计用户数量
     * @param map
     * @return
     */
    Integer countByMap(Map map);
}
