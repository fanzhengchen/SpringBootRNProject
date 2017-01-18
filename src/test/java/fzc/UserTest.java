package fzc;

import fzc.domain.User;
import fzc.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by mark on 17-1-17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RnProjectApplication.class)
public class UserTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findAll() {
        List<User> users = userMapper.findAll();
        System.out.println(users);
    }
}
