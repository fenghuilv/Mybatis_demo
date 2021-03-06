package com.wg.demo.dao;

import com.alibaba.fastjson.JSONObject;
import com.wg.demo.po.Role;

import java.util.List;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

    Role selectRoleAndUserInfo(Long roleId);

    List<JSONObject>  selectList(Long roleId);

    Role selectRoleAndUserInfo_step(Long roleId);

}