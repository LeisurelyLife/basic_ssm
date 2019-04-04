package cn.rt.entity;

import javax.persistence.*;

@Table(name = "petition")
public class Petition {
    /**
     * 主键，UUID生成
     */
    @Id
    private String petid;

    /**
     * 申请标题
     */
    private String title;

    /**
     * 0成功， 1失败
     */
    private Integer result;

    /**
     * 失败原因
     */
    private String failreason;

    /**
     * 审核步骤-0学院，1学校，2专家
     */
    private Integer checkstep;

    /**
     * 申请用户ID
     */
    private String userid;

    /**
     * 申请用户申请时所属机构ID
     */
    private String ageid;

    /**
     * 研究课题ID
     */
    private String topid;

    /**
     * 课题所属分类ID
     */
    private String topcid;

    /**
     * 获取主键，UUID生成
     *
     * @return petid - 主键，UUID生成
     */
    public String getPetid() {
        return petid;
    }

    /**
     * 设置主键，UUID生成
     *
     * @param petid 主键，UUID生成
     */
    public void setPetid(String petid) {
        this.petid = petid;
    }

    /**
     * 获取申请标题
     *
     * @return title - 申请标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置申请标题
     *
     * @param title 申请标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取0成功， 1失败
     *
     * @return result - 0成功， 1失败
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置0成功， 1失败
     *
     * @param result 0成功， 1失败
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取失败原因
     *
     * @return failreason - 失败原因
     */
    public String getFailreason() {
        return failreason;
    }

    /**
     * 设置失败原因
     *
     * @param failreason 失败原因
     */
    public void setFailreason(String failreason) {
        this.failreason = failreason;
    }

    /**
     * 获取审核步骤-0学院，1学校，2专家
     *
     * @return checkstep - 审核步骤-0学院，1学校，2专家
     */
    public Integer getCheckstep() {
        return checkstep;
    }

    /**
     * 设置审核步骤-0学院，1学校，2专家
     *
     * @param checkstep 审核步骤-0学院，1学校，2专家
     */
    public void setCheckstep(Integer checkstep) {
        this.checkstep = checkstep;
    }

    /**
     * 获取申请用户ID
     *
     * @return userid - 申请用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置申请用户ID
     *
     * @param userid 申请用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取申请用户申请时所属机构ID
     *
     * @return ageid - 申请用户申请时所属机构ID
     */
    public String getAgeid() {
        return ageid;
    }

    /**
     * 设置申请用户申请时所属机构ID
     *
     * @param ageid 申请用户申请时所属机构ID
     */
    public void setAgeid(String ageid) {
        this.ageid = ageid;
    }

    /**
     * 获取研究课题ID
     *
     * @return topid - 研究课题ID
     */
    public String getTopid() {
        return topid;
    }

    /**
     * 设置研究课题ID
     *
     * @param topid 研究课题ID
     */
    public void setTopid(String topid) {
        this.topid = topid;
    }

    /**
     * 获取课题所属分类ID
     *
     * @return topcid - 课题所属分类ID
     */
    public String getTopcid() {
        return topcid;
    }

    /**
     * 设置课题所属分类ID
     *
     * @param topcid 课题所属分类ID
     */
    public void setTopcid(String topcid) {
        this.topcid = topcid;
    }
}