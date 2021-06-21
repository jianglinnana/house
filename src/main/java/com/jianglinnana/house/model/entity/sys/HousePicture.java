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
 * 房屋图片信息
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel(value = "HousePicture对象", description = "房屋图片信息")
public class HousePicture extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "所属房屋id")
    @TableField("house_id")
    private Integer houseId;

    @ApiModelProperty(value = "图片路径")
    @TableField("cdn_prefix")
    private String cdnPrefix;

    @ApiModelProperty(value = "宽")
    private Integer width;

    @ApiModelProperty(value = "高")
    private Integer height;

    @ApiModelProperty(value = "所属房屋位置")
    private String location;

    @ApiModelProperty(value = "文件名")
    private String path;


}
