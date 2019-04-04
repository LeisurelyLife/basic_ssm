package cn.rt.entity;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_merchant")
public class TMerchant {
    /**
     * 编号
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 商家名称
     */
    @Column(name = "merchant_name")
    private String merchantName;

    /**
     * 商家模式(1=直营店，2=加盟店，3平台商家，友洗)
     */
    @Column(name = "merchant_mode")
    private Integer merchantMode;

    /**
     * 联系人
     */
    private String contacts;

    /**
     * 门店电话
     */
    @Column(name = "merchant_telephone")
    private String merchantTelephone;

    /**
     * 联系电话
     */
    @Column(name = "contact_number")
    private String contactNumber;

    /**
     * 门店地址
     */
    @Column(name = "merchant_address")
    private String merchantAddress;

    /**
     * 省
     */
    private Integer province;

    /**
     * 市
     */
    private Integer city;

    /**
     * 区
     */
    private Integer region;

    /**
     * 门店经度
     */
    private BigDecimal lng;

    /**
     * 门店纬度
     */
    private BigDecimal lat;

    /**
     * 门店店面图
     */
    @Column(name = "store_picture")
    private String storePicture;

    /**
     * 店内环境图
     */
    @Column(name = "store_environment")
    private String storeEnvironment;

    /**
     * 店铺商标图
     */
    @Column(name = "store_logo")
    private String storeLogo;

    /**
     * 总状态(1待审核 2正常 3禁用[不能登录][审核中等] 4待整顿[调整店铺违规内容]) 5驳回，不通过
     */
    private Integer status;

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
     * 是否删除(1.是 0.否)
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 审核状态(1待审核 2正常 3禁用[不能登录] 4待整顿[调整店铺违规内容])
     */
    @Column(name = "pass_status")
    private Boolean passStatus;

    /**
     * 审核不通过理由
     */
    @Column(name = "reject_reason")
    private String rejectReason;

    /**
     * IM通讯token
     */
    @Column(name = "im_token")
    private String imToken;

    /**
     * yryc-IM通讯token
     */
    @Column(name = "yryc_im_token")
    private String yrycImToken;

    /**
     * yryc-IM通讯uid
     */
    @Column(name = "yryc_im_uid")
    private String yrycImUid;

    /**
     * 审核通过时间
     */
    @Column(name = "pass_time")
    private Date passTime;

    /**
     * 数据隔离 0.正式 1 测试
     */
    private Integer isolation;

    /**
     * 营业状态：1营业中2休息中
     */
    @Column(name = "business_status")
    private Integer businessStatus;

    /**
     * 商家冻结状态
     */
    @Column(name = "frozen_status")
    private Integer frozenStatus;

    /**
     * 商户门店名称（1.3.3版本以后使用merchant_name）
     */
    @Column(name = "merchant_store_name")
    private String merchantStoreName;

    /**
     * 是否入驻(1.是 0.否)
     */
    @Column(name = "is_enter")
    private Integer isEnter;

    /**
     * 是否支持上门服务(1.是 0.否)
     */
    @Column(name = "door_to_door")
    private Integer doorToDoor;

    /**
     * 商家标识
     */
    @Column(name = "merchant_identify")
    private String merchantIdentify;

    /**
     * 营业开始时间
     */
    @Column(name = "business_start")
    private String businessStart;

    /**
     * 营业结束时间
     */
    @Column(name = "business_end")
    private String businessEnd;

    /**
     * 营业日(1-7代表星期几中间逗号隔开)
     */
    @Column(name = "business_day")
    private String businessDay;

    /**
     * 公共平台商家App的id
     */
    @Column(name = "app_id")
    private String appId;

    /**
     * 公共平台商家秘钥
     */
    private String secret;

    /**
     * 平台商家通知地址
     */
    @Column(name = "notice_url")
    private String noticeUrl;

