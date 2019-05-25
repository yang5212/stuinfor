package com.chen.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.chen.mapper.BaseMapper;
import com.chen.service.BaseService;

public abstract class BaseServiceImpl<E, M extends BaseMapper<E>> implements BaseService<E> {
	
	@Autowired
	private M mapper;

	@Override
	public E getById(Serializable id) {
		return mapper.selectById(id);
	}
	
	@Override
	public List<E> selectAll() {
		return mapper.selectAll();
	}
	
	@Override
	public Long count(Map<String, String> params) {
		return mapper.count(params);
	}

	@Override
	public boolean add(E entity) {
		return mapper.insert(entity) > 0;
	}

	@Override
	public boolean update(E entity) {
		return mapper.update(entity) > 0;
	}

	@Override
	public boolean delById(Serializable id) {
		return mapper.deleteById(id) > 0;
	}

}
