package cn.rt.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_merchant_promotion")
public class TMerchantPromotion {
    /**
     * 商家推广ID
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;

    /**
     * 推广编号
     */
    @Column(name = "promotion_no")
    private String promotionNo;

    /**
     * 商家ID
     */
    @Column(name = "merchant_id")
    private Long merchantId;

    /**
     * 商家名称
     */
    @Column(name = "merchant_name")
    private String merchantName;

    /**
     * 推广模式（1=系统智能，2=自定义）
     */
    @Column(name = "promotion_mode")
    private Integer promotionMode;

    /**
     * 推广金额(分)
     */
    @Column(name = "promotion_amount")
    private Long promotionAmount;

    /**
     * 车龄类型(1 = 1年一下 ，2 = 1-3年 ， 3 = 3-6年 ， 4 = 6年以上)
     */
    @Column(name = "car_age_type")
    private Integer carAgeType;

    /**
     * 是否删除（0=否，1=是）
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 状态(1=待支付,2=已支付/推广中,3=推广完成,4=已取消)
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
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 支付方式
     */
    @Column(name = "pay_type")
    private Integer payType;

    /**
     * 支付单号
     */
    @Column(name = "pay_no")
    private String payNo;

    /**
     * 推广账户抵扣金额（单位:分）
     */
    @Column(name = "promotion_account_amount")
    private Long promotionAccountAmount;

    /**
     * 预计数量
     */
    @Column(name = "prediction_promotion_num")
    private Long predictionPromotionNum;

    /**
     * 已推广数量
     */
    @Column(name = "promotion_num")
    private Long promotionNum;

    /**
     * 推广类型(1=增加商家展示量,2=短信优惠券推广)
     */
    @Column(name = "promotion_type")
    private Integer promotionType;

    /**
     * 最低车价（单位：万）
     */
    @Column(name = "car_price_min")
    private Integer carPriceMin;

    /**
     * 最高车价（单位：万）
     */
    @Column(name = "car_price_max")
    private Integer carPriceMax;

    /**
     * 附近距离(km/公里)
     */
    @Column(name = "nearby_distance")
    private Integer nearbyDistance;

    /**
     * 开始推广时间（周期为一天）
     */
    @Column(name = "promotion_start_time")
    private Date promotionStartTime;

    /**
     * 结束推广时间（周期为一天）
     */
    @Column(name = "promotion_end_time")
    private Date promotionEndTime;

    /**
     * 获取商家推广ID
     *
     * @return id - 商家推广ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置商家推广ID
     *
     * @param id 商家推广ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取推广编号
     *
     * @return promotion_no - 推广编号
     */
    public String getPromotionNo() {
        return promotionNo;
    }

    /**
     * 设置推广编号
     *
     * @param promotionNo 推广编号
     */
    public void setPromotionNo(String promotionNo) {
        this.promotionNo = promotionNo;
    }

    /**
     * 获取商家ID
     *
     * @return merchant_id - 商家ID
     */
    public Long getMerchantId() {
        return merchantId;
    }

    /**
     * 设置商家ID
     *
     * @param merchantId 商家ID
     */
    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
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
     * 获取推广模式（1=系统智能，2=自定义）
     *
     * @return promotion_mode - 推广模式（1=系统智能，2=自定义）
     */
    public Integer getPromotionMode() {
        return promotionMode;
    }

    /**
     * 设置推广模式（1=系统智能，2=自定义）
     *
     * @param promotionMode 推广模式（1=系统智能，2=自定义）
     */
    public void setPromotionMode(Integer promotionMode) {
        this.promotionMode = promotionMode;
    }

