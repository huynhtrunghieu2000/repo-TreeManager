package tk.dntree.dao.impl;

import java.util.List;

import tk.dntree.dao.ITreeDAO;
import tk.dntree.mapper.TreeMapper;
import tk.dntree.model.TreeModel;

public class TreeDAO extends AbstractDAO<TreeModel> implements ITreeDAO {

	@Override
	public List<TreeModel> findAll() {
		String sqlStmt = "SELECT * FROM quanlycayxanh.cayxanh";
		return query(sqlStmt,new TreeMapper());
	}

	@Override
	public Long save(TreeModel tree) {
		String sqlStmt = "INSERT INTO cayxanh (LoaiCay,GiongCay,ChieuCao,SoTuoi,ToaDoX,ToaDoY) values(?,?,?,?,?,?)";
		return insert(sqlStmt, tree.getSpecieTree(),tree.getTypeTree(),tree.getHeight(),tree.getAgeTree(),tree.getLatitude(),tree.getLongitude());
	}

	@Override
	public void update(TreeModel tree) {
		// TODO Auto-generated method stub
		
	}
	
}
