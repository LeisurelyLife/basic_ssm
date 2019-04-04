package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_app_store")
public class TAppStore {
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 应用名称
     */
    @Column(name = "app_name")
    private String appName;

    /**
     * 应用提供方
     */
    @Column(name = "app_provider")
    private String appProvider;

    /**
     * 应用简介
     */
    @Column(name = "app_synopsis")
    private String appSynopsis;

    /**
     * 应用标题（一句话简介）
     */
    @Column(name = "app_title")
    private String appTitle;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 最后修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 是否删除(0:未删除，1：删除)
     */
    @Column(name = "is_delete")
    private Short isDelete;

    @Column(name = "download_num")
    private Long downloadNum;

    /**
     * 下载次数
     */
    @Column(name = "download_num1")
    private Long downloadNum1;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取应用名称
     *
     * @return app_name - 应用名称
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置应用名称
     *
     * @param appName 应用名称
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 获取应用提供方
     *
     * @return app_provider - 应用提供方
     */
    public String getAppProvider() {
        return appProvider;
    }

    /**
     * 设置应用提供方
     *
     * @param appProvider 应用提供方
     */
    public void setAppProvider(String appProvider) {
        this.appProvider = appProvider;
    }

    /**
     * 获取应用简介
     *
     * @return app_synopsis - 应用简介
     */
    public String getAppSynopsis() {
        return appSynopsis;
    }

    /**
     * 设置应用简介
     *
     * @param appSynopsis 应用简介
     */
    public void setAppSynopsis(String appSynopsis) {
        this.appSynopsis = appSynopsis;
    }

    /**
     * 获取应用标题（一句话简介）
     *
     * @return app_title - 应用标题（一句话简介）
     */
    public String getAppTitle() {
        return appTitle;
    }

    /**
     * 设置应用标题（一句话简介）
     *
     * @param appTitle 应用标题（一句话简介）
     */
    public void setAppTitle(String appTitle) {
        this.appTitle = appTitle;
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
     * 获取最后修改时间
     *
     * @return modify_time - 最后修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置最后修改时间
     *
     * @param modifyTime 最后修改时间
     */
    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    /**
     * 获取是否删除(0:未删除，1：删除)
     *
     * @return is_delete - 是否删除(0:未删除，1：删除)
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除(0:未删除，1：删除)
     *
     * @param isDelete 是否删除(0:未删除，1：删除)
     */
    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * @return download_num
     */
    public Long getDownloadNum() {
        return downloadNum;
    }

    /**
     * @param downloadNum
     */
    public void setDownloadNum(Long downloadNum) {
        this.downloadNum = downloadNum;
    }

    /**
     * 获取下载次数
     *
     * @return download_num1 - 下载次数
     */
    public Long getDownloadNum1() {
        return downloadNum1;
    }

    /**
     * 设置下载次数
     *
     * @param downloadNum1 下载次数
     */
    public void setDownloadNum1(Long downloadNum1) {
        this.downloadNum1 = downloadNum1;
    }
}