package fzc;

import fzc.mapper.MessageMapper;
import fzc.mapper.UserMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SpringBootApplication
@Service
public class RnProjectApplication implements CommandLineRunner {

    private UserMapper userMapper;
    private MessageMapper messageMapper;


    public RnProjectApplication(UserMapper userMapper, MessageMapper messageMapper) throws Exception {
        this.userMapper = userMapper;
        this.messageMapper = messageMapper;
    }

    public static void main(String[] args) {
        SpringApplication.run(RnProjectApplication.class, args);
    }


    @Bean
    public UserMapper getUserMapper() {
        return userMapper;
    }

    @Bean
    public MessageMapper getMessageMapper() {
        return messageMapper;
    }


    @Override
    public void run(String... strings) throws Exception {
//        System.out.println(userMapper.findAll());
    }
}
