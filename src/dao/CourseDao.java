package dao;

import java.util.List;

import domain.Course;
import domain.User;

public interface CourseDao {
	public boolean insertCourse(Course t);
	
	public boolean checkCourse(Course t);

	public boolean deleteCourse(String course_name);

	public boolean updateCourse(Course t);

	public List queryCourse();
}