    /**
     * 商家字段（app商家右上角提示用）
     */
    @Column(name = "merchant_tip")
    private String merchantTip;

    /**
     * 轨迹logo图片地址
     */
    @Column(name = "path_logo")
    private String pathLogo;

    /**
     * 商家经纬度类型
     */
    private String coordsys;

    /**
     * 商家类型(1=综合，2=快修，3=4S)
     */
    @Column(name = "merchant_type")
    private Integer merchantType;

    /**
     * 商家品牌ID
     */
    @Column(name = "merchant_brand_id")
    private Long merchantBrandId;

    /**
     * 高德地图唯一标识
     */
    @Column(name = "gaode_id")
    private String gaodeId;

    /**
     * 获取编号
     *
     * @return id - 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取商家名称
     *
     * @return merchant_name - 商家名称
     */
    public String getMerchantName() {
        return merchantName;
    }

    /**
     * 设置商家名称
     *
     * @param merchantName 商家名称
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }

    /**
     * 获取商家模式(1=直营店，2=加盟店，3平台商家，友洗)
     *
     * @return merchant_mode - 商家模式(1=直营店，2=加盟店，3平台商家，友洗)
     */
    public Integer getMerchantMode() {
        return merchantMode;
    }

    /**
     * 设置商家模式(1=直营店，2=加盟店，3平台商家，友洗)
     *
     * @param merchantMode 商家模式(1=直营店，2=加盟店，3平台商家，友洗)
     */
    public void setMerchantMode(Integer merchantMode) {
        this.merchantMode = merchantMode;
    }

    /**
     * 获取联系人
     *
     * @return contacts - 联系人
     */
    public String getContacts() {
        return contacts;
    }

    /**
     * 设置联系人
     *
     * @param contacts 联系人
     */
    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    /**
     * 获取门店电话
     *
     * @return merchant_telephone - 门店电话
     */
    public String getMerchantTelephone() {
        return merchantTelephone;
    }

    /**
     * 设置门店电话
     *
     * @param merchantTelephone 门店电话
     */
    public void setMerchantTelephone(String merchantTelephone) {
        this.merchantTelephone = merchantTelephone;
    }

    /**
     * 获取联系电话
     *
     * @return contact_number - 联系电话
     */
    public String getContactNumber() {
        return contactNumber;
    }

    /**
     * 设置联系电话
     *
     * @param contactNumber 联系电话
     */
    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    /**
     * 获取门店地址
     *
     * @return merchant_address - 门店地址
     */
    public String getMerchantAddress() {
        return merchantAddress;
    }

