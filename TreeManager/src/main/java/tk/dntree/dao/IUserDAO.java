package tk.dntree.dao;

import java.util.List;

import tk.dntree.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel> {
	List<UserModel> findAll();
}
