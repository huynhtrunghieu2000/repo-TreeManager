package tk.dntree.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import tk.dntree.model.UserModel;

public class UserMapper implements RowMapper<UserModel> {

	@Override
	public UserModel MapRow(ResultSet resultSet) {
		try {
			UserModel user = new UserModel();
			user.setId(resultSet.getInt("ID_user"));
			//.....
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