    /**
     * 设置门店地址
     *
     * @param merchantAddress 门店地址
     */
    public void setMerchantAddress(String merchantAddress) {
        this.merchantAddress = merchantAddress;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public Integer getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return region - 区
     */
    public Integer getRegion() {
        return region;
    }

    /**
     * 设置区
     *
     * @param region 区
     */
    public void setRegion(Integer region) {
        this.region = region;
    }

    /**
     * 获取门店经度
     *
     * @return lng - 门店经度
     */
    public BigDecimal getLng() {
        return lng;
    }

    /**
     * 设置门店经度
     *
     * @param lng 门店经度
     */
    public void setLng(BigDecimal lng) {
        this.lng = lng;
    }

    /**
     * 获取门店纬度
     *
     * @return lat - 门店纬度
     */
    public BigDecimal getLat() {
        return lat;
    }

    /**
     * 设置门店纬度
     *
     * @param lat 门店纬度
     */
    public void setLat(BigDecimal lat) {
        this.lat = lat;
    }

    /**
     * 获取门店店面图
     *
     * @return store_picture - 门店店面图
     */
    public String getStorePicture() {
        return storePicture;
    }

    /**
     * 设置门店店面图
     *
     * @param storePicture 门店店面图
     */
    public void setStorePicture(String storePicture) {
        this.storePicture = storePicture;
    }

    /**
     * 获取店内环境图
     *
     * @return store_environment - 店内环境图
     */
    public String getStoreEnvironment() {
        return storeEnvironment;
    }

    /**
     * 设置店内环境图
     *
     * @param storeEnvironment 店内环境图
     */
    public void setStoreEnvironment(String storeEnvironment) {
        this.storeEnvironment = storeEnvironment;
    }

    /**
     * 获取店铺商标图
     *
     * @return store_logo - 店铺商标图
     */
    public String getStoreLogo() {
        return storeLogo;
    }

    /**
     * 设置店铺商标图
     *
     * @param storeLogo 店铺商标图
     */
    public void setStoreLogo(String storeLogo) {
        this.storeLogo = storeLogo;
    }

    /**
     * 获取总状态(1待审核 2正常 3禁用[不能登录][审核中等] 4待整顿[调整店铺违规内容]) 5驳回，不通过
     *
     * @return status - 总状态(1待审核 2正常 3禁用[不能登录][审核中等] 4待整顿[调整店铺违规内容]) 5驳回，不通过
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置总状态(1待审核 2正常 3禁用[不能登录][审核中等] 4待整顿[调整店铺违规内容]) 5驳回，不通过
     *
     * @param status 总状态(1待审核 2正常 3禁用[不能登录][审核中等] 4待整顿[调整店铺违规内容]) 5驳回，不通过
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * 获取是否删除(1.是 0.否)
     *
     * @return is_delete - 是否删除(1.是 0.否)
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除(1.是 0.否)
     *
     * @param isDelete 是否删除(1.是 0.否)
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取审核状态(1待审核 2正常 3禁用[不能登录] 4待整顿[调整店铺违规内容])
     *
     * @return pass_status - 审核状态(1待审核 2正常 3禁用[不能登录] 4待整顿[调整店铺违规内容])
     */
    public Boolean getPassStatus() {
        return passStatus;
    }

    /**
     * 设置审核状态(1待审核 2正常 3禁用[不能登录] 4待整顿[调整店铺违规内容])
     *
     * @param passStatus 审核状态(1待审核 2正常 3禁用[不能登录] 4待整顿[调整店铺违规内容])
     */
    public void setPassStatus(Boolean passStatus) {
        this.passStatus = passStatus;
    }

    /**
     * 获取审核不通过理由
     *
     * @return reject_reason - 审核不通过理由
     */
    public String getRejectReason() {
        return rejectReason;
    }

    /**
     * 设置审核不通过理由
     *
     * @param rejectReason 审核不通过理由
     */
    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason;
    }

    /**
     * 获取IM通讯token
     *
     * @return im_token - IM通讯token
     */
    public String getImToken() {
        return imToken;
    }

    /**
     * 设置IM通讯token
     *
     * @param imToken IM通讯token
     */
    public void setImToken(String imToken) {
        this.imToken = imToken;
    }

    /**
     * 获取yryc-IM通讯token
     *
     * @return yryc_im_token - yryc-IM通讯token
     */
    public String getYrycImToken() {
        return yrycImToken;
    }

    /**
     * 设置yryc-IM通讯token
     *
     * @param yrycImToken yryc-IM通讯token
     */
    public void setYrycImToken(String yrycImToken) {
        this.yrycImToken = yrycImToken;
    }

    /**
     * 获取yryc-IM通讯uid
     *
     * @return yryc_im_uid - yryc-IM通讯uid
     */
    public String getYrycImUid() {
        return yrycImUid;
    }

    /**
     * 设置yryc-IM通讯uid
     *
     * @param yrycImUid yryc-IM通讯uid
     */
    public void setYrycImUid(String yrycImUid) {
        this.yrycImUid = yrycImUid;
    }

    /**
     * 获取审核通过时间
     *
     * @return pass_time - 审核通过时间
     */
    public Date getPassTime() {
        return passTime;
    }

