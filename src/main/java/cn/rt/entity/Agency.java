package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "agency")
public class Agency {
    /**
     * 主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     */
    @Id
    private String ageid;

    /**
     * 机构父节点ID
     */
    private String agefid;

    /**
     * 机构分类（0学校 1学院）
     */
    private Integer agetype;

    /**
     * 机构名称
     */
    private String agename;

    /**
     * 创建日期
     */
    private Date agecreat;

    /**
     * 更新日期
     */
    private Date ageupdate;

    /**
     * 获取主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     *
     * @return ageid - 主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     */
    public String getAgeid() {
        return ageid;
    }

    /**
     * 设置主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     *
     * @param ageid 主键ID(每4位进行编号，父子关系采用拼接EG：00010002)
     */
    public void setAgeid(String ageid) {
        this.ageid = ageid;
    }

    /**
     * 获取机构父节点ID
     *
     * @return agefid - 机构父节点ID
     */
    public String getAgefid() {
        return agefid;
    }

    /**
     * 设置机构父节点ID
     *
     * @param agefid 机构父节点ID
     */
    public void setAgefid(String agefid) {
        this.agefid = agefid;
    }

    /**
     * 获取机构分类（0学校 1学院）
     *
     * @return agetype - 机构分类（0学校 1学院）
     */
    public Integer getAgetype() {
        return agetype;
    }

    /**
     * 设置机构分类（0学校 1学院）
     *
     * @param agetype 机构分类（0学校 1学院）
     */
    public void setAgetype(Integer agetype) {
        this.agetype = agetype;
    }

    /**
     * 获取机构名称
     *
     * @return agename - 机构名称
     */
    public String getAgename() {
        return agename;
    }

    /**
     * 设置机构名称
     *
     * @param agename 机构名称
     */
    public void setAgename(String agename) {
        this.agename = agename;
    }

    /**
     * 获取创建日期
     *
     * @return agecreat - 创建日期
     */
    public Date getAgecreat() {
        return agecreat;
    }

    /**
     * 设置创建日期
     *
     * @param agecreat 创建日期
     */
    public void setAgecreat(Date agecreat) {
        this.agecreat = agecreat;
    }

    /**
     * 获取更新日期
     *
     * @return ageupdate - 更新日期
     */
    public Date getAgeupdate() {
        return ageupdate;
    }

    /**
     * 设置更新日期
     *
     * @param ageupdate 更新日期
     */
    public void setAgeupdate(Date ageupdate) {
        this.ageupdate = ageupdate;
    }
}