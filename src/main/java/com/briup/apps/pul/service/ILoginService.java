package com.briup.apps.pul.service;

import java.util.List;

import com.briup.apps.pul.bean.Login;

public interface ILoginService {

/* 
 * 查询所有
 */
	List<Login> findAll() throws Exception;
	/*
	关键字查询
	 */
	List<Login> query(String keywors) throws Exception;
	/*
	 * 保存或者修改
	 */
	void saveOrUpdate(Login login) throws Exception;
	/*
	 * 通过ID删除
	 */
	void deleteById(Long id) throws Exception;
	/*
	 * 批量删除
	 */
	void batchDelete(List<Long> ids)throws Exception;
}
