package tk.dntree.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import tk.dntree.dao.IUserDAO;
import tk.dntree.model.UserModel;

public class UserDAO extends AbstractDAO implements IUserDAO {

	@Override
	public List<UserModel> findAll() {
		// ArrList contain result
		ArrayList<UserModel> results = new ArrayList<>();
		// Sql Statement
		String sqlStmt="select * from nguoidung";
		//Câu lệnh chuẩn bị trước : select * from ?
		PreparedStatement preStmt=null; 
		Connection connectionDB = getConnection();
		//Kết quả sau khi query sẽ lưu vào đối tượng resultSet
		ResultSet resultSet= null;
		
		if(connectionDB != null) {
			try {
				preStmt = connectionDB.prepareStatement(sqlStmt);
				resultSet = preStmt.executeQuery();
				while(resultSet.next()) {
					UserModel user=new UserModel();
					user.setIdUser(resultSet.getLong("id"));
					///blabla
				}
				
				return results;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				return null;
			}finally {
				try {
					if(connectionDB !=null) {
						connectionDB.close();
					}
					if(preStmt !=null) {
						preStmt.close();
					}
					if(resultSet!=null) {
						resultSet.close();
					}
				}catch(SQLException e) {
					return null;
				}
			}
		}
		return null;
		
	}

}
