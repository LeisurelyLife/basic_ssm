package cn.rt.entity;

import javax.persistence.*;

@Table(name = "reviewpro")
public class Reviewpro {
    /**
     * 主键ID，UUID
     */
    @Id
    @Column(name = "rpId")
    private String rpid;

    /**
     * 所属课题ID
     */
    private String topid;

    /**
     * 审核步骤(1至20)
     */
    @Column(name = "rpStep")
    private Integer rpstep;

    /**
     * 步骤名称
     */
    @Column(name = "rpName")
    private String rpname;

    /**
     * 审核人ID
     */
    @Column(name = "userId")
    private String userid;

    /**
     * 更新日期
     */
    @Column(name = "rpDate")
    private String rpdate;

    /**
     * 获取主键ID，UUID
     *
     * @return rpId - 主键ID，UUID
     */
    public String getRpid() {
        return rpid;
    }

    /**
     * 设置主键ID，UUID
     *
     * @param rpid 主键ID，UUID
     */
    public void setRpid(String rpid) {
        this.rpid = rpid;
    }

    /**
     * 获取所属课题ID
     *
     * @return topid - 所属课题ID
     */
    public String getTopid() {
        return topid;
    }

    /**
     * 设置所属课题ID
     *
     * @param topid 所属课题ID
     */
    public void setTopid(String topid) {
        this.topid = topid;
    }

    /**
     * 获取审核步骤(1至20)
     *
     * @return rpStep - 审核步骤(1至20)
     */
    public Integer getRpstep() {
        return rpstep;
    }

    /**
     * 设置审核步骤(1至20)
     *
     * @param rpstep 审核步骤(1至20)
     */
    public void setRpstep(Integer rpstep) {
        this.rpstep = rpstep;
    }

    /**
     * 获取步骤名称
     *
     * @return rpName - 步骤名称
     */
    public String getRpname() {
        return rpname;
    }

    /**
     * 设置步骤名称
     *
     * @param rpname 步骤名称
     */
    public void setRpname(String rpname) {
        this.rpname = rpname;
    }

    /**
     * 获取审核人ID
     *
     * @return userId - 审核人ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置审核人ID
     *
     * @param userid 审核人ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取更新日期
     *
     * @return rpDate - 更新日期
     */
    public String getRpdate() {
        return rpdate;
    }

    /**
     * 设置更新日期
     *
     * @param rpdate 更新日期
     */
    public void setRpdate(String rpdate) {
        this.rpdate = rpdate;
    }
}