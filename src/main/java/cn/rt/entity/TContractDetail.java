package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_contract_detail")
public class TContractDetail {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 合同id
     */
    @Column(name = "contract_id")
    private Long contractId;

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
     * 修改时间
     */
    @Column(name = "modify_time")
    private Date modifyTime;

    /**
     * 是否删除(0:否,1:是)
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 合同详情
     */
    @Column(name = "contract_detail")
    private String contractDetail;

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
     * 获取合同id
     *
     * @return contract_id - 合同id
     */
    public Long getContractId() {
        return contractId;
    }

    /**
     * 设置合同id
     *
     * @param contractId 合同id
     */
    public void setContractId(Long contractId) {
        this.contractId = contractId;
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
     * 获取修改时间
     *
     * @return modify_time - 修改时间
     */
    public Date getModifyTime() {
        return modifyTime;
    }

    /**
     * 设置修改时间
     *
     * @param modifyTime 修改时间
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

    /**
     * 获取合同详情
     *
     * @return contract_detail - 合同详情
     */
    public String getContractDetail() {
        return contractDetail;
    }

    /**
     * 设置合同详情
     *
     * @param contractDetail 合同详情
     */
    public void setContractDetail(String contractDetail) {
        this.contractDetail = contractDetail;
    }
}