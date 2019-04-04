package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_app_store_version")
public class TAppStoreVersion {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 应用id
     */
    @Column(name = "app_id")
    private Long appId;

    /**
     * 更新说明
     */
    @Column(name = "release_notes")
    private String releaseNotes;

    /**
     * 安卓安装包下载地址
     */
    @Column(name = "android_installer_package_path")
    private String androidInstallerPackagePath;

    /**
     * 安装包大小(单位为kb)
     */
    @Column(name = "installer_package_size")
    private Long installerPackageSize;

    /**
     * 包名
     */
    @Column(name = "app_package_name")
    private String appPackageName;

    /**
     * 版本号
     */
    @Column(name = "app_version_number")
    private String appVersionNumber;

    /**
     * 应用图标
     */
    @Column(name = "app_icon")
    private String appIcon;

    /**
     * 状态（1：未上线，2：已上线，3：已下架）
     */
    private Short status;

    /**
     * 下载次数
     */
    @Column(name = "download_num")
    private Long downloadNum;

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
     * 是否删除（0：未删除，1：删除）
     */
    @Column(name = "is_delete")
    private Short isDelete;

    /**
     * 应用名
     */
    @Column(name = "app_name")
    private String appName;

    /**
     * 应用名
     */
    @Column(name = "app_name1")
    private String appName1;

    /**
     * ios安装包下载地址
     */
    @Column(name = "ios_installer_package_path")
    private String iosInstallerPackagePath;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取应用id
     *
     * @return app_id - 应用id
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置应用id
     *
     * @param appId 应用id
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取更新说明
     *
     * @return release_notes - 更新说明
     */
    public String getReleaseNotes() {
        return releaseNotes;
    }

    /**
     * 设置更新说明
     *
     * @param releaseNotes 更新说明
     */
    public void setReleaseNotes(String releaseNotes) {
        this.releaseNotes = releaseNotes;
    }

    /**
     * 获取安卓安装包下载地址
     *
     * @return android_installer_package_path - 安卓安装包下载地址
     */
    public String getAndroidInstallerPackagePath() {
        return androidInstallerPackagePath;
    }

    /**
     * 设置安卓安装包下载地址
     *
     * @param androidInstallerPackagePath 安卓安装包下载地址
     */
    public void setAndroidInstallerPackagePath(String androidInstallerPackagePath) {
        this.androidInstallerPackagePath = androidInstallerPackagePath;
    }

    /**
     * 获取安装包大小(单位为kb)
     *
     * @return installer_package_size - 安装包大小(单位为kb)
     */
    public Long getInstallerPackageSize() {
        return installerPackageSize;
    }

    /**
     * 设置安装包大小(单位为kb)
     *
     * @param installerPackageSize 安装包大小(单位为kb)
     */
    public void setInstallerPackageSize(Long installerPackageSize) {
        this.installerPackageSize = installerPackageSize;
    }

    /**
     * 获取包名
     *
     * @return app_package_name - 包名
     */
    public String getAppPackageName() {
        return appPackageName;
    }

    /**
     * 设置包名
     *
     * @param appPackageName 包名
     */
    public void setAppPackageName(String appPackageName) {
        this.appPackageName = appPackageName;
    }

    /**
     * 获取版本号
     *
     * @return app_version_number - 版本号
     */
    public String getAppVersionNumber() {
        return appVersionNumber;
    }

    /**
     * 设置版本号
     *
     * @param appVersionNumber 版本号
     */
    public void setAppVersionNumber(String appVersionNumber) {
        this.appVersionNumber = appVersionNumber;
    }

    /**
     * 获取应用图标
     *
     * @return app_icon - 应用图标
     */
    public String getAppIcon() {
        return appIcon;
    }

    /**
     * 设置应用图标
     *
     * @param appIcon 应用图标
     */
    public void setAppIcon(String appIcon) {
        this.appIcon = appIcon;
    }

    /**
     * 获取状态（1：未上线，2：已上线，3：已下架）
     *
     * @return status - 状态（1：未上线，2：已上线，3：已下架）
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态（1：未上线，2：已上线，3：已下架）
     *
     * @param status 状态（1：未上线，2：已上线，3：已下架）
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取下载次数
     *
     * @return download_num - 下载次数
     */
    public Long getDownloadNum() {
        return downloadNum;
    }

    /**
     * 设置下载次数
     *
     * @param downloadNum 下载次数
     */
    public void setDownloadNum(Long downloadNum) {
        this.downloadNum = downloadNum;
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
     * 获取是否删除（0：未删除，1：删除）
     *
     * @return is_delete - 是否删除（0：未删除，1：删除）
     */
    public Short getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除（0：未删除，1：删除）
     *
     * @param isDelete 是否删除（0：未删除，1：删除）
     */
    public void setIsDelete(Short isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取应用名
     *
     * @return app_name - 应用名
     */
    public String getAppName() {
        return appName;
    }

    /**
     * 设置应用名
     *
     * @param appName 应用名
     */
    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * 获取应用名
     *
     * @return app_name1 - 应用名
     */
    public String getAppName1() {
        return appName1;
    }

    /**
     * 设置应用名
     *
     * @param appName1 应用名
     */
    public void setAppName1(String appName1) {
        this.appName1 = appName1;
    }

    /**
     * 获取ios安装包下载地址
     *
     * @return ios_installer_package_path - ios安装包下载地址
     */
    public String getIosInstallerPackagePath() {
        return iosInstallerPackagePath;
    }

    /**
     * 设置ios安装包下载地址
     *
     * @param iosInstallerPackagePath ios安装包下载地址
     */
    public void setIosInstallerPackagePath(String iosInstallerPackagePath) {
        this.iosInstallerPackagePath = iosInstallerPackagePath;
    }
}