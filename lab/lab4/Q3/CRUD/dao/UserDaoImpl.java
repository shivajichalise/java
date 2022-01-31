package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import config.DbConfig;
import models.User;

public class UserDaoImpl implements UserDao {

	PreparedStatement stmt = null;

	/**
	 * Override
	 */
	public void save(User user) {

		String query = "INSERT INTO users (`name`, `age`, `address`) VALUES(?, ?, ?)";

		try {
			stmt = DbConfig.getConnection().prepareStatement(query);
			stmt.setString(1, user.getName());
			stmt.setInt(2, user.getAge());
			stmt.setString(3, user.getAddress());

			stmt.executeUpdate();

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Override
	 */
	public void update(User user) {
		String query = "UPDATE `users` SET `name` = ?, `age` = ?, `address` = ? WHERE `users`.`id` = ?";

		try {
			stmt = DbConfig.getConnection().prepareStatement(query);
			stmt.setString(1, user.getName());
			stmt.setInt(2, user.getAge());
			stmt.setString(3, user.getAddress());
			stmt.setInt(4, user.getId());
			stmt.executeUpdate();

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
			stmt = DbConfig.getConnection().prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();

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
		String query = "DELETE FROM `users` WHERE `users`.`id` = ?";

		try {
			stmt = DbConfig.getConnection().prepareStatement(query);
			stmt.setInt(1, id);
			stmt.executeUpdate();
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
			stmt = DbConfig.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			ResultSet rs = stmt.executeQuery();
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
