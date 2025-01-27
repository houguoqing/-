package com.kkb.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class TCourse implements Serializable {
    private Integer id;

    private String name;

    private String icon;

    private Date createDate;

    private Integer isShow;

    private Integer userId;

    private Integer orderNo;

    private static final long serialVersionUID = 1L;

    public TCourse(Integer id, String name, String icon, Date createDate, Integer isShow, Integer userId, Integer orderNo) {
        this.id = id;
        this.name = name;
        this.icon = icon;
        this.createDate = createDate;
        this.isShow = isShow;
        this.userId = userId;
        this.orderNo = orderNo;
    }

    public TCourse() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Integer getIsShow() {
        return isShow;
    }

    public void setIsShow(Integer isShow) {
        this.isShow = isShow;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", icon=").append(icon);
        sb.append(", createDate=").append(createDate);
        sb.append(", isShow=").append(isShow);
        sb.append(", userId=").append(userId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    //扩展属性
    private String creator;//创建者 名字

    private long catalogQty;//该学科目录数量

    private long tagQty;//学科标签数量

    private long questionQty; //该学科下的题目数量

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public long getCatalogQty() {
        return catalogQty;
    }

    public void setCatalogQty(long catalogQty) {
        this.catalogQty = catalogQty;
    }

    public long getTagQty() {
        return tagQty;
    }

    public void setTagQty(long tagQty) {
        this.tagQty = tagQty;
    }

    public long getQuestionQty() {
        return questionQty;
    }

    public void setQuestionQty(long questionQty) {
        this.questionQty = questionQty;
    }

    public List<TCatalog> getCatalogList() {
        return catalogList;
    }

    public void setCatalogList(List<TCatalog> catalogList) {
        this.catalogList = catalogList;
    }

    public List<TTag> getTagList() {
        return tagList;
    }

    public void setTagList(List<TTag> tagList) {
        this.tagList = tagList;
    }

    //扩展字段(初始化题库页面)
    private List<TCatalog> catalogList;//学科下的目录列表

    private List<TTag> tagList;//学科下的标签列表

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 小程序扩展字段
     * */
    private String title;

}