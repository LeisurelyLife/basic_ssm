package cn.rt.entity;

import javax.persistence.*;

@Table(name = "petitioncheck")
public class Petitioncheck {
    /**
     * 主键ID，UUID生成
     */
    @Id
    private String petcid;

    /**
     * 申请ID
     */
    private String petid;

    /**
     * 审核类型 a1:审核申请
     */
    private String pcktype;

    /**
     * 课题ID
     */
    private String topid;

    /**
     * 审核到第几步
     */
    private Integer checkstep;

    /**
     * 审核结果，0成功，1失败
     */
    private Integer result;

    /**
     * 审核不通过原因
     */
    private String content;

    /**
     * 获取主键ID，UUID生成
     *
     * @return petcid - 主键ID，UUID生成
     */
    public String getPetcid() {
        return petcid;
    }

    /**
     * 设置主键ID，UUID生成
     *
     * @param petcid 主键ID，UUID生成
     */
    public void setPetcid(String petcid) {
        this.petcid = petcid;
    }

    /**
     * 获取申请ID
     *
     * @return petid - 申请ID
     */
    public String getPetid() {
        return petid;
    }

    /**
     * 设置申请ID
     *
     * @param petid 申请ID
     */
    public void setPetid(String petid) {
        this.petid = petid;
    }

    /**
     * 获取审核类型 a1:审核申请
     *
     * @return pcktype - 审核类型 a1:审核申请
     */
    public String getPcktype() {
        return pcktype;
    }

    /**
     * 设置审核类型 a1:审核申请
     *
     * @param pcktype 审核类型 a1:审核申请
     */
    public void setPcktype(String pcktype) {
        this.pcktype = pcktype;
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
     * 获取审核到第几步
     *
     * @return checkstep - 审核到第几步
     */
    public Integer getCheckstep() {
        return checkstep;
    }

    /**
     * 设置审核到第几步
     *
     * @param checkstep 审核到第几步
     */
    public void setCheckstep(Integer checkstep) {
        this.checkstep = checkstep;
    }

    /**
     * 获取审核结果，0成功，1失败
     *
     * @return result - 审核结果，0成功，1失败
     */
    public Integer getResult() {
        return result;
    }

    /**
     * 设置审核结果，0成功，1失败
     *
     * @param result 审核结果，0成功，1失败
     */
    public void setResult(Integer result) {
        this.result = result;
    }

    /**
     * 获取审核不通过原因
     *
     * @return content - 审核不通过原因
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置审核不通过原因
     *
     * @param content 审核不通过原因
     */
    public void setContent(String content) {
        this.content = content;
    }
}