package com.cilicili.content.controller;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cilicili.bean.content.Type;
import com.cilicili.bean.content.VideoUrl;
import com.cilicili.common.dto.TvAdDto;
import com.cilicili.content.service.PageService;
import com.cilicili.content.service.RankService;
/**
 * 页面导航的Controller
 * 
 * @author 李明睿
 *
 */
@Controller
@RequestMapping("/to")
public class PageController {
	@Resource
	PageService pService;
	@Resource
	private RankService rService;
	/**
	 * 去一级主页
	 * 
	 * @return
	 */
	@RequestMapping("hone")
	public String toHomePage(Model model) {
		List<Type > vType = pService.getAllFirstType();
		Map<Integer,Object> map = new LinkedHashMap<Integer, Object>();
		for (int i = 0; i < vType.size()-1; i++) {
			List<TvAdDto> pageContent = pService.getPageContent(vType.get(i), 1, 4);
			map.put(vType.get(i).getId(), pageContent);
		}
		model.addAttribute("PageContent", map);
		return "";
	}
	
	 /**
	 * 去二级主页
	 *
	 * @param url type的url
	 * @return
	 */
	 @RequestMapping(value = "{url}", method = RequestMethod.GET)
	 public String toSecHome(@PathVariable("url") String url) {
		 
	 return "";
	 }
	
	 /**
	 * 去三级主页
	 *
	 * @param securl
	 * @param thirdurl
	 * @return
	 */
	 @RequestMapping(value = "{securl}/{thirdurl}", method =
	 RequestMethod.GET)
	 public String tothirdHome(@PathVariable("securl") String securl,
	 @PathVariable("thirdurl") String thirdurl) {
	 return "";
	 }
	
	 /**
	 * 去某个视频页面
	 *
	 * @param video的request URL
	 * @return
	 */
	 @RequestMapping(value = "cv/{video}", method = RequestMethod.GET)
	 public String toVideoPage(@PathVariable("video") String videoPath, HttpServletRequest req) {
		VideoUrl videoUrl = pService.getVideo(videoPath);
		if (videoUrl != null) {
			req.setAttribute("video", videoUrl);
			// TODO 返回一个状态码
			return "";
		}
		return "";
	 }
//	 /**
//	 * 拿到远端IP地址
//	 * 如果通过了多级反向代理的话，X-Forwarded-For的值并不止一个，而是一串IP值
//	 * X-Forwarded-For中第一个非unknown的有效IP字符串为用户的真实IP地址
//	 * @param request
//	 * @return
//	 */
//	 @RequestMapping("iptest")
//	 @ResponseBody
//	 public String ipTest(HttpServletRequest request) {
//	 String removeip = "";
//	 if (request.getHeader("x-forwarded-for") == null) {
//	 removeip = request.getRemoteAddr();
//	 String remoteHost = request.getRemoteHost();
//	 int remotePort = request.getRemotePort();
//	 String remoteUser = request.getRemoteUser();
//	 System.out.println(remoteHost+"+" + remotePort +" +" + remoteUser);
//	 }else {
//	 removeip = request.getHeader("x-forwarded-for");
//	 }
//	 return removeip;
//	 }

}
