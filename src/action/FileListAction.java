package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class FileListAction {
	private List<String> files;

	public String fileList() {
		files = new ArrayList();
		String root = ServletActionContext.getRequest().getRealPath("/upload");
		File rootDir = new File(root);
		String[] fileNames = rootDir.list();
		for (int i = 0; i < fileNames.length; i++) {
			files.add(fileNames[i]);
		}
		return "success";
	}

	public List<String> getFiles() {
		return files;
	}

	public void setFiles(List<String> files) {
		this.files = files;
	}

}
