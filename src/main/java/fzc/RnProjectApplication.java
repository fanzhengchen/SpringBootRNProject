package fzc;

import fzc.mapper.UserMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RnProjectApplication implements CommandLineRunner{

    private UserMapper userMapper;


    public RnProjectApplication(UserMapper userMapper) throws Exception {
        this.userMapper = userMapper;

    }

    public static void main(String[] args) {
        SpringApplication.run(RnProjectApplication.class, args);
    }


    @Override
    public void run(String... strings) throws Exception {
         System.out.println(userMapper.findUserByPhone("18768127456"));
    }
}
