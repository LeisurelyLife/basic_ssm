package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "topic")
public class Topic {
    /**
     * 主键ID，使用UUID生成
     */
    @Id
    private String topid;

    /**
     * 研究课题分类表
     */
    private String topcid;

    /**
     * 研究课题标题
     */
    private String title;

    /**
     * 摘要信息
     */
    private String summarize;

    /**
     * 创建时间
     */
    private Date topcreate;

    /**
     * 课题申请截止时间
     */
    private Date endtime;

    /**
     * 获取主键ID，使用UUID生成
     *
     * @return topid - 主键ID，使用UUID生成
     */
    public String getTopid() {
        return topid;
    }

    /**
     * 设置主键ID，使用UUID生成
     *
     * @param topid 主键ID，使用UUID生成
     */
    public void setTopid(String topid) {
        this.topid = topid;
    }

    /**
     * 获取研究课题分类表
     *
     * @return topcid - 研究课题分类表
     */
    public String getTopcid() {
        return topcid;
    }

    /**
     * 设置研究课题分类表
     *
     * @param topcid 研究课题分类表
     */
    public void setTopcid(String topcid) {
        this.topcid = topcid;
    }

    /**
     * 获取研究课题标题
     *
     * @return title - 研究课题标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置研究课题标题
     *
     * @param title 研究课题标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取摘要信息
     *
     * @return summarize - 摘要信息
     */
    public String getSummarize() {
        return summarize;
    }

    /**
     * 设置摘要信息
     *
     * @param summarize 摘要信息
     */
    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    /**
     * 获取创建时间
     *
     * @return topcreate - 创建时间
     */
    public Date getTopcreate() {
        return topcreate;
    }

    /**
     * 设置创建时间
     *
     * @param topcreate 创建时间
     */
    public void setTopcreate(Date topcreate) {
        this.topcreate = topcreate;
    }

    /**
     * 获取课题申请截止时间
     *
     * @return endtime - 课题申请截止时间
     */
    public Date getEndtime() {
        return endtime;
    }

    /**
     * 设置课题申请截止时间
     *
     * @param endtime 课题申请截止时间
     */
    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }
}