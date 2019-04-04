package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_app_image")
public class TAppImage {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 应用id
     */
    @Column(name = "app_version_id")
    private Long appVersionId;

    /**
     * 应用截图url
     */
    @Column(name = "app_image")
    private String appImage;

    /**
     * 坐标（第几张图片）
     */
    private Short index;

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
     * @return app_version_id - 应用id
     */
    public Long getAppVersionId() {
        return appVersionId;
    }

    /**
     * 设置应用id
     *
     * @param appVersionId 应用id
     */
    public void setAppVersionId(Long appVersionId) {
        this.appVersionId = appVersionId;
    }

    /**
     * 获取应用截图url
     *
     * @return app_image - 应用截图url
     */
    public String getAppImage() {
        return appImage;
    }

    /**
     * 设置应用截图url
     *
     * @param appImage 应用截图url
     */
    public void setAppImage(String appImage) {
        this.appImage = appImage;
    }

    /**
     * 获取坐标（第几张图片）
     *
     * @return index - 坐标（第几张图片）
     */
    public Short getIndex() {
        return index;
    }

    /**
     * 设置坐标（第几张图片）
     *
     * @param index 坐标（第几张图片）
     */
    public void setIndex(Short index) {
        this.index = index;
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
}