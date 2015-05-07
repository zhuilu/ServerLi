package action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.dispatcher.mapper.ActionMapping;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import dao.UserDao;
import dao.UserDaoImpl;
import domain.User;

public class UserAction extends ActionSupport {
	private static UserAction userAction;
	static UserDao dao;

	public UserAction() {
	}

	public static UserAction getInstance(UserDao userDao) {
		if (userAction != null) {
		} else {
			userAction = new UserAction();
			dao = userDao;
		}
		return userAction;
	}

	public void login(Map<String, String[]> params, InvokeResponse response) {
		System.out.println("UserAction login");
		User user = new User();
		String name = params.get("username")[0];
		String pass = params.get("password")[0];
		user.setUsername(name);
		user.setPassword(pass);
		try {
			if (dao.checkUser(user)) {
				response.setFlag(true);
				response.setMessage("登录成功");
			} else {
				response.setFlag(false);
				response.setMessage("登录失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.setFlag(false);
			response.setMessage("登录失败");
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

	public static class Collumns {
		private static String username = "username";
		private static String password = "password";
	}
}