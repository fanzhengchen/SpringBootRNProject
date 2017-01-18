package fzc.mapper;

import fzc.table.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

/**
 * Created by mark on 17-1-17.
 */
@Mapper
public interface UserMapper {

    @Select("SELECT * FROM User")
    public List<User> findAll() throws IOException;

    @Select("SELECT (user_id, name, phone, password) FROM User where phone=#{phone}")
    public User findUserByPhone(@Param("phone") String phone);
}
