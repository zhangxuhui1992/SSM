package com.ujiuye.service;

import java.util.List;

import com.ujiuye.bean.Flower;

public interface FlowerService {
	/**
	 * 查询全部
	 * @return
	 */
	List<Flower> show();
	
	/**
	 * 添加一条记录
	 * @param flower
	 * @return
	 */
	int insOne(Flower flower);
}
