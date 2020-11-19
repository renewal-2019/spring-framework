package com.zsl.service;

import com.zsl.entity.User;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//实现BeanNameAware可以获取bean的名称
public class IndexService implements BeanNameAware {

	@Autowired
	User user;

	private String beanName;

	IndexService(){
		System.out.println("easy easy");
	}

	@Override
	public void setBeanName(String name) {
		this.beanName = name;
	}
}
