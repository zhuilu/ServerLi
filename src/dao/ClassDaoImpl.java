package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import domain.Class;

public class ClassDaoImpl implements ClassDao {
	private static SqlMapClient sqlMap;

	void init() {
		try {
			Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
			sqlMap = SqlMapClientBuilder.buildSqlMapClient(reader);
			reader.close();
		} catch (IOException e) {
			throw new RuntimeException(
					"Something bad happened while building the SqlMapClient instance."
							+ e, e);
		}
	}
	public List queryClass() {
		// TODO Auto-generated method stub
		List list = null;
		this.init();
		try {
			list = sqlMap.queryForList("getAllClass");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return list;

	}


	public boolean deleteClass(String item_id) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.delete("deleteClassByItemId",item_id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean insertClass(Class t) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.insert("insertClass", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}



	public boolean updateClass(Class t) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.update("updateClass", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;

	}
	public boolean checkClass(Class t) {
		// TODO Auto-generated method stub
		this.init();
		System.out.println("checkClass" + t);
		List list = null;
		try {
			list = sqlMap.queryForList("checkClass", t);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		if (list.size() > 0) {
			return true;
		}
		return false;
	}
	}

