package cn.appsys.controller.dev;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.appsys.service.app.AppService;
import cn.appsys.service.dev.DevService;

@Controller
@RequestMapping("/dev/flatform")
public class DevController {
	
	@Resource
	private DevService devService;
	
	@Resource
	private AppService appService;
	//1.查询app信息，进入app列表页面，展示内容
	 /*参数列表中可能存在
	  * currentPageNo:当前页码数=======》pageIndex
	  * softwareName:软件名称 ======》querySoftwareName
	  *status :软件状态======》 queryStatus
	  *flatformId:所属平台id ======》 queryFlatformId
	  *categoryLevel1:所属一级分类id ======》 queryCategoryLevel1
	  *categoryLevel2:所属二- 级分类id ======》 queryCategoryLeve12
	  *categoryLevel3:所属三级分类id ======》 queryCategoryLevel3
	  */
	@RequestMapping("/app/list")
	public String applist(@RequestParam(value="querySoftwareName",required=false)String softwareName,
			@RequestParam(value="pageIndex",required=false)String currentPageNo,
			@RequestParam(value="queryStatus",required=false)String status,
			@RequestParam(value="queryFlatformId",required=false)String flatformId,
			@RequestParam(value="queryCategoryLevel1",required=false)String categoryLevel1,
			@RequestParam(value="queryCategoryLevel2",required=false)String categoryLevel2,
			@RequestParam(value="queryCategoryLevel3",required=false)String categoryLevel3,Model model,HttpServletRequest request){
		
		Integer _currentPageNo=null;
		
		if(currentPageNo!=null){
			_currentPageNo=Integer.parseInt(currentPageNo);
		}else{
			_currentPageNo=1;
		}
		
		
		return "";
	}
}
