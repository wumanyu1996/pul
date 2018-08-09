package com.briup.apps.pul.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.briup.apps.pul.bean.Login;
import com.briup.apps.pul.bean.LoginExample;
import com.briup.apps.pul.dao.LoginMapper;
import com.briup.apps.pul.service.ILoginService;
@Service
public class LoginServiceImpl implements ILoginService {

	
	@Autowired
	private LoginMapper loginMapper;
	@Override
	public List<Login> findAll() throws Exception {
		LoginExample example = new LoginExample();
		return loginMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<Login> query(String keywors) throws Exception {
		
		LoginExample example = new LoginExample();
		example.createCriteria().andNameLike(keywors);
		return loginMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public void saveOrUpdate(Login login) throws Exception {
		if (login.getId() != null) {
			loginMapper.updateByPrimaryKey(login);
		}else{
			loginMapper.insert(login);
		}
		
	}

	@Override
	public void deleteById(Long id) throws Exception {
		loginMapper.deleteByPrimaryKey(id);		
	}

	@Override
	public void batchDelete(List<Long> ids) throws Exception {

		for(long id:ids){
			loginMapper.deleteByPrimaryKey(id);
		}
	}

}
