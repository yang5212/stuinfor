package com.chen.service.impl;

import org.springframework.stereotype.Service;

import com.chen.entity.ClassInfo;
import com.chen.mapper.BaseMapper;
import com.chen.service.ClassInfoService;

@Service
public class ClassInfoServiceImpl 
extends BaseServiceImpl<ClassInfo, BaseMapper<ClassInfo>> 
implements ClassInfoService {

}
