package com.cilicili.advertisement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.cilicili.advertisement.domain.ButtleAdv;
import com.cilicili.advertisement.mapper.ButtleMapper;


@Service
public class ButtleService {

	@Autowired
	private ButtleMapper buttleDao;
	
	public void play() {
		System.out.println("11111119999");
		ButtleAdv one = new ButtleAdv();
//		buttleDao.addAdvByOne(one);
		buttleDao.insert(one);
		
	}
	
	//单条添加
	public void addAdvByOne(ButtleAdv butt) {
	
		buttleDao.insert(butt);
	}
	
	//查询所有
	public List<ButtleAdv> selAdvAll(){
		List<ButtleAdv> list = buttleDao.selectList(null);
		return list;
	}
	
	//多条件查询
		public List<ButtleAdv> selAdvByMoreCon(QueryWrapper<ButtleAdv> queryWrapper){
			List<ButtleAdv> list = buttleDao.selectList(queryWrapper);
			return list;
		}
	//多条件分页查询
	public IPage<ButtleAdv> selAdvByMoreConByPage(Page<ButtleAdv> page, QueryWrapper<ButtleAdv> queryWrapper){
		return buttleDao.selectPage(page,queryWrapper);
		}
	
	
	//查询单条
	public ButtleAdv selAdvById(int id) {
		return buttleDao.selectById(id);
	}
	
	//删除广告
	public void delAdvById(int id) {
		buttleDao.deleteById(id);
	}
	
	//批量删除广告
	public void delMoreAdv(List<Integer> idList) {
		buttleDao.deleteBatchIds(idList);
		//buttleDao.delete(ButtleList);
	}
	
	//修改广告
	public void upAdvByOBJ(ButtleAdv but) {
		buttleDao.updateById(but);
	}
	
	//禁用广告
	public void isUse(List<ButtleAdv> ButtleList,int operator,int isNormal) {
		
	}

	public ButtleAdv selectmore(int id) {
		return buttleDao.selectById(id);
	}
	
	public int selectCount() {
		return buttleDao.selectCount(null);
	}
}
