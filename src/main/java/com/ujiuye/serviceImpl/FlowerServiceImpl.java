package com.ujiuye.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ujiuye.bean.Flower;
import com.ujiuye.mapper.FlowerMapper;
import com.ujiuye.service.FlowerService;

@Service
public class FlowerServiceImpl implements FlowerService{
	
	@Resource
	private FlowerMapper flowermapper;
	
	
	@Override
	public List<Flower> show() {
		return flowermapper.show();
	}
	
	
	@Override
	public int insOne(Flower flower) {
		
		return flowermapper.insOne(flower);
	}
	
}
