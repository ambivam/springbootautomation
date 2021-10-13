package com.mouritech.springbootautomation;

import com.mouritech.springbootautomation.pages.MainPage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootautomationApplicationTests {


	@Autowired
	private MainPage mainPage;

	@Value("${app.url}")
	private String appUrl;

	@Value("chrome,firefox,edge")
	private List<String> browsers;

	@Test
	void contextLoads() {
		//mainPage.navigate();
		mainPage.PerformLogin();
	}

}
