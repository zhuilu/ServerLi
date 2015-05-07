package dao;

import java.util.List;

import domain.Message;

public interface MessageDao {
	public boolean insertTest(Message t);

	public boolean deleteTest(String id);

	public boolean updateTest(Message t);

	public List queryTest();

	public List queryTestName(String name);
}
