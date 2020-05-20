package tk.dntree.service;

import java.util.List;

import tk.dntree.model.UserModel;

public interface IUserService {
	List<UserModel> findAll();
}
