package com.ujiuye.mapper;

import java.util.List;

import com.ujiuye.bean.Flower;

public interface FlowerMapper {
	
	/**
	 * 展示全部
	 * @return
	 */
	List<Flower> show();
	
	/**
	  * 插入一条记录
	 * @return
	 */
	int insOne(Flower flower);
}
