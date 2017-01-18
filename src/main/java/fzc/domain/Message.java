package fzc.domain;

import sun.dc.pr.PRError;

import java.io.Serializable;

/**
 * Created by mark on 17-1-18.
 */
public class Message implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer messageId;
    private Integer from;
    private Integer to;
    private String content;
    private Long createTime;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getTo() {
        return to;
    }

    public void setTo(Integer to) {
        this.to = to;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }
}
