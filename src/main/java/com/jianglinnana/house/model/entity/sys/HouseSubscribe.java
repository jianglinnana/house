package com.jianglinnana.house.model.entity.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.jianglinnana.house.model.entity.core.BaseEntity;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 预约看房信息表
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "HouseSubscribe对象", description = "预约看房信息表")
public class HouseSubscribe extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "房源id")
    @TableField("house_id")
    private Integer houseId;

    @ApiModelProperty(value = "用户id")
    @TableField("user_id")
    private Integer userId;

    @ApiModelProperty(value = "用户描述")
    private String description;

    @ApiModelProperty(value = "预约状态:  1-已预约   2-房东确认  3-看房完成 ")
    private Integer status;

    @ApiModelProperty(value = "预约时间")
    @TableField("order_time")
    private LocalDateTime orderTime;

    @ApiModelProperty(value = "联系电话")
    private String telephone;

    @ApiModelProperty(value = "房源发布者id")
    @TableField("admin_id")
    private Integer adminId;


}
