package com.xiaomi.base.k.video.domain;

import java.util.Date;

public class KvideoVideoModel {
    private Long id;

    private Short cp;

    private Long cpId;

    private String cpVideoId;

    private Long uniUserId;

    private String title;

    private String titleMd5;

    private String summary;

    private String cpTags;

    private String cpChineseTags;

    private Date publishTime;

    private Integer videoSeconds;

    private String listImageUrl;

    private String ksListImageUrl;

    private String detailImageUrl;

    private String cpUrl1;

    private String cpUrl2;

    private String saveBulket;

    private String savePath;

    private String saveUrl;

    private String definition;

    private String vtype;

    private Integer vwidth;

    private Integer vheight;

    private Integer bitrate;

    private Integer size;

    private String codeType;

    private Short state;

    private Date lastSwitchTime;

    private Date gmtCreate;

    private Date gmtModify;

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

    public String getCpVideoId() {
        return cpVideoId;
    }

    public void setCpVideoId(String cpVideoId) {
        this.cpVideoId = cpVideoId == null ? null : cpVideoId.trim();
    }

    public Long getUniUserId() {
        return uniUserId;
    }

    public void setUniUserId(Long uniUserId) {
        this.uniUserId = uniUserId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitleMd5() {
        return titleMd5;
    }

    public void setTitleMd5(String titleMd5) {
        this.titleMd5 = titleMd5 == null ? null : titleMd5.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getCpTags() {
        return cpTags;
    }

    public void setCpTags(String cpTags) {
        this.cpTags = cpTags == null ? null : cpTags.trim();
    }

    public String getCpChineseTags() {
        return cpChineseTags;
    }

    public void setCpChineseTags(String cpChineseTags) {
        this.cpChineseTags = cpChineseTags == null ? null : cpChineseTags.trim();
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public Integer getVideoSeconds() {
        return videoSeconds;
    }

    public void setVideoSeconds(Integer videoSeconds) {
        this.videoSeconds = videoSeconds;
    }

    public String getListImageUrl() {
        return listImageUrl;
    }

    public void setListImageUrl(String listImageUrl) {
        this.listImageUrl = listImageUrl == null ? null : listImageUrl.trim();
    }

    public String getKsListImageUrl() {
        return ksListImageUrl;
    }

    public void setKsListImageUrl(String ksListImageUrl) {
        this.ksListImageUrl = ksListImageUrl == null ? null : ksListImageUrl.trim();
    }

    public String getDetailImageUrl() {
        return detailImageUrl;
    }

    public void setDetailImageUrl(String detailImageUrl) {
        this.detailImageUrl = detailImageUrl == null ? null : detailImageUrl.trim();
    }

    public String getCpUrl1() {
        return cpUrl1;
    }

    public void setCpUrl1(String cpUrl1) {
        this.cpUrl1 = cpUrl1 == null ? null : cpUrl1.trim();
    }

    public String getCpUrl2() {
        return cpUrl2;
    }

    public void setCpUrl2(String cpUrl2) {
        this.cpUrl2 = cpUrl2 == null ? null : cpUrl2.trim();
    }

    public String getSaveBulket() {
        return saveBulket;
    }

    public void setSaveBulket(String saveBulket) {
        this.saveBulket = saveBulket == null ? null : saveBulket.trim();
    }

    public String getSavePath() {
        return savePath;
    }

    public void setSavePath(String savePath) {
        this.savePath = savePath == null ? null : savePath.trim();
    }

    public String getSaveUrl() {
        return saveUrl;
    }

    public void setSaveUrl(String saveUrl) {
        this.saveUrl = saveUrl == null ? null : saveUrl.trim();
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition == null ? null : definition.trim();
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype == null ? null : vtype.trim();
    }

    public Integer getVwidth() {
        return vwidth;
    }

    public void setVwidth(Integer vwidth) {
        this.vwidth = vwidth;
    }

    public Integer getVheight() {
        return vheight;
    }

    public void setVheight(Integer vheight) {
        this.vheight = vheight;
    }

    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
        this.bitrate = bitrate;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType == null ? null : codeType.trim();
    }

    public Short getState() {
        return state;
    }

    public void setState(Short state) {
        this.state = state;
    }

    public Date getLastSwitchTime() {
        return lastSwitchTime;
    }

    public void setLastSwitchTime(Date lastSwitchTime) {
        this.lastSwitchTime = lastSwitchTime;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", cp=").append(cp);
        sb.append(", cpId=").append(cpId);
        sb.append(", cpVideoId=").append(cpVideoId);
        sb.append(", uniUserId=").append(uniUserId);
        sb.append(", title=").append(title);
        sb.append(", titleMd5=").append(titleMd5);
        sb.append(", summary=").append(summary);
        sb.append(", cpTags=").append(cpTags);
        sb.append(", cpChineseTags=").append(cpChineseTags);
        sb.append(", publishTime=").append(publishTime);
        sb.append(", videoSeconds=").append(videoSeconds);
        sb.append(", listImageUrl=").append(listImageUrl);
        sb.append(", ksListImageUrl=").append(ksListImageUrl);
        sb.append(", detailImageUrl=").append(detailImageUrl);
        sb.append(", cpUrl1=").append(cpUrl1);
        sb.append(", cpUrl2=").append(cpUrl2);
        sb.append(", saveBulket=").append(saveBulket);
        sb.append(", savePath=").append(savePath);
        sb.append(", saveUrl=").append(saveUrl);
        sb.append(", definition=").append(definition);
        sb.append(", vtype=").append(vtype);
        sb.append(", vwidth=").append(vwidth);
        sb.append(", vheight=").append(vheight);
        sb.append(", bitrate=").append(bitrate);
        sb.append(", size=").append(size);
        sb.append(", codeType=").append(codeType);
        sb.append(", state=").append(state);
        sb.append(", lastSwitchTime=").append(lastSwitchTime);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModify=").append(gmtModify);
        sb.append("]");
        return sb.toString();
    }
}