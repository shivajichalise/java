import java.util.List;

import models.User;
import services.UserServices;
import services.UserServicesImpl;

public class UserController {

	public void saveUser(String name, int age, String address) {
		UserServices userService = new UserServicesImpl();

		User user = new User();
		user.setName(name);
		user.setAge(age);
		user.setAddress(address);

		userService.save(user);
	}

	public void updateUser(int id, String name, int age, String address) {

		UserServices userService = new UserServicesImpl();
		User user = userService.get(id);

		user.setName(name);
		user.setAge(age);
		user.setAddress(address);

		userService.update(user);

	}

	public void deleteUser(int id) {
		UserServices userService = new UserServicesImpl();
		userService.delete(id);
	}

	public User getUser(int id) {
		UserServices userService = new UserServicesImpl();
		User user = userService.get(id);
		return user;
	}

	public List<User> listUsers() {
		UserServices userService = new UserServicesImpl();
		List<User> userLists = userService.all();
		System.out.println(userLists);
		return userLists;
	}

	public static void main(String[] args) {
		UserController mainDemo = new UserController();
		mainDemo.listUsers();
	}
}
