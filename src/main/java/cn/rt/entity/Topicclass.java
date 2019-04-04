package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "topicclass")
public class Topicclass {
    /**
     * 主键ID（树结构每4位进行编号，父子关系采用拼接EG：00010002）
     */
    @Id
    private String topcid;

    /**
     * 父类ID
     */
    private String topcfid;

    /**
     * 类别名称
     */
    private String topcname;

    /**
     * 描述说明
     */
    private String topcnote;

    /**
     * 操作用户ID
     */
    private String userid;

    /**
     * 更新日期
     */
    private Date topcupdate;

    /**
     * 创建日期
     */
    private Date topccreate;

    /**
     * 生效标志(0未启用 1已启用 2禁用)
     */
    private Integer topcmark;

    /**
     * 获取主键ID（树结构每4位进行编号，父子关系采用拼接EG：00010002）
     *
     * @return topcid - 主键ID（树结构每4位进行编号，父子关系采用拼接EG：00010002）
     */
    public String getTopcid() {
        return topcid;
    }

    /**
     * 设置主键ID（树结构每4位进行编号，父子关系采用拼接EG：00010002）
     *
     * @param topcid 主键ID（树结构每4位进行编号，父子关系采用拼接EG：00010002）
     */
    public void setTopcid(String topcid) {
        this.topcid = topcid;
    }

    /**
     * 获取父类ID
     *
     * @return topcfid - 父类ID
     */
    public String getTopcfid() {
        return topcfid;
    }

    /**
     * 设置父类ID
     *
     * @param topcfid 父类ID
     */
    public void setTopcfid(String topcfid) {
        this.topcfid = topcfid;
    }

    /**
     * 获取类别名称
     *
     * @return topcname - 类别名称
     */
    public String getTopcname() {
        return topcname;
    }

    /**
     * 设置类别名称
     *
     * @param topcname 类别名称
     */
    public void setTopcname(String topcname) {
        this.topcname = topcname;
    }

    /**
     * 获取描述说明
     *
     * @return topcnote - 描述说明
     */
    public String getTopcnote() {
        return topcnote;
    }

    /**
     * 设置描述说明
     *
     * @param topcnote 描述说明
     */
    public void setTopcnote(String topcnote) {
        this.topcnote = topcnote;
    }

    /**
     * 获取操作用户ID
     *
     * @return userid - 操作用户ID
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置操作用户ID
     *
     * @param userid 操作用户ID
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取更新日期
     *
     * @return topcupdate - 更新日期
     */
    public Date getTopcupdate() {
        return topcupdate;
    }

    /**
     * 设置更新日期
     *
     * @param topcupdate 更新日期
     */
    public void setTopcupdate(Date topcupdate) {
        this.topcupdate = topcupdate;
    }

    /**
     * 获取创建日期
     *
     * @return topccreate - 创建日期
     */
    public Date getTopccreate() {
        return topccreate;
    }

    /**
     * 设置创建日期
     *
     * @param topccreate 创建日期
     */
    public void setTopccreate(Date topccreate) {
        this.topccreate = topccreate;
    }

    /**
     * 获取生效标志(0未启用 1已启用 2禁用)
     *
     * @return topcmark - 生效标志(0未启用 1已启用 2禁用)
     */
    public Integer getTopcmark() {
        return topcmark;
    }

    /**
     * 设置生效标志(0未启用 1已启用 2禁用)
     *
     * @param topcmark 生效标志(0未启用 1已启用 2禁用)
     */
    public void setTopcmark(Integer topcmark) {
        this.topcmark = topcmark;
    }
}