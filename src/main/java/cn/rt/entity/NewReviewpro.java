package cn.rt.entity;

import javax.persistence.*;

@Table(name = "new_reviewpro")
public class NewReviewpro {
    @Id
    @GeneratedValue(generator = "JDBC")
    private String id;

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
     * 审核人ID
     */
    @Column(name = "userId")
    private String userid;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
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
}