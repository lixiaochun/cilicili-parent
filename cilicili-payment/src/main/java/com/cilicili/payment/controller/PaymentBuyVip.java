package com.cilicili.payment.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cilicili.domain.payment.BuyVip;
import com.cilicili.domain.payment.RedPackets;
import com.cilicili.payment.service.BuyVipService;
import com.cilicili.payment.service.ManageDiscountService;
import com.cilicili.payment.service.ManageRedPacketsService;

@Controller
@RequestMapping("PaymentBuyVip")
public class PaymentBuyVip {
//	@Resource 
//	private VipTypeService vipTypeService;
//	
//	@RequestMapping("Buy")
//	public String Buy(Model model) {
//		List<VipType> vipTypeList= vipTypeService.findAll();
//		model.addAttribute("vipTypeList", vipTypeList);
//		return "payment/buyVip/buyVip";
//	}
	
	@Resource
	private ManageRedPacketsService manageRedPacketsService;
	@Resource 
	private ManageDiscountService manageDiscountService;
	@Resource 
	private BuyVipService buyVipService;
	@RequestMapping("Buy")
	public String BuyDo(Model model,HttpServletRequest request) {
//		if(Integer.parseInt(userID)==0) {
//			//如果用户ID或者VipID不合法那么执行以下代码
//			
//		}
		HttpSession session = request.getSession();
		
		String userID =(String) session.getAttribute("userID");
		
		List<RedPackets> redPacketsList= manageRedPacketsService.selectByUserID(userID);
		model.addAttribute("redPacketsList", redPacketsList);
		
		model.addAttribute("userID", userID);
		List<BuyVip> buyVipList=buyVipService.findAll();
		model.addAttribute("buyVipList", buyVipList);
		
		return "payment/buyVip/buyVip";
	}

}
