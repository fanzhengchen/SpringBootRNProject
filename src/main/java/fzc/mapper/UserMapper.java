package fzc.mapper;

import fzc.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by mark on 17-1-17.
 */
@Mapper
public interface UserMapper {

    /**
     * 查询所有用户
     *
     * @return
     */
    @Results(id = "findAll", value = {
            @Result(property = "userId", column = "user_id")
    })
    @Select("select * from User")
    public List<User> findAll();

    /**
     * 根据id 查询用户
     *
     * @param userId
     * @return
     */
    @Results(id = "findUserByUserId", value = {
            @Result(property = "userId", column = "user_id")
    })
    @Select("select * from User where user_id=#{userId}")
    public User findUserByUserId(@Param("userId") String userId);
}
