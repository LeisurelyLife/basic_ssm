package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_admin_role")
public class TAdminRole {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 公会编号
     */
    @Column(name = "guild_id")
    private Long guildId;

    /**
     * 角色名称
     */
    @Column(name = "role_name")
    private String roleName;

    /**
     * 角色代号
     */
    @Column(name = "role_code")
    private String roleCode;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 是否删除(1.是 0.否)
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 角色类型（0公会自定义 1 管理员 ）
     */
    @Column(name = "role_type")
    private Integer roleType;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取公会编号
     *
     * @return guild_id - 公会编号
     */
    public Long getGuildId() {
        return guildId;
    }

    /**
     * 设置公会编号
     *
     * @param guildId 公会编号
     */
    public void setGuildId(Long guildId) {
        this.guildId = guildId;
    }

    /**
     * 获取角色名称
     *
     * @return role_name - 角色名称
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * 设置角色名称
     *
     * @param roleName 角色名称
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    /**
     * 获取角色代号
     *
     * @return role_code - 角色代号
     */
    public String getRoleCode() {
        return roleCode;
    }

    /**
     * 设置角色代号
     *
     * @param roleCode 角色代号
     */
    public void setRoleCode(String roleCode) {
        this.roleCode = roleCode;
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
     * 获取是否删除(1.是 0.否)
     *
     * @return is_delete - 是否删除(1.是 0.否)
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除(1.是 0.否)
     *
     * @param isDelete 是否删除(1.是 0.否)
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取角色类型（0公会自定义 1 管理员 ）
     *
     * @return role_type - 角色类型（0公会自定义 1 管理员 ）
     */
    public Integer getRoleType() {
        return roleType;
    }

    /**
     * 设置角色类型（0公会自定义 1 管理员 ）
     *
     * @param roleType 角色类型（0公会自定义 1 管理员 ）
     */
    public void setRoleType(Integer roleType) {
        this.roleType = roleType;
    }
}