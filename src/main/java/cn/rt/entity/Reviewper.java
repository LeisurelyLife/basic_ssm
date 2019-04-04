package cn.rt.entity;

import javax.persistence.*;

@Table(name = "reviewper")
public class Reviewper {
    /**
     * 主键ID，UUID
     */
    @Id
    @Column(name = "ripId")
    private String ripid;

    /**
     * 审核流程ID
     */
    @Column(name = "rpId")
    private String rpid;

    /**
     * 课题ID
     */
    private String topid;

    /**
     * 审核人ID
     */
    @Column(name = "ripUserId")
    private String ripuserid;

    /**
     * 更新用户ID
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 更新日期
     */
    @Column(name = "ripDate")
    private String ripdate;

    /**
     * 获取主键ID，UUID
     *
     * @return ripId - 主键ID，UUID
     */
    public String getRipid() {
        return ripid;
    }

    /**
     * 设置主键ID，UUID
     *
     * @param ripid 主键ID，UUID
     */
    public void setRipid(String ripid) {
        this.ripid = ripid;
    }

    /**
     * 获取审核流程ID
     *
     * @return rpId - 审核流程ID
     */
    public String getRpid() {
        return rpid;
    }

    /**
     * 设置审核流程ID
     *
     * @param rpid 审核流程ID
     */
    public void setRpid(String rpid) {
        this.rpid = rpid;
    }

    /**
     * 获取课题ID
     *
     * @return topid - 课题ID
     */
    public String getTopid() {
        return topid;
    }

    /**
     * 设置课题ID
     *
     * @param topid 课题ID
     */
    public void setTopid(String topid) {
        this.topid = topid;
    }

    /**
     * 获取审核人ID
     *
     * @return ripUserId - 审核人ID
     */
    public String getRipuserid() {
        return ripuserid;
    }

    /**
     * 设置审核人ID
     *
     * @param ripuserid 审核人ID
     */
    public void setRipuserid(String ripuserid) {
        this.ripuserid = ripuserid;
    }

    /**
     * 获取更新用户ID
     *
     * @return userId - 更新用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置更新用户ID
     *
     * @param userid 更新用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取更新日期
     *
     * @return ripDate - 更新日期
     */
    public String getRipdate() {
        return ripdate;
    }

    /**
     * 设置更新日期
     *
     * @param ripdate 更新日期
     */
    public void setRipdate(String ripdate) {
        this.ripdate = ripdate;
    }
}