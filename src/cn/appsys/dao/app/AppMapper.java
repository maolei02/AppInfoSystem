package cn.appsys.dao.app;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.appsys.pojo.AppInfo;

public interface AppMapper {
	public int getAppCount();
	
	public List<AppInfo> getAppByPage(AppInfo appInfo,@Param("start")int start,@Param("size")int size);
}
