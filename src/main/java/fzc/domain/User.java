package fzc.domain;

import java.io.Serializable;
import java.math.BigInteger;

/**
 * Created by mark on 17-1-18.
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long userId;
    private String name;
    private String password;
    private Long token;


    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }
}


