package com.xiaomi.base.k.video.vo;

import javax.validation.constraints.NotNull;

/**
 * @author lianglongjiang
 * @date
 */

public class KvideoAuthorVO {


    @NotNull(message = "用户名不能为空")
    private String username;

    private Long cpId;
    private String cp = "1";

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    @Override
    public String toString() {
        return "KvideoAuthorVO{" +
                "username='" + username + '\'' +
                ", cpId=" + cpId +
                ", cp='" + cp + '\'' +
                '}';
    }
}
