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
	public void save(User student) {
		userDao.save(student);
	}

	/**
	 * Override
	 */
	public void update(User student) {
		userDao.update(student);
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
