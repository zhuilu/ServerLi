package dao;

import java.util.List;

import domain.User;

public interface UserDao {
	public boolean insertUser(User t);

	public boolean checkUser(User t);

	public boolean deleteUser(String username);

	public boolean updateUser(User t);

	public List queryUser();

	public List queryUserName(String name);
}
