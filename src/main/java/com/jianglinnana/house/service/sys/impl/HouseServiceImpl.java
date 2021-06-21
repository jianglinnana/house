package com.jianglinnana.house.service.sys.impl;

import com.jianglinnana.house.model.entity.sys.House;
import com.jianglinnana.house.dao.mapper.HouseMapper;
import com.jianglinnana.house.service.sys.HouseService;
import com.jianglinnana.house.service.core.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 房屋信息表 服务实现类
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Service
public class HouseServiceImpl extends BaseServiceImpl<HouseMapper, House> implements HouseService {

}
