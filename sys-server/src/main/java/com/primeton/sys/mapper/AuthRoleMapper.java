package com.primeton.sys.mapper;

import org.apache.ibatis.annotations.Param;

import com.primeton.sys.model.AuthRole;
import com.primeton.sys.dao.MyMapper;

public interface AuthRoleMapper extends MyMapper<AuthRole> {

	AuthRole queryRoleById(@Param("roleid")Integer roleid);
	
	AuthRole queryByRolename(@Param("rolename") String rolename);
}