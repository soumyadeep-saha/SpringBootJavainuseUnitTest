package com.soumyadeep.springboot;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

public class TestWebApp extends SpringBootJavainuseUnitTestApplicationTests{
	
	@Autowired
	private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
			
		mockMvc =  MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testEmployee() throws Exception{
		
		mockMvc.perform(get("/employee")).andExpect(status().isOk())
		.andExpect(content().contentType("application/json;charset=UTF-8"))
		.andExpect(jsonPath("$.name").value("Soumyadeep Saha")).andExpect(jsonPath("$.designation").value("Director Technology"))
		.andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(12000000.00));	
	}
}
