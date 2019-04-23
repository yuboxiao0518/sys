package com.primeton.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.primeton.sys.model.AuthUser;
import com.primeton.sys.dao.MyMapper;

public interface AuthUserMapper extends MyMapper<AuthUser> {

	AuthUser queryByUsername(@Param("username") String username);

	List<AuthUser> queryList(@Param("user")AuthUser user);

	List<Integer> queryRoleUids(@Param("roleid")int roleid);
}