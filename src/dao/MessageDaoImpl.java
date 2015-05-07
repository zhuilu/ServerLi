package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import domain.Message;

public class MessageDaoImpl implements MessageDao {
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

	public List queryTest() {

		List list = null;
		this.init();
		try {
			list = sqlMap.queryForList("getAllTest");
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;

	}

	public boolean deleteTest(String id) {
		this.init();
		try {
			sqlMap.delete("deleteTestById", id);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return true;

	}

	public boolean insertTest(Message t) {
		this.init();
		try {
			sqlMap.insert("insertMessage", t);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;

	}

	public boolean updateTest(Message t) {
		this.init();
		try {
			sqlMap.update("updateTest", t);
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return true;

	}

	public List queryTestName(String name) {

		this.init();
		List list = null;
		try {
			list = sqlMap.queryForList("selectTestByUsername", name);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return list;
	}

}
