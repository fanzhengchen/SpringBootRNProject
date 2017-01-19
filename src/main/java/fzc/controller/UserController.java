package fzc.controller;

import com.alibaba.druid.util.StringUtils;
import fzc.Constant;
import fzc.domain.User;
import fzc.mapper.UserMapper;
import fzc.network.response.BaseResponse;
import fzc.network.request.LoginBody;
import fzc.network.response.LoginResp;
import org.omg.PortableInterceptor.SUCCESSFUL;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.List;

/**
 * Created by mark on 17-1-18.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserMapper userMapper;

    @RequestMapping(value = "/allUsers", method = RequestMethod.GET)
    public BaseResponse<List<User>> findAll() {

        BaseResponse<List<User>> response = new BaseResponse<>();
        response.setData(userMapper.findAll());
        return response;
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public BaseResponse login(@RequestBody LoginBody body) {

        String name = body.getName();
        String password = body.getPassword();

        User user = userMapper.findUserByUserName(name);

        LoginResp resp = new LoginResp();
        BaseResponse<LoginResp> response = new BaseResponse<>();

        if (user == null) {
            response.setCode(-1);
            response.setMessage(Constant.USER_NOT_EXIT);
            return response;
        }


        if (!StringUtils.equals(user.getPassword(), password)) {
            response.setCode(-2);
            response.setMessage(Constant.WRONG_PASSWORD);
            return response;
        }

        response.setCode(0);
        response.setMessage(Constant.SUCCESS);

        logger.debug("User {} {}", user.getUserId(), user.getName());

        resp.setUserId(user.getUserId());
        Long token = refreshToken(user.getUserId());
        resp.setToken(token);

        response.setData(resp);
        return response;

    }

//    public BaseResponse<User>

    public Long refreshToken(Long userId) {
        Long token = System.currentTimeMillis();
        logger.debug("token {}", token);
        userMapper.updateToken(userId, token);
        return token;
    }
}
