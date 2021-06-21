package com.jianglinnana.house.model.entity.sys;

import com.baomidou.mybatisplus.annotation.TableField;
import com.jianglinnana.house.model.entity.core.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 支持的地区信息表
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "SupportAddress对象", description = "支持的地区信息表")
public class SupportAddress extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "上级行政单位名")
    @TableField("belong_to")
    private String belongTo;

    @ApiModelProperty(value = "行政单位英文名缩写")
    @TableField("en_name")
    private String enName;

    @ApiModelProperty(value = "行政单位中文名")
    @TableField("cn_name")
    private String cnName;

    @ApiModelProperty(value = "行政级别 市:city   地区: region")
    private String level;

    @ApiModelProperty(value = "城市代码")
    private String code;

    @ApiModelProperty(value = "百度地图经度")
    @TableField("baidu_map_lng")
    private Double baiduMapLng;

    @ApiModelProperty(value = "百度地图纬度")
    @TableField("baidu_map_lat")
    private Double baiduMapLat;


}
