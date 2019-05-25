package com.chen.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
@Configurable
public class GlobalException implements HandlerExceptionResolver {

		@Override
		public ModelAndView resolveException( HttpServletRequest request, 
											  HttpServletResponse response, 
											  Object handler,
											  Exception ex ) {
			
			ModelAndView mv = new ModelAndView();
			
			if (ex instanceof NullPointerException) {
				mv.setViewName("/error");
				mv.addObject("msg", "空指针异常");
			}
			
//			if (ex instanceof ArithmeticException) {
//				mv.setViewName("/ssm/error");
//			}
//			...
			
			return mv;
		}
	
}
