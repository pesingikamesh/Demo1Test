package com.org.testcases;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.org.controller.TestController;
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
//@ContextConfiguration("classpath:SpringDispatcher-servlet.xml")
//@ContextConfiguration(locations={"classpath:SpringDispatcher-servlet.xml"})
//@ContextConfiguration(loader = WebContextLoader.class, classes = {TestController.class})
public class Testcase {

	private MockMvc mockmvc;
	
	@InjectMocks
	public TestController testController; 
	
	    @Autowired
	    private WebApplicationContext wac;
	
	
	@Before
	public void setUp() {
		System.out.println("SETUPPPPPPPPPPPPP");
		//mockmvc=MockMvcBuilders.standaloneSetup(testController).build();
		mockmvc = MockMvcBuilders.webAppContextSetup(this.wac).build();

        // this must be called for the @Mock annotations above to be processed.
       MockitoAnnotations.initMocks(this);
		System.out.println("22222222222222");
	}
	
	
	@Test
	public void test111() throws Exception {
	System.out.println("TESTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");	
		mockmvc.perform(get("http://localhost:8080/TestMaven/bi/hi")).andExpect(status().isOk());
		
	//mockmvc.perform(get("")).
	System.out.println("MVCCCCCCCCCCCCCCCCCTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTT");	
	
	}
	
	
}
