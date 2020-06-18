package tk.dntree.service.impl;

import java.util.List;

import javax.inject.Inject;

import tk.dntree.dao.ITreeDAO;
import tk.dntree.model.TreeModel;
import tk.dntree.service.ITreeService;

public class TreeService implements ITreeService {
	
	@Inject
	private ITreeDAO treeDAO;
	
	public List<TreeModel> findAll(){
		return treeDAO.findAll();
	}

	@Override
	public TreeModel save(TreeModel tree) {
		Long treeId = treeDAO.save(tree);
		return treeDAO.findOneBy(treeId);
	}

	@Override
	public TreeModel update(TreeModel updateTree) {
		//TreeModel oldTree= treeDAO.findOneBy(updateTree.getIdTree());
		treeDAO.update(updateTree);
		return treeDAO.findOneBy(updateTree.getId());
	}
}