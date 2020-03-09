package cn.appsys.service.app;

import java.util.List;

import cn.appsys.pojo.AppInfo;

public interface AppService {
public int getAppCount();
	
	public List<AppInfo> getAppByPage(AppInfo appInfo,int start,int size);
}
