package action;

import java.io.InputStream;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport {
	public String fileName;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getDownloadFile() {
		return ServletActionContext.getServletContext().getResourceAsStream(
				"/upload/" + fileName);

	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

}
