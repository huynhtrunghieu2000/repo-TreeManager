package tk.dntree.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import tk.dntree.model.TreeModel;

public class TreeMapper implements RowMapper<TreeModel> {

	@Override
	public TreeModel MapRow(ResultSet resultSet) {

		try {
			TreeModel tree = new TreeModel();
			tree.setIdTree(resultSet.getInt("MaCay"));
			tree.setSpecieTree(resultSet.getString("GiongCay"));
			tree.setTypeTree(resultSet.getString("LoaiCay"));
			tree.setAgeTree(resultSet.getInt("SoTuoi"));
			tree.setAddressTree(resultSet.getString("DiaChiCay"));
			tree.setHeight(resultSet.getDouble("ChieuCao"));
			tree.setLatitude(resultSet.getDouble("ToaDoX"));
			tree.setLongitude(resultSet.getDouble("ToaDoY"));
			tree.setStatus(resultSet.getString("Status"));
			return tree;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

		
	}

}
