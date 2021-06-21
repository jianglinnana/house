package com.jianglinnana.house.service.sys.impl;

import com.jianglinnana.house.model.entity.sys.User;
import com.jianglinnana.house.dao.mapper.UserMapper;
import com.jianglinnana.house.service.sys.UserService;
import com.jianglinnana.house.service.core.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户基本信息表 服务实现类
 * </p>
 *
 * @author jianglinnana
 * @since 2021-06-21
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, User> implements UserService {

}
