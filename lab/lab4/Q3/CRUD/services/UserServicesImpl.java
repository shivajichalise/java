package services;

import java.util.List;

import dao.UserDao;
import dao.UserDaoImpl;
import models.User;

public class UserServicesImpl implements UserServices {

	UserDao userDao = new UserDaoImpl();

	/**
	 * Override
	 */
	public void save(User user) {
		userDao.save(user);
	}

	/**
	 * Override
	 */
	public void update(User user) {
		userDao.update(user);
	}

	/**
	 * Override
	 */
	public List<User> all() {
		return userDao.all();
	}

	/**
	 * Override
	 */
	public void delete(int id) {
		userDao.delete(id);
	}

	/**
	 * Override
	 */
	public User get(int id) {
		return userDao.get(id);
	}
}
