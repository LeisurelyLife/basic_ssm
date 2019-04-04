package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_role_authority")
public class TRoleAuthority {
    /**
     * 角色权限ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 角色ID
     */
    @Column(name = "role_id")
    private Long roleId;

    /**
     * 主题代码
     */
    @Column(name = "topic_code")
    private String topicCode;

    /**
     * 页面代码
     */
    @Column(name = "page_code")
    private String pageCode;

    /**
     * 按钮代码
     */
    @Column(name = "button_code")
    private String buttonCode;

    /**
     * 请求url
     */
    private String url;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建者ID
     */
    @Column(name = "creator_id")
    private Long creatorId;

    /**
     * 是否删除（0=否,1=是）
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 修改者ID
     */
    @Column(name = "modify_id")
    private Long modifyId;

    /**
     * 是否能给予其他人该权限(0：不可以，1：可以)
     */
    @Column(name = "give_authority")
    private Integer giveAuthority;

    /**
     * 获取角色权限ID
     *
     * @return id - 角色权限ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置角色权限ID
     *
     * @param id 角色权限ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取角色ID
     *
     * @return role_id - 角色ID
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置角色ID
     *
     * @param roleId 角色ID
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /**
     * 获取主题代码
     *
     * @return topic_code - 主题代码
     */
    public String getTopicCode() {
        return topicCode;
    }

    /**
     * 设置主题代码
     *
     * @param topicCode 主题代码
     */
    public void setTopicCode(String topicCode) {
        this.topicCode = topicCode;
    }

    /**
     * 获取页面代码
     *
     * @return page_code - 页面代码
     */
    public String getPageCode() {
        return pageCode;
    }

    /**
     * 设置页面代码
     *
     * @param pageCode 页面代码
     */
    public void setPageCode(String pageCode) {
        this.pageCode = pageCode;
    }

    /**
     * 获取按钮代码
     *
     * @return button_code - 按钮代码
     */
    public String getButtonCode() {
        return buttonCode;
    }

    /**
     * 设置按钮代码
     *
     * @param buttonCode 按钮代码
     */
    public void setButtonCode(String buttonCode) {
        this.buttonCode = buttonCode;
    }

    /**
     * 获取请求url
     *
     * @return url - 请求url
     */
    public String getUrl() {
        return url;
    }

    /**
     * 设置请求url
     *
     * @param url 请求url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取创建者ID
     *
     * @return creator_id - 创建者ID
     */
    public Long getCreatorId() {
        return creatorId;
    }

    /**
     * 设置创建者ID
     *
     * @param creatorId 创建者ID
     */
    public void setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
    }

    /**
     * 获取是否删除（0=否,1=是）
     *
     * @return is_delete - 是否删除（0=否,1=是）
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除（0=否,1=是）
     *
     * @param isDelete 是否删除（0=否,1=是）
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取修改者ID
     *
     * @return modify_id - 修改者ID
     */
    public Long getModifyId() {
        return modifyId;
    }

    /**
     * 设置修改者ID
     *
     * @param modifyId 修改者ID
     */
    public void setModifyId(Long modifyId) {
        this.modifyId = modifyId;
    }

    /**
     * 获取是否能给予其他人该权限(0：不可以，1：可以)
     *
     * @return give_authority - 是否能给予其他人该权限(0：不可以，1：可以)
     */
    public Integer getGiveAuthority() {
        return giveAuthority;
    }

    /**
     * 设置是否能给予其他人该权限(0：不可以，1：可以)
     *
     * @param giveAuthority 是否能给予其他人该权限(0：不可以，1：可以)
     */
    public void setGiveAuthority(Integer giveAuthority) {
        this.giveAuthority = giveAuthority;
    }
}