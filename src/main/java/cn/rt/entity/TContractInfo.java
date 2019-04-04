package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_contract_info")
public class TContractInfo {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 合同code
     */
    @Column(name = "contract_code")
    private String contractCode;

    /**
     * 合同描述
     */
    @Column(name = "contract_description")
    private String contractDescription;

    /**
     * 版本
     */
    private Integer version;

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
     * 是否删除(0:否,1:是)
     */
    @Column(name = "is_delete")
    private Integer isDelete;

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
     * 获取标题
     *
     * @return title - 标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置标题
     *
     * @param title 标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取合同code
     *
     * @return contract_code - 合同code
     */
    public String getContractCode() {
        return contractCode;
    }

    /**
     * 设置合同code
     *
     * @param contractCode 合同code
     */
    public void setContractCode(String contractCode) {
        this.contractCode = contractCode;
    }

    /**
     * 获取合同描述
     *
     * @return contract_description - 合同描述
     */
    public String getContractDescription() {
        return contractDescription;
    }

    /**
     * 设置合同描述
     *
     * @param contractDescription 合同描述
     */
    public void setContractDescription(String contractDescription) {
        this.contractDescription = contractDescription;
    }

    /**
     * 获取版本
     *
     * @return version - 版本
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 设置版本
     *
     * @param version 版本
     */
    public void setVersion(Integer version) {
        this.version = version;
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
     * 获取是否删除(0:否,1:是)
     *
     * @return is_delete - 是否删除(0:否,1:是)
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除(0:否,1:是)
     *
     * @param isDelete 是否删除(0:否,1:是)
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}