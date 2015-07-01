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

import dao.DictDao;
import dao.UserDao;
import dao.UserDaoImpl;
import domain.Dict;
import domain.User;

public class DictAction extends ActionSupport {
	private static DictAction dictAction;
	static DictDao dao;
//	泰尔精细化工有限公司
	public DictAction() {
	}

	public static DictAction getInstance(DictDao dictDao) {
		if (dictAction != null) {
		} else {
			dictAction = new DictAction();
			dao = dictDao;
		}
		return dictAction;
	}

	public List<Dict> queryall(Map<String, String[]> params,
			InvokeResponse response) {
		List<Dict> list = dao.queryDict();

		return list;
	}

	public boolean insertDict(Map<String, String[]> params,
			InvokeResponse response) {
		Dict dict = new Dict(params);
		boolean b = dao.insertDict(dict);
		if (b == true) {
			return true;
		}
		return false;
	}

	public boolean update(Map<String, String[]> params, InvokeResponse response) {
		Dict Dict = new Dict();
		boolean b = dao.updateDict(Dict);
		if (b == true) {
			return true;
		}
		return false;
	}

	public boolean delete(Map<String, String[]> params, InvokeResponse response) {
		HttpServletRequest request = ServletActionContext.getRequest();
		String Dictname = request.getParameter("Dictname");
		boolean b = dao.deleteDict(Dictname);
		if (b == true) {
			return true;

		}
		return false;
	}

}