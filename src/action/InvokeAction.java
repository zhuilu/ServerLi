package action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import util.Iconst;
import dao.DictDao;
import dao.MessageDao;
import dao.UserDao;
import domain.Message;
import domain.User;

public class InvokeAction {

	public void invokeMethod() {
		JSONObject jsonResult = new JSONObject();
		HttpServletRequest request = ServletActionContext.getRequest();
		String method = request.getParameter("method");
		System.out.println(System.currentTimeMillis() + ":" + method);
		Map<String, String[]> params = request.getParameterMap();
		InvokeResponse invokeResponse = new InvokeResponse();
		if (method != null) {
			if (method.equals("login")) {
				UserAction.getInstance(dao).login(params, invokeResponse);
			} else if (method.equals("insertDict")) {
				DictAction.getInstance(dict).insertDict(params, invokeResponse);
			}
			// else if (method.equals("signin")) {
			// UserAction.getInstance().signin(params, jsonResult);
			// } else if (method.equals("resetpassword")) {
			// UserAction.getInstance().signin(params, jsonResult);

			else {
				invokeResponse.setFlag(false);
				invokeResponse.setMessage("该方法未注册");
			}
		} else {
			invokeResponse.setFlag(false);
			invokeResponse.setMessage("请求参数中需包含Method");
		}
		jsonResult.put(Iconst.RTN_FLAG, invokeResponse.isFlag() ? "true"
				: "false");
		jsonResult.put(Iconst.RTN_MSG, invokeResponse.getMessage());
		if (!jsonResult.containsKey(Iconst.RTN_OBJ)) {
			jsonResult.put(Iconst.RTN_OBJ, "");
		} else {
			jsonResult.put(Iconst.RTN_OBJ, invokeResponse.getObj());
		}
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		try {// 返回json对象
			System.out.println(jsonResult.toString());
			response.getWriter().write(jsonResult.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private UserDao dao;

	public DictDao getDict() {
		return dict;
	}

	public void setDict(DictDao dict) {
		this.dict = dict;
	}

	private DictDao dict;

	// 添加如 private SignDao sign;

	public UserDao getDao() {
		return dao;
	}

	public void setDao(UserDao dao) {
		this.dao = dao;
	}
}