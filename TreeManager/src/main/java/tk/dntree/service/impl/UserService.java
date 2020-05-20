package tk.dntree.service.impl;

import java.util.List;

import javax.inject.Inject;

import tk.dntree.dao.IUserDAO;
import tk.dntree.model.UserModel;
import tk.dntree.service.IUserService;

public class UserService implements IUserService {

	@Inject
	private IUserDAO userDAO;	

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}
	
}
