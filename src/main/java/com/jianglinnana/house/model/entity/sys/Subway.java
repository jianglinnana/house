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
 * 地铁线路表
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "Subway对象", description = "地铁线路表")
public class Subway extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    private Integer id;

    @ApiModelProperty(value = "线路名称")
    private String name;

    @ApiModelProperty(value = "所属城市拼音首字母缩写")
    @TableField("city_en_name")
    private String cityEnName;


}
