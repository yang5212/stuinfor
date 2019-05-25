package com.chen.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.chen.App;
import com.chen.service.ClassInfoService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
public class DoTest {
	
	@Autowired
	private ClassInfoService classInfoService;
	
	@Test
	public void testClassInfoSelAll() {
		classInfoService.selectAll().forEach(System.out :: println);
	}
}
