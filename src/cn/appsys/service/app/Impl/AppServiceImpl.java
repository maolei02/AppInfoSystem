package cn.appsys.service.app.Impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.appsys.dao.app.AppMapper;
import cn.appsys.pojo.AppInfo;
import cn.appsys.service.app.AppService;
@Service
public class AppServiceImpl implements AppService {

	@Resource
	private AppMapper appMapper;
	
	@Override
	public int getAppCount() {
		// TODO Auto-generated method stub
		return appMapper.getAppCount();
	}

	@Override
	public List<AppInfo> getAppByPage(AppInfo appInfo, int start, int size) {
		// TODO Auto-generated method stub
		return appMapper.getAppByPage(appInfo, start, size);
	}

}
