package com.xiaomi.base.k.video.domain;

import java.util.Date;

public class KvideoAuthorModel {
    private Long id;

    private Short cp;

    private Long cpId;

    private Long uniUserId;

    private String name;

    private String ddesc;

    private Short miType;

    private String icon;

    private String ksIcon;

    private Short state;

    private Date gmtCreate;

    private Date gmtModify;

    private String shortDdesc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Short getCp() {
        return cp;
    }

    public void setCp(Short cp) {
        this.cp = cp;
    }

    public Long getCpId() {
        return cpId;
    }

    public void setCpId(Long cpId) {
        this.cpId = cpId;
    }

    public Long getUniUserId() {
        return uniUserId;
    }

    public void setUniUserId(Long uniUserId) {
        this.uniUserId = uniUserId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDdesc() {
        return ddesc;
    }

    public void setDdesc(String ddesc) {
        this.ddesc = ddesc == null ? null : ddesc.trim();
    }

    public Short getMiType() {
        return miType;
    }

    public void setMiType(Short miType) {
        this.miType = miType;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getKsIcon() {
        return ksIcon;
    }

    public void setKsIcon(String ksIcon) {
        this.ksIcon = ksIcon == null ? null : ksIcon.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModify() {
        return gmtModify;
    }

    public void setGmtModify(Date gmtModify) {
        this.gmtModify = gmtModify;
    }

    public String getShortDdesc() {
        return shortDdesc;
    }

    public void setShortDdesc(String shortDdesc) {
        this.shortDdesc = shortDdesc == null ? null : shortDdesc.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cp=").append(cp);
        sb.append(", cpId=").append(cpId);
        sb.append(", uniUserId=").append(uniUserId);
        sb.append(", name=").append(name);
        sb.append(", ddesc=").append(ddesc);
        sb.append(", miType=").append(miType);
        sb.append(", icon=").append(icon);
        sb.append(", ksIcon=").append(ksIcon);
        sb.append(", state=").append(state);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModify=").append(gmtModify);
        sb.append(", shortDdesc=").append(shortDdesc);
        sb.append("]");
        return sb.toString();
    }
}