package com.jianglinnana.house.model.entity.base;

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
 * 街道设置
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "BsStreet对象", description = "街道设置")
public class BsStreet extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "自增列")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "街道代码")
    @TableField("street_code")
    private String streetCode;

    @ApiModelProperty(value = "父级区代码")
    @TableField("area_code")
    private String areaCode;

    @ApiModelProperty(value = "街道名称")
    @TableField("stree_name")
    private String streeName;

    @ApiModelProperty(value = "简称")
    @TableField("short_name")
    private String shortName;

    @ApiModelProperty(value = "经度")
    private String lng;

    @ApiModelProperty(value = "纬度")
    private String lat;

    @ApiModelProperty(value = "排序")
    private Integer sort;

    @ApiModelProperty(value = "备注")
    private String memo;

    @ApiModelProperty(value = "租户ID")
    @TableField("tenant_code")
    private String tenantCode;


}
