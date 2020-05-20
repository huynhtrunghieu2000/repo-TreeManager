package tk.dntree.dao;

import java.util.List;

import tk.dntree.model.TreeModel;

public interface ITreeDAO extends GenericDAO<TreeModel> {
	List<TreeModel> findAll();
	Long save(TreeModel tree);
	void update(TreeModel tree);
}
