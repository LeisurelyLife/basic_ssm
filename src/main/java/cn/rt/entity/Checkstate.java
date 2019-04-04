package cn.rt.entity;

import javax.persistence.*;

@Table(name = "checkstate")
public class Checkstate {
    /**
     * 主键ID，UUID
     */
    @Id
    private String ucsid;

    /**
     * 状态流水类型1 用户审核 2 申请审核 
     */
    private Long ucstype;

    /**
     * 审核记录ID（根据流水类别分别取用户审核记录ID或申请审核记录ID）
     */
    private String valid;

    /**
     * 审核用户ID
     */
    private String userid;

    /**
     * 审核结果（1通过 2不通过）
     */
    private Long ucsresult;

    /**
     * 审核说明
     */
    private String ucsinfo;

    /**
     * 审核步骤（按系统配置）
     */
    @Column(name = "rpStep")
    private Long rpstep;

    /**
     * 审核步骤名称
     */
    private String uckstatename;

    /**
     * 创建日期
     */
    private String ucscreatdate;

    /**
     * 获取主键ID，UUID
     *
     * @return ucsid - 主键ID，UUID
     */
    public String getUcsid() {
        return ucsid;
    }

    /**
     * 设置主键ID，UUID
     *
     * @param ucsid 主键ID，UUID
     */
    public void setUcsid(String ucsid) {
        this.ucsid = ucsid;
    }

    /**
     * 获取状态流水类型1 用户审核 2 申请审核 
     *
     * @return ucstype - 状态流水类型1 用户审核 2 申请审核 
     */
    public Long getUcstype() {
        return ucstype;
    }

    /**
     * 设置状态流水类型1 用户审核 2 申请审核 
     *
     * @param ucstype 状态流水类型1 用户审核 2 申请审核 
     */
    public void setUcstype(Long ucstype) {
        this.ucstype = ucstype;
    }

    /**
     * 获取审核记录ID（根据流水类别分别取用户审核记录ID或申请审核记录ID）
     *
     * @return valid - 审核记录ID（根据流水类别分别取用户审核记录ID或申请审核记录ID）
     */
    public String getValid() {
        return valid;
    }

    /**
     * 设置审核记录ID（根据流水类别分别取用户审核记录ID或申请审核记录ID）
     *
     * @param valid 审核记录ID（根据流水类别分别取用户审核记录ID或申请审核记录ID）
     */
    public void setValid(String valid) {
        this.valid = valid;
    }

    /**
     * 获取审核用户ID
     *
     * @return userid - 审核用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置审核用户ID
     *
     * @param userid 审核用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取审核结果（1通过 2不通过）
     *
     * @return ucsresult - 审核结果（1通过 2不通过）
     */
    public Long getUcsresult() {
        return ucsresult;
    }

    /**
     * 设置审核结果（1通过 2不通过）
     *
     * @param ucsresult 审核结果（1通过 2不通过）
     */
    public void setUcsresult(Long ucsresult) {
        this.ucsresult = ucsresult;
    }

    /**
     * 获取审核说明
     *
     * @return ucsinfo - 审核说明
     */
    public String getUcsinfo() {
        return ucsinfo;
    }

    /**
     * 设置审核说明
     *
     * @param ucsinfo 审核说明
     */
    public void setUcsinfo(String ucsinfo) {
        this.ucsinfo = ucsinfo;
    }

    /**
     * 获取审核步骤（按系统配置）
     *
     * @return rpStep - 审核步骤（按系统配置）
     */
    public Long getRpstep() {
        return rpstep;
    }

    /**
     * 设置审核步骤（按系统配置）
     *
     * @param rpstep 审核步骤（按系统配置）
     */
    public void setRpstep(Long rpstep) {
        this.rpstep = rpstep;
    }

    /**
     * 获取审核步骤名称
     *
     * @return uckstatename - 审核步骤名称
     */
    public String getUckstatename() {
        return uckstatename;
    }

    /**
     * 设置审核步骤名称
     *
     * @param uckstatename 审核步骤名称
     */
    public void setUckstatename(String uckstatename) {
        this.uckstatename = uckstatename;
    }

    /**
     * 获取创建日期
     *
     * @return ucscreatdate - 创建日期
     */
    public String getUcscreatdate() {
        return ucscreatdate;
    }

    /**
     * 设置创建日期
     *
     * @param ucscreatdate 创建日期
     */
    public void setUcscreatdate(String ucscreatdate) {
        this.ucscreatdate = ucscreatdate;
    }
}