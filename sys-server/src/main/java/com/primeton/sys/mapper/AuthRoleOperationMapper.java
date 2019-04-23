package com.primeton.sys.mapper;

import java.util.List;

import com.primeton.sys.model.AuthRoleOperation;
import com.primeton.sys.dao.MyMapper;

public interface AuthRoleOperationMapper extends MyMapper<AuthRoleOperation> {

	void batchInsert(List<AuthRoleOperation> list);

	void delRoleOpers(List<AuthRoleOperation> list);
}