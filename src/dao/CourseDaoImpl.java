package dao;

import java.io.IOException;
import java.io.Reader;
import java.sql.SQLException;
import java.util.List;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

import domain.Course;

public class CourseDaoImpl implements CourseDao {
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

	public boolean checkCourse(Course t) {
		// TODO Auto-generated method stub
		this.init();
		System.out.println("checkCourse" + t);
		List list = null;
		try {
			list = sqlMap.queryForList("checkCourse", t);
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		if (list.size() > 0) {
			return true;
		}
		return false;
	}

	public boolean deleteCourse(String course_name) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.delete("deleteCourseByCourseName",course_name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}

	public boolean insertCourse(Course t) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.insert("insertCourse", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public List queryCourse() {
		// TODO Auto-generated method stub
		List list = null;
		this.init();
		try {
			list = sqlMap.queryForList("getAllCourse");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return list;

	}

	public boolean updateCourse(Course t) {
		// TODO Auto-generated method stub
		this.init();
		try {
			sqlMap.update("updateCourse", t);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return true;
	}

	
}
