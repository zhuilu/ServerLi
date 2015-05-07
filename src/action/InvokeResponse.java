package action;

import java.util.List;

public class InvokeResponse {
	public String message = "";
	public boolean flag;
	public List<Object> obj;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public List<Object> getObj() {
		return obj;
	}

	public void setObj(List<Object> obj) {
		this.obj = obj;
	}
}
