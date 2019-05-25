package com.chen.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface BaseService<E> {
	/**
	 * 通过主键获取对应目标记录
	 * @param id 主键值
	 * @return 目标实体
	 */
	E getById(Serializable id);
	
	/**
	 * 获取所有记录
	 * @return 所有记录
	 */
	List<E> selectAll();
	
	/**
	 * 条件统计记录数
	 * @param params 参数列表
	 * @return 符合条件的记录数
	 */
	Long count(Map<String, String> params);
	
	/**
	 * 将对象持久化到数据库
	 * @param t 对象实体
	 * @return 处理结果
	 */
	boolean add(E entity);
	
	/**
	 * 更新目标实体对象
	 * @param entity 待更新目标实体对象
	 * @return 处理结果
	 */
	boolean update(E entity);
	
	/**
	 * 根据实体id删除对应实体
	 * @param id 实体id
	 * @return 处理结果
	 */
	boolean delById(Serializable id);
	
}