    /**
     * 设置审核通过时间
     *
     * @param passTime 审核通过时间
     */
    public void setPassTime(Date passTime) {
        this.passTime = passTime;
    }

    /**
     * 获取数据隔离 0.正式 1 测试
     *
     * @return isolation - 数据隔离 0.正式 1 测试
     */
    public Integer getIsolation() {
        return isolation;
    }

    /**
     * 设置数据隔离 0.正式 1 测试
     *
     * @param isolation 数据隔离 0.正式 1 测试
     */
    public void setIsolation(Integer isolation) {
        this.isolation = isolation;
    }

    /**
     * 获取营业状态：1营业中2休息中
     *
     * @return business_status - 营业状态：1营业中2休息中
     */
    public Integer getBusinessStatus() {
        return businessStatus;
    }

    /**
     * 设置营业状态：1营业中2休息中
     *
     * @param businessStatus 营业状态：1营业中2休息中
     */
    public void setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
    }

    /**
     * 获取商家冻结状态
     *
     * @return frozen_status - 商家冻结状态
     */
    public Integer getFrozenStatus() {
        return frozenStatus;
    }

    /**
     * 设置商家冻结状态
     *
     * @param frozenStatus 商家冻结状态
     */
    public void setFrozenStatus(Integer frozenStatus) {
        this.frozenStatus = frozenStatus;
    }

    /**
     * 获取商户门店名称（1.3.3版本以后使用merchant_name）
     *
     * @return merchant_store_name - 商户门店名称（1.3.3版本以后使用merchant_name）
     */
    public String getMerchantStoreName() {
        return merchantStoreName;
    }

    /**
     * 设置商户门店名称（1.3.3版本以后使用merchant_name）
     *
     * @param merchantStoreName 商户门店名称（1.3.3版本以后使用merchant_name）
     */
    public void setMerchantStoreName(String merchantStoreName) {
        this.merchantStoreName = merchantStoreName;
    }

    /**
     * 获取是否入驻(1.是 0.否)
     *
     * @return is_enter - 是否入驻(1.是 0.否)
     */
    public Integer getIsEnter() {
        return isEnter;
    }

    /**
     * 设置是否入驻(1.是 0.否)
     *
     * @param isEnter 是否入驻(1.是 0.否)
     */
    public void setIsEnter(Integer isEnter) {
        this.isEnter = isEnter;
    }

    /**
     * 获取是否支持上门服务(1.是 0.否)
     *
     * @return door_to_door - 是否支持上门服务(1.是 0.否)
     */
    public Integer getDoorToDoor() {
        return doorToDoor;
    }

    /**
     * 设置是否支持上门服务(1.是 0.否)
     *
     * @param doorToDoor 是否支持上门服务(1.是 0.否)
     */
    public void setDoorToDoor(Integer doorToDoor) {
        this.doorToDoor = doorToDoor;
    }

    /**
     * 获取商家标识
     *
     * @return merchant_identify - 商家标识
     */
    public String getMerchantIdentify() {
        return merchantIdentify;
    }

    /**
     * 设置商家标识
     *
     * @param merchantIdentify 商家标识
     */
    public void setMerchantIdentify(String merchantIdentify) {
        this.merchantIdentify = merchantIdentify;
    }

    /**
     * 获取营业开始时间
     *
     * @return business_start - 营业开始时间
     */
    public String getBusinessStart() {
        return businessStart;
    }

    /**
     * 设置营业开始时间
     *
     * @param businessStart 营业开始时间
     */
    public void setBusinessStart(String businessStart) {
        this.businessStart = businessStart;
    }

    /**
     * 获取营业结束时间
     *
     * @return business_end - 营业结束时间
     */
    public String getBusinessEnd() {
        return businessEnd;
    }

    /**
     * 设置营业结束时间
     *
     * @param businessEnd 营业结束时间
     */
    public void setBusinessEnd(String businessEnd) {
        this.businessEnd = businessEnd;
    }

    /**
     * 获取营业日(1-7代表星期几中间逗号隔开)
     *
     * @return business_day - 营业日(1-7代表星期几中间逗号隔开)
     */
    public String getBusinessDay() {
        return businessDay;
    }

    /**
     * 设置营业日(1-7代表星期几中间逗号隔开)
     *
     * @param businessDay 营业日(1-7代表星期几中间逗号隔开)
     */
    public void setBusinessDay(String businessDay) {
        this.businessDay = businessDay;
    }

    /**
     * 获取公共平台商家App的id
     *
     * @return app_id - 公共平台商家App的id
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置公共平台商家App的id
     *
     * @param appId 公共平台商家App的id
     */
    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * 获取公共平台商家秘钥
     *
     * @return secret - 公共平台商家秘钥
     */
    public String getSecret() {
        return secret;
    }

    /**
     * 设置公共平台商家秘钥
     *
     * @param secret 公共平台商家秘钥
     */
    public void setSecret(String secret) {
        this.secret = secret;
    }

    /**
     * 获取平台商家通知地址
     *
     * @return notice_url - 平台商家通知地址
     */
    public String getNoticeUrl() {
        return noticeUrl;
    }

    /**
     * 设置平台商家通知地址
     *
     * @param noticeUrl 平台商家通知地址
     */
    public void setNoticeUrl(String noticeUrl) {
        this.noticeUrl = noticeUrl;
    }

    /**
     * 获取商家字段（app商家右上角提示用）
     *
     * @return merchant_tip - 商家字段（app商家右上角提示用）
     */
    public String getMerchantTip() {
        return merchantTip;
    }

    /**
     * 设置商家字段（app商家右上角提示用）
     *
     * @param merchantTip 商家字段（app商家右上角提示用）
     */
    public void setMerchantTip(String merchantTip) {
        this.merchantTip = merchantTip;
    }

    /**
     * 获取轨迹logo图片地址
     *
     * @return path_logo - 轨迹logo图片地址
     */
    public String getPathLogo() {
        return pathLogo;
    }

    /**
     * 设置轨迹logo图片地址
     *
     * @param pathLogo 轨迹logo图片地址
     */
    public void setPathLogo(String pathLogo) {
        this.pathLogo = pathLogo;
    }

    /**
     * 获取商家经纬度类型
     *
     * @return coordsys - 商家经纬度类型
     */
    public String getCoordsys() {
        return coordsys;
    }

    /**
     * 设置商家经纬度类型
     *
     * @param coordsys 商家经纬度类型
     */
    public void setCoordsys(String coordsys) {
        this.coordsys = coordsys;
    }

    /**
     * 获取商家类型(1=综合，2=快修，3=4S)
     *
     * @return merchant_type - 商家类型(1=综合，2=快修，3=4S)
     */
    public Integer getMerchantType() {
        return merchantType;
    }

    /**
     * 设置商家类型(1=综合，2=快修，3=4S)
     *
     * @param merchantType 商家类型(1=综合，2=快修，3=4S)
     */
    public void setMerchantType(Integer merchantType) {
        this.merchantType = merchantType;
    }

    /**
     * 获取商家品牌ID
     *
     * @return merchant_brand_id - 商家品牌ID
     */
    public Long getMerchantBrandId() {
        return merchantBrandId;
    }

    /**
     * 设置商家品牌ID
     *
     * @param merchantBrandId 商家品牌ID
     */
    public void setMerchantBrandId(Long merchantBrandId) {
        this.merchantBrandId = merchantBrandId;
    }

    /**
     * 获取高德地图唯一标识
     *
     * @return gaode_id - 高德地图唯一标识
     */
    public String getGaodeId() {
        return gaodeId;
    }

    /**
     * 设置高德地图唯一标识
     *
     * @param gaodeId 高德地图唯一标识
     */
    public void setGaodeId(String gaodeId) {
        this.gaodeId = gaodeId;
    }
}