package com.cilicili.advertisement.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cilicili.advertisement.mapper.ReserveMapper;
import com.cilicili.domain.advertisement.ButtleAdv;
import com.cilicili.domain.advertisement.CenterAdv;
import com.cilicili.domain.advertisement.ReserveAdv;


@Service
public class ReserveService {

	@Autowired
	private ReserveMapper reserveDao;
	
	public void play() {
		System.out.println("11111119999");
		ReserveAdv one = new ReserveAdv();
//		buttleDao.addAdvByOne(one);
		reserveDao.insert(one);
		
	}
	
	//单条添加
	public void addAdvByOne(ReserveAdv right) {
		
		reserveDao.insert(right);
	}
	
	//查询所有
	public List<ReserveAdv> selAdvAll(){
		
		List<ReserveAdv> list = reserveDao.selectList(null);
		return list;
	}
	
	//多条件查询
		public List<ReserveAdv> selAdvByMoreCon(QueryWrapper<ReserveAdv> queryWrapper){
			List<ReserveAdv> list = reserveDao.selectList(queryWrapper);
			return list;
		}
	
	//查询单条
	public ReserveAdv selAdvById(int id) {
		return reserveDao.selectById(id);
	}
	
	//删除广告
	public void delAdvById(int id) {
		reserveDao.deleteById(id);
	}
	
	//批量删除广告
	public void delMoreAdv(List<Integer> idList) {
		reserveDao.deleteBatchIds(idList);
		//buttleDao.delete(ButtleList);
	}
	
	//修改广告
	public void upAdvByOBJ(ReserveAdv but) {
		reserveDao.updateById(but);
	}
	
	//禁用广告
	public void isUse(List<ReserveAdv> ButtleList,int operator,int isNormal) {
		
	}

	public ReserveAdv selectmore(int id) {
		return reserveDao.selectById(id);
	}
	
	public int selectCount() {
		return reserveDao.selectCount(null);
	}

	public IPage<ReserveAdv> selAdvByMoreConByPage(Page<ReserveAdv> page, QueryWrapper<ReserveAdv> queryWrapper) {
		return reserveDao.selectPage(page, queryWrapper);
	}
	//返回单条广告
	public ReserveAdv selAdvByNum() {
		QueryWrapper<ReserveAdv> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("status",1);
		return reserveDao.selectOne(queryWrapper);
	}
	
	//返回多条广告
	public List<ReserveAdv> selAdvByOddNum() {
		List<ReserveAdv> qlistCenter = new ArrayList<>();
		List<ReserveAdv> rlistCenter = new ArrayList<>();
		QueryWrapper<ReserveAdv> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("status",1);
		qlistCenter = reserveDao.selectList(queryWrapper);
		for(int i=1;i<qlistCenter.size();i=i+2)
			rlistCenter.add(qlistCenter.get(i));
		return rlistCenter;
	}
	//返回多条广告
	public List<ReserveAdv> selAdvByEvenNum() {
		List<ReserveAdv> qlistCenter = new ArrayList<>();
		List<ReserveAdv> rlistCenter = new ArrayList<>();
		QueryWrapper<ReserveAdv> queryWrapper = new QueryWrapper<>();
		queryWrapper.eq("status",1);
		qlistCenter = reserveDao.selectList(queryWrapper);
		for(int i=0;i<qlistCenter.size();i=i+2)
			rlistCenter.add(qlistCenter.get(i));
		return rlistCenter;
	}
}
