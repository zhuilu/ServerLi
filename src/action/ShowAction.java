package action;

import com.opensymphony.xwork2.ActionSupport;

public class ShowAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private String name;

	private String number = "3";

	public String showdetail() throws Exception {
		System.out.println("name=" + name);
		return SUCCESS;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

}
