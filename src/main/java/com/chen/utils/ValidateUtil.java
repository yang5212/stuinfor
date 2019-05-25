package com.chen.utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;

public class ValidateUtil {
	/**
	 * 提取数据校验关键信息
	 * @param result 数据校验详情
	 * @return 校验关键信息
	 */
	public static Map<String, String> simpleInfo(BindingResult result) {
		Map<String, String> map = new HashMap<>(result.getErrorCount());
		List<ObjectError> errors = result.getAllErrors();
		errors.forEach((e) -> map.put( ((FieldError) e).getField(), e.getDefaultMessage()) );
		return map;
	}
}
