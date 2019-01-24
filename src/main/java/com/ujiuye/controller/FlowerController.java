package com.ujiuye.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ujiuye.bean.Flower;
import com.ujiuye.service.FlowerService;

@Controller
public class FlowerController {
	@Resource
	private FlowerService flowerServiceImpl;
	private int insOne;
	
	
	/**
	  * 查询全部展示
	 * @param model
	 * @return
	 */
	@RequestMapping("showAll")
	public String showAll(Model model){
		List<Flower> list = flowerServiceImpl.show();
		model.addAttribute("list", list);
		return "show";
	}
	
	
	@RequestMapping("insert")
	public String insert(@ModelAttribute("name")String name,@ModelAttribute("price")double price,@ModelAttribute("production") String production){
		Flower flower = new Flower();
		flower.setName(name);
		flower.setPrice(price);
		flower.setProduction(production);
		int count = flowerServiceImpl.insOne(flower);
		return "redirect:showAll";
	}
}
