package tk.dntree.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;

import tk.dntree.dao.GenericDAO;
import tk.dntree.mapper.RowMapper;

public class AbstractDAO<T> implements GenericDAO<T> {
	public Connection getConnection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/quanlycayxanh";
			String user = "root";
			String password = "huynhhieu123";
			return DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			return null;
		} catch (SQLException e) {
			return null;
		}

	}

	@Override
	public <T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters) {
		List<T> results = new ArrayList<>();
		Connection connectionDB = null;
		PreparedStatement preStmt = null;
		ResultSet resultSet = null;
		try {
			connectionDB = getConnection();
			preStmt = connectionDB.prepareStatement(sql);
			setParameters(preStmt, parameters);

			resultSet = preStmt.executeQuery();
			while (resultSet.next()) {
				results.add(rowMapper.MapRow(resultSet));
			}
			return results;
		} catch (SQLException e) {
			return null;
		} finally {
			try {
				if (connectionDB != null) {
					connectionDB.close();
				}
				if (preStmt != null) {
					preStmt.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e) {
				return null;
			}
		}

	}

	private void setParameters(PreparedStatement preStmt, Object... parameters) {
		try {
			for (int i = 0; i < parameters.length; i++) {
				Object parameter = parameters[i];
				int index = i + 1;
				if (parameter instanceof Long) {
					preStmt.setLong(index, (Long) parameter);
				} else if (parameter instanceof String) {
					preStmt.setString(index, (String) parameter);
				} else if (parameter instanceof Integer) {
					preStmt.setInt(index, (Integer) parameter);
				} else if (parameter instanceof Boolean) {
					preStmt.setBoolean(index, (Boolean) parameter);
				} else if (parameter instanceof Float) {
					preStmt.setFloat(index, (Float) parameter);
				} else if (parameter instanceof Double) {
					preStmt.setDouble(index, (Double) parameter);
				} else if (parameter instanceof Timestamp) {
					preStmt.setTimestamp(index, (Timestamp) parameter);
				} else if (parameter == null) {
					preStmt.setNull(index, Types.NULL);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void update(String sql, Object... parameters) {
		Connection connectionDB = null;
		PreparedStatement preStmt = null;
		try {
			connectionDB = getConnection();
			connectionDB.setAutoCommit(false);
			preStmt = connectionDB.prepareStatement(sql);
			setParameters(preStmt, parameters);
			preStmt.executeUpdate();
			connectionDB.commit();
		} catch (SQLException e) {
			if (connectionDB != null) {
				try {
					connectionDB.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			try {
				if (connectionDB != null) {
					connectionDB.close();
				}
				if (preStmt != null) {
					preStmt.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
	}

	@Override
	public Long insert(String sql, Object... parameters) {
		Connection connectionDB = null;
		PreparedStatement preStmt = null;
		ResultSet resultSet = null;
		try {
			Long id = null;
			connectionDB = getConnection();
			connectionDB.setAutoCommit(false);
			preStmt = connectionDB.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
			setParameters(preStmt, parameters);
			preStmt.executeUpdate();
			resultSet = preStmt.getGeneratedKeys();
			if (resultSet.next()) {
				id = resultSet.getLong(1);
			}
			connectionDB.commit();
			return id;
		} catch (SQLException e) {
			if (connectionDB != null) {
				try {
					connectionDB.rollback();
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}
		} finally {
			try {
				if (connectionDB != null) {
					connectionDB.close();
				}
				if (preStmt != null) {
					preStmt.close();
				}
				if (resultSet != null) {
					resultSet.close();
				}
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return null;
	}
}
