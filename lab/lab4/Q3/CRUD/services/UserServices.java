package services;

import java.util.List;

import models.User;

public interface UserServices {
	public void save(User user);

	public void update(User user);

	public List<User> all();

	public void delete(int id);

	public User get(int id);
}
