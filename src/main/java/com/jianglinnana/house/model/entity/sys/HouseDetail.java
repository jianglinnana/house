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
 * 房屋详情
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "HouseDetail对象", description = "房屋详情")
public class HouseDetail extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "详细描述")
    private String description;

    @ApiModelProperty(value = "户型介绍")
    @TableField("layout_desc")
    private String layoutDesc;

    @ApiModelProperty(value = "交通出行")
    private String traffic;

    @ApiModelProperty(value = "周边配套")
    @TableField("round_service")
    private String roundService;

    @ApiModelProperty(value = "出租方式  0： 合租, 1:整租")
    @TableField("rent_way")
    private Integer rentWay;

    @ApiModelProperty(value = "详细地址")
    private String address;

    @ApiModelProperty(value = "附近地铁线id")
    @TableField("subway_line_id")
    private Integer subwayLineId;

    @ApiModelProperty(value = "附近地铁线名称")
    @TableField("subway_line_name")
    private String subwayLineName;

    @ApiModelProperty(value = "附近地铁站id")
    @TableField("subway_station_id")
    private Integer subwayStationId;

    @ApiModelProperty(value = "附近地铁站名称")
    @TableField("subway_station_name")
    private String subwayStationName;

    @ApiModelProperty(value = "房屋id")
    @TableField("house_id")
    private Integer houseId;


}
