package action;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionSupport;
import dao.UserDao;
import domain.User;

public class UserAction extends ActionSupport {
	public UserDao dao;
	public String name = "";
	public String password = "";

	public UserAction() {
	}

	public String login() {
		System.out.println("UserAction login=" + name + "     " + password);
		User user = new User();
		user.setUsername(name);
		user.setPassword(password);
		try {
			if (dao.checkUser(user)) {
				return SUCCESS;
			} else {
				return INPUT;
			}
		} catch (Exception e) {
			e.printStackTrace();
			return INPUT;
		}

	}

	public List<User> queryall() {
		List<User> list = dao.queryUser();

		return list;
	}

	public boolean update(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		boolean b = dao.updateUser(user);
		if (b == true) {
			return true;
		}
		return false;
	}

	public boolean delete() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String username = request.getParameter("username");
		boolean b = dao.deleteUser(username);
		if (b == true) {
			return true;

		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}