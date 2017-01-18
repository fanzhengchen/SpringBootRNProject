package fzc.controller;

import fzc.domain.User;
import fzc.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mark on 17-1-18.
 */
@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/allUsers",method = RequestMethod.GET)
    public List<User> findAll() {
        return userMapper.findAll();
    }
}
