/**
 * Copyright 2016-2017 com.nanf.cross.api
 * All rights reserved.
 * 
 * @project
 * @author li.hui
 * @version 1.0
 * @date 2016-11-18
 */


import com.micropower.manager.service.DeviceService;
import com.micropower.manager.service.WarnLogService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.web.context.WebApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:/META-INF/spring/**.*", "file:src/main/webapp/WEB-INF/webmvc-servlet.xml"})
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class})
public abstract class TestBase {
	
	protected MockMvc mockMvc;



	@Autowired
	private WebApplicationContext context;
	
	@Before
	public void before() {
		 mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
	}


}