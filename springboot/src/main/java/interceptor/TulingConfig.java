package interceptor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 描述这个类的作用
 * @author wanghongbin
 * @date 2019年4月1日 下午4:27:02
 * @Copyright: 2019 www.xinyunli.com Inc. All rights reserved. 
*/
public class TulingConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	private InterceptorController interceptorController;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(interceptorController).addPathPatterns("/**").excludePathPatterns("/index.html","/");
	}

}

