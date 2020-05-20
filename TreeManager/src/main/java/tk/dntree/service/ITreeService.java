package tk.dntree.service;

import java.util.List;

import tk.dntree.model.TreeModel;

public interface ITreeService {
	List<TreeModel> findAll();
	TreeModel save(TreeModel tree);
}
