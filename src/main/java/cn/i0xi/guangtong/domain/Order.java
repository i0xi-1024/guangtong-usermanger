package cn.i0xi.guangtong.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @TableName order
 */
@TableName(value ="`order`")
@Data
public class Order implements Serializable {
    /**
     * ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 姓名
     */
    private String username;

    /**
     * 手机号
     */
    private String phone;

    /**
     * 左眼：0.近视   1.远视
     */
    private Integer leftType;

    /**
     * 左眼度数
     */
    private String leftLevel;

    /**
     * 右眼：0.近视   1.远视
     */
    private Integer rightType;

    /**
     * 右眼度数
     */
    private String rightLevel;

    /**
     * 左眼散光
     */
    private String leftAstigmatism;

    /**
     * 右眼散光
     */
    private String rightAstigmatism;

    /**
     * 左眼轴向
     */
    private String leftAxial;

    /**
     * 右眼轴向
     */
    private String rightAxial;

    /**
     * 瞳距
     */
    private String pupillaryDistance;

    /**
     * 鼻距
     */
    private String nasalSpacing;

    /**
     * 镜片品牌
     */
    private String lensBrands;

    /**
     * 镜架品牌
     */
    private String framesBrands;

    /**
     * 镜片价格
     */
    private Double lensPrices;

    /**
     * 镜架价格
     */
    private Double framesPrices;

    /**
     * 加工收费
     */
    private Double processingPrices;

    /**
     * 折扣
     */
    private String rebates;

    /**
     * 总计价格
     */
    private Double totalPrices;

    /**
     * 备注
     */
    private String note;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Order other = (Order) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getLeftType() == null ? other.getLeftType() == null : this.getLeftType().equals(other.getLeftType()))
            && (this.getLeftLevel() == null ? other.getLeftLevel() == null : this.getLeftLevel().equals(other.getLeftLevel()))
            && (this.getRightType() == null ? other.getRightType() == null : this.getRightType().equals(other.getRightType()))
            && (this.getRightLevel() == null ? other.getRightLevel() == null : this.getRightLevel().equals(other.getRightLevel()))
            && (this.getLeftAstigmatism() == null ? other.getLeftAstigmatism() == null : this.getLeftAstigmatism().equals(other.getLeftAstigmatism()))
            && (this.getRightAstigmatism() == null ? other.getRightAstigmatism() == null : this.getRightAstigmatism().equals(other.getRightAstigmatism()))
            && (this.getLeftAxial() == null ? other.getLeftAxial() == null : this.getLeftAxial().equals(other.getLeftAxial()))
            && (this.getRightAxial() == null ? other.getRightAxial() == null : this.getRightAxial().equals(other.getRightAxial()))
            && (this.getPupillaryDistance() == null ? other.getPupillaryDistance() == null : this.getPupillaryDistance().equals(other.getPupillaryDistance()))
            && (this.getNasalSpacing() == null ? other.getNasalSpacing() == null : this.getNasalSpacing().equals(other.getNasalSpacing()))
            && (this.getLensBrands() == null ? other.getLensBrands() == null : this.getLensBrands().equals(other.getLensBrands()))
            && (this.getFramesBrands() == null ? other.getFramesBrands() == null : this.getFramesBrands().equals(other.getFramesBrands()))
            && (this.getLensPrices() == null ? other.getLensPrices() == null : this.getLensPrices().equals(other.getLensPrices()))
            && (this.getFramesPrices() == null ? other.getFramesPrices() == null : this.getFramesPrices().equals(other.getFramesPrices()))
            && (this.getProcessingPrices() == null ? other.getProcessingPrices() == null : this.getProcessingPrices().equals(other.getProcessingPrices()))
            && (this.getRebates() == null ? other.getRebates() == null : this.getRebates().equals(other.getRebates()))
            && (this.getTotalPrices() == null ? other.getTotalPrices() == null : this.getTotalPrices().equals(other.getTotalPrices()))
            && (this.getNote() == null ? other.getNote() == null : this.getNote().equals(other.getNote()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getLeftType() == null) ? 0 : getLeftType().hashCode());
        result = prime * result + ((getLeftLevel() == null) ? 0 : getLeftLevel().hashCode());
        result = prime * result + ((getRightType() == null) ? 0 : getRightType().hashCode());
        result = prime * result + ((getRightLevel() == null) ? 0 : getRightLevel().hashCode());
        result = prime * result + ((getLeftAstigmatism() == null) ? 0 : getLeftAstigmatism().hashCode());
        result = prime * result + ((getRightAstigmatism() == null) ? 0 : getRightAstigmatism().hashCode());
        result = prime * result + ((getLeftAxial() == null) ? 0 : getLeftAxial().hashCode());
        result = prime * result + ((getRightAxial() == null) ? 0 : getRightAxial().hashCode());
        result = prime * result + ((getPupillaryDistance() == null) ? 0 : getPupillaryDistance().hashCode());
        result = prime * result + ((getNasalSpacing() == null) ? 0 : getNasalSpacing().hashCode());
        result = prime * result + ((getLensBrands() == null) ? 0 : getLensBrands().hashCode());
        result = prime * result + ((getFramesBrands() == null) ? 0 : getFramesBrands().hashCode());
        result = prime * result + ((getLensPrices() == null) ? 0 : getLensPrices().hashCode());
        result = prime * result + ((getFramesPrices() == null) ? 0 : getFramesPrices().hashCode());
        result = prime * result + ((getProcessingPrices() == null) ? 0 : getProcessingPrices().hashCode());
        result = prime * result + ((getRebates() == null) ? 0 : getRebates().hashCode());
        result = prime * result + ((getTotalPrices() == null) ? 0 : getTotalPrices().hashCode());
        result = prime * result + ((getNote() == null) ? 0 : getNote().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", phone=").append(phone);
        sb.append(", leftType=").append(leftType);
        sb.append(", leftLevel=").append(leftLevel);
        sb.append(", rightType=").append(rightType);
        sb.append(", rightLevel=").append(rightLevel);
        sb.append(", leftAstigmatism=").append(leftAstigmatism);
        sb.append(", rightAstigmatism=").append(rightAstigmatism);
        sb.append(", leftAxial=").append(leftAxial);
        sb.append(", rightAxial=").append(rightAxial);
        sb.append(", pupillaryDistance=").append(pupillaryDistance);
        sb.append(", nasalSpacing=").append(nasalSpacing);
        sb.append(", lensBrands=").append(lensBrands);
        sb.append(", framesBrands=").append(framesBrands);
        sb.append(", lensPrices=").append(lensPrices);
        sb.append(", framesPrices=").append(framesPrices);
        sb.append(", processingPrices=").append(processingPrices);
        sb.append(", rebates=").append(rebates);
        sb.append(", totalPrices=").append(totalPrices);
        sb.append(", note=").append(note);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}