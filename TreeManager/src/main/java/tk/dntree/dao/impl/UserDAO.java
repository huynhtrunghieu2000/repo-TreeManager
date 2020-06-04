package tk.dntree.dao.impl;

import java.util.List;

import tk.dntree.dao.IUserDAO;
import tk.dntree.mapper.UserMapper;
import tk.dntree.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {

	@Override
	public List<UserModel> findAll() {
		String sqlStmt = "SELECT * FROM nguoidung";
		return query(sqlStmt,new UserMapper());
	}

}
