package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.DbConfig;
import models.User;

public class UserDaoImpl implements UserDao {

	PreparedStatement ps = null;

	/**
	 * Override
	 */
	public void save(User user) {

		String sql = "INSERT INTO users ( `name`, `age`, `address`) VaLUES (?,?,?)";

		try {
			ps = DbConfig.getConnection().prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setInt(3, user.getAge());
			ps.setString(2, user.getAddress());

			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Override
	 */
	public void update(User user) {
		String sql = "UPDATE users SET name = ?, age= ?, address = ? where id = ?";

		try {
			ps = DbConfig.getConnection().prepareStatement(sql);
			ps.setString(1, user.getName());
			ps.setInt(3, user.getAge());
			ps.setString(2, user.getAddress());
			ps.setInt(4, user.getId());
			ps.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Override
	 */
	public List<User> all() {
		List<User> userList = new ArrayList<>();

		String sql = "SELECT * FROM users";

		try {
			ps = DbConfig.getConnection().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				User user = new User();
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				user.setAddress(rs.getString("address"));
				user.setId(rs.getInt("id"));

				userList.add(user);
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return userList;
	}

	/**
	 * Override
	 */
	public void delete(int id) {
		String sql = "DELETE from users where id = ?";

		try {
			ps = DbConfig.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Override
	 */
	public User get(int id) {
		User user = new User();
		String sql = "SELECT * from users where id=?";

		try {
			ps = DbConfig.getConnection().prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setAge(rs.getInt("age"));
				user.setAddress(rs.getString("address"));
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return user;

	}
}