    /**
     * 获取推广金额(分)
     *
     * @return promotion_amount - 推广金额(分)
     */
    public Long getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * 设置推广金额(分)
     *
     * @param promotionAmount 推广金额(分)
     */
    public void setPromotionAmount(Long promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * 获取车龄类型(1 = 1年一下 ，2 = 1-3年 ， 3 = 3-6年 ， 4 = 6年以上)
     *
     * @return car_age_type - 车龄类型(1 = 1年一下 ，2 = 1-3年 ， 3 = 3-6年 ， 4 = 6年以上)
     */
    public Integer getCarAgeType() {
        return carAgeType;
    }

    /**
     * 设置车龄类型(1 = 1年一下 ，2 = 1-3年 ， 3 = 3-6年 ， 4 = 6年以上)
     *
     * @param carAgeType 车龄类型(1 = 1年一下 ，2 = 1-3年 ， 3 = 3-6年 ， 4 = 6年以上)
     */
    public void setCarAgeType(Integer carAgeType) {
        this.carAgeType = carAgeType;
    }

    /**
     * 获取是否删除（0=否，1=是）
     *
     * @return is_delete - 是否删除（0=否，1=是）
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除（0=否，1=是）
     *
     * @param isDelete 是否删除（0=否，1=是）
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取状态(1=待支付,2=已支付/推广中,3=推广完成,4=已取消)
     *
     * @return status - 状态(1=待支付,2=已支付/推广中,3=推广完成,4=已取消)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态(1=待支付,2=已支付/推广中,3=推广完成,4=已取消)
     *
     * @param status 状态(1=待支付,2=已支付/推广中,3=推广完成,4=已取消)
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
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取支付方式
     *
     * @return pay_type - 支付方式
     */
    public Integer getPayType() {
        return payType;
    }

    /**
     * 设置支付方式
     *
     * @param payType 支付方式
     */
    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    /**
     * 获取支付单号
     *
     * @return pay_no - 支付单号
     */
    public String getPayNo() {
        return payNo;
    }

    /**
     * 设置支付单号
     *
     * @param payNo 支付单号
     */
    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    /**
     * 获取推广账户抵扣金额（单位:分）
     *
     * @return promotion_account_amount - 推广账户抵扣金额（单位:分）
     */
    public Long getPromotionAccountAmount() {
        return promotionAccountAmount;
    }

    /**
     * 设置推广账户抵扣金额（单位:分）
     *
     * @param promotionAccountAmount 推广账户抵扣金额（单位:分）
     */
    public void setPromotionAccountAmount(Long promotionAccountAmount) {
        this.promotionAccountAmount = promotionAccountAmount;
    }

    /**
     * 获取预计数量
     *
     * @return prediction_promotion_num - 预计数量
     */
    public Long getPredictionPromotionNum() {
        return predictionPromotionNum;
    }

    /**
     * 设置预计数量
     *
     * @param predictionPromotionNum 预计数量
     */
    public void setPredictionPromotionNum(Long predictionPromotionNum) {
        this.predictionPromotionNum = predictionPromotionNum;
    }

    /**
     * 获取已推广数量
     *
     * @return promotion_num - 已推广数量
     */
    public Long getPromotionNum() {
        return promotionNum;
    }

    /**
     * 设置已推广数量
     *
     * @param promotionNum 已推广数量
     */
    public void setPromotionNum(Long promotionNum) {
        this.promotionNum = promotionNum;
    }

    /**
     * 获取推广类型(1=增加商家展示量,2=短信优惠券推广)
     *
     * @return promotion_type - 推广类型(1=增加商家展示量,2=短信优惠券推广)
     */
    public Integer getPromotionType() {
        return promotionType;
    }

    /**
     * 设置推广类型(1=增加商家展示量,2=短信优惠券推广)
     *
     * @param promotionType 推广类型(1=增加商家展示量,2=短信优惠券推广)
     */
    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    /**
     * 获取最低车价（单位：万）
     *
     * @return car_price_min - 最低车价（单位：万）
     */
    public Integer getCarPriceMin() {
        return carPriceMin;
    }

    /**
     * 设置最低车价（单位：万）
     *
     * @param carPriceMin 最低车价（单位：万）
     */
    public void setCarPriceMin(Integer carPriceMin) {
        this.carPriceMin = carPriceMin;
    }

    /**
     * 获取最高车价（单位：万）
     *
     * @return car_price_max - 最高车价（单位：万）
     */
    public Integer getCarPriceMax() {
        return carPriceMax;
    }

    /**
     * 设置最高车价（单位：万）
     *
     * @param carPriceMax 最高车价（单位：万）
     */
    public void setCarPriceMax(Integer carPriceMax) {
        this.carPriceMax = carPriceMax;
    }

    /**
     * 获取附近距离(km/公里)
     *
     * @return nearby_distance - 附近距离(km/公里)
     */
    public Integer getNearbyDistance() {
        return nearbyDistance;
    }

    /**
     * 设置附近距离(km/公里)
     *
     * @param nearbyDistance 附近距离(km/公里)
     */
    public void setNearbyDistance(Integer nearbyDistance) {
        this.nearbyDistance = nearbyDistance;
    }

    /**
     * 获取开始推广时间（周期为一天）
     *
     * @return promotion_start_time - 开始推广时间（周期为一天）
     */
    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    /**
     * 设置开始推广时间（周期为一天）
     *
     * @param promotionStartTime 开始推广时间（周期为一天）
     */
    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    /**
     * 获取结束推广时间（周期为一天）
     *
     * @return promotion_end_time - 结束推广时间（周期为一天）
     */
    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    /**
     * 设置结束推广时间（周期为一天）
     *
     * @param promotionEndTime 结束推广时间（周期为一天）
     */
    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }
}