
package tk.dntree.dao.impl;

import java.util.List;

import tk.dntree.dao.ITreeDAO;
import tk.dntree.mapper.TreeMapper;
import tk.dntree.model.TreeModel;

public class TreeDAO extends AbstractDAO<TreeModel> implements ITreeDAO {

	@Override
	public List<TreeModel> findAll() {
		String sqlStmt = "SELECT * FROM quanlycayxanh.cayxanh";
		return query(sqlStmt, new TreeMapper());
	}

	@Override
	public Long save(TreeModel tree) {
		String sqlStmt = "INSERT INTO cayxanh (LoaiCay,GiongCay,ChieuCao,SoTuoi,ToaDoX,ToaDoY,DiaChiCay) values(?,?,?,?,?,?,?)";
		return insert(sqlStmt, tree.getTypeTree(), tree.getSpecieTree(), tree.getHeight(), tree.getAgeTree(),
				tree.getLatitude(), tree.getLongitude(), tree.getAddressTree());
	}

	@Override
	public void update(TreeModel tree) {
		String sqlStmt = "UPDATE cayxanh"
				+ " SET LoaiCay = ? , GiongCay = ?, ChieuCao= ?, SoTuoi= ?, ToaDoX= ?, ToaDoY= ?, DiaChiCay= ?, Status = ?"
				+ " WHERE MaCay= ?";
		update(sqlStmt, tree.getTypeTree(), tree.getSpecieTree(), tree.getHeight(), tree.getAgeTree(),
				tree.getLatitude(), tree.getLongitude(), tree.getAddressTree(),tree.getStatus(), tree.getId() );
	}

	@Override
	public TreeModel findOneBy(Long id) {
		String sql = "select * from cayxanh where MaCay = ?";
		List<TreeModel> tree = query(sql, new TreeMapper(), id);
		return tree.isEmpty() ? null : tree.get(0);
	}

}
