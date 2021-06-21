package com.jianglinnana.house.model.entity.sys;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.jianglinnana.house.model.entity.core.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 房屋信息表
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "House对象", description = "房屋信息表")
public class House extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "house唯一标识")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "价格")
    private Integer price;

    @ApiModelProperty(value = "面积")
    private Integer area;

    @ApiModelProperty(value = "房间数量")
    private Integer room;

    @ApiModelProperty(value = "楼层")
    private Integer floor;

    @ApiModelProperty(value = "总楼层")
    @TableField("total_floor")
    private Integer totalFloor;

    @ApiModelProperty(value = "被看次数")
    @TableField("watch_times")
    private Integer watchTimes;

    @ApiModelProperty(value = "建立年限")
    @TableField("build_year")
    private Integer buildYear;

    @ApiModelProperty(value = "房屋状态 0-未审核 1-审核通过  2-已出租  3-逻辑删除")
    private Integer status;

    @ApiModelProperty(value = "城市拼音缩写: 北京->bj")
    @TableField("city_en_name")
    private String cityEnName;

    @ApiModelProperty(value = "地区拼音缩写: 昌平区-> cpq")
    @TableField("region_en_name")
    private String regionEnName;

    @ApiModelProperty(value = "封面")
    private String cover;

    @ApiModelProperty(value = "房屋朝向 1：东  2: 南 3: 西 4: 北")
    private Integer direction;

    @ApiModelProperty(value = "距地铁距离， 默认： -1：附近无地铁")
    @TableField("distance_to_subway")
    private Integer distanceToSubway;

    @ApiModelProperty(value = "客厅数量")
    private Integer parlour;

    @ApiModelProperty(value = "小区")
    private String district;

    @ApiModelProperty(value = "所属管理员id")
    @TableField("admin_id")
    private Integer adminId;

    @ApiModelProperty(value = "卫生间数量")
    private Integer bathroom;

    @ApiModelProperty(value = "街道")
    private String street;


}
