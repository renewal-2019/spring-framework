package com.zsl.test;

import com.zsl.config.AppConfig;
import com.zsl.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ZslTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext as = new AnnotationConfigApplicationContext(AppConfig.class);

		IndexService indexService = as.getBean(IndexService.class);
	}
}
