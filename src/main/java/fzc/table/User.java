package fzc.table;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by mark on 17-1-17.
 */
public class User implements Serializable {

    private static final long serialVersionUID = 2120869894112984147L;
    @JsonProperty(value = "user_id")
    private String userId;
    @JsonProperty(value = "name")
    private String name;
    @JsonProperty(value = "phone")
    private String phone;
    @JsonProperty(value = "password")
    private String password;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
