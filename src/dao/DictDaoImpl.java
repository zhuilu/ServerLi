package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import domain.Dict;
import domain.Sign;

public class DictDaoImpl implements DictDao {
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

	public boolean checkDict(Dict t) {
		// TODO Auto-generated method stub
		this.init();
		System.out.println("checkDict" + t);
		List list = null;
		try {
			list = sqlMap.queryForList("checkDict", t);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

	public boolean deleteDict(String user_name) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.delete("deleteUserByUserName", user_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	public boolean insertDict(Dict t) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.insert("insertDict", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List queryDict() {
		// TODO Auto-generated method stub
		List list = null;
		this.init();
		try {
			list = sqlMap.queryForList("getAllDict");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return list;

	}

	public boolean updateDict(Dict user_name) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.update("updateDict", user_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;
	}

}
