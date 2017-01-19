package fzc.network.response;

/**
 * Created by mark on 17-1-19.
 */
public class LoginResp {
    private Long userId;
    private Long token;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getToken() {
        return token;
    }

    public void setToken(Long token) {
        this.token = token;
    }
}
