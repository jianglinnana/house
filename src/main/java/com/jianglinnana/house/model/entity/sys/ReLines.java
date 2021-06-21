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
 * 城市地铁线路表
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "ReLines对象", description = "城市地铁线路表")
public class ReLines extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField("city_id")
    private String cityId;

    @TableField("city_name")
    private String cityName;

    @TableField("line_id")
    private String lineId;

    @TableField("line_name")
    private String lineName;


}
