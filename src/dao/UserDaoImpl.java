package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import domain.User;

public class UserDaoImpl implements UserDao {
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

	public List queryUser() {
		List list = null;
		this.init();
		try {
			list = sqlMap.queryForList("getAllUser");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return list;

	}

	public boolean deleteUser(String username) {
		this.init();
		try {
			sqlMap.delete("deleteUserById", username);
		}  catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	public boolean insertUser(User t) {
		this.init();
		try {
			sqlMap.insert("insertUser", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
		// TODO Auto-generated method stub
	}

	public boolean updateUser(User t) {
		this.init();
		try {
			sqlMap.update("updateUser", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;

	}

	public List queryUserName(String name) {
		// TODO Auto-generated method stub
		this.init();
		List list = null;
		try {
			list = sqlMap.queryForList("selectUserByUsername", name);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public boolean checkUser(User t) {
		this.init();
		System.out.println("checkUser" + t);
		List list = null;
		try {
			list = sqlMap.queryForList("checkUser", t);
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
