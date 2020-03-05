package cn.appsys.dao.backend;


import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.BackendUser;

public interface BackendMapper {
	public BackendUser getbaBackendbyCode(@Param("userCode") String userCode);
}
