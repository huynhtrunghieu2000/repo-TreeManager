package tk.dntree.dao;

import java.util.List;

import tk.dntree.model.UserModel;

public interface IUserDAO extends GenericDAO {
	List<UserModel> findAll();
}
