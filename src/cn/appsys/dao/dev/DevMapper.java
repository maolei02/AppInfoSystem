package cn.appsys.dao.dev;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.DevUser;

public interface DevMapper {
	public DevUser getDevUserByCode(@Param("devCode") String devCode);
}
