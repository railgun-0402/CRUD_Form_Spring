package com.example;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.TestController;

@SpringBootTest
public class WebTest {
	private MockMvc mockMvc;
	
	@Autowired
	TestController testController;
		
	@Test
	public void isStatusTest() throws Exception {
		assertThat(testController).isNotNull();
	}

}
