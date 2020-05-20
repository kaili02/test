package com.example.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.entity.User;

/**
 * Created By kaili
 * Date: 2020/05/17
 * Description: TODO
 */
public interface UserDao extends BaseMapper<User> {

    IPage<User> selectPageVo(Page<?> page, Integer deleteFlag);

    User selectByUserId(Long id);
}
