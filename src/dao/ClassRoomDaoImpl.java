package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import domain.ClassRoom;;

public class ClassRoomDaoImpl implements ClassRoomDao{
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

	public boolean checkClassRoom(ClassRoom t) {
		// TODO Auto-generated method stub
		this.init();
		System.out.println("checkClassRoom" + t);
		List list = null;
		try {
			list = sqlMap.queryForList("checkClassRoom", t);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		if (list.size() > 0) {
			return true;
		}
		return false;
	}


	public boolean deleteClassRoom(String num) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.delete("deleteClassRoom",num);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean insertClassRoom(ClassRoom t) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.insert("insertClassRoom", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List queryClassRoom() {
		// TODO Auto-generated method stub
		List list = null;
		this.init();
		try {
			list = sqlMap.queryForList("getAllClassRoom");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return list;
	}

	public boolean updateClassRoom(ClassRoom t) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.update("updateClassRoom", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;

	}

	
}
