package dao;

import java.util.List;

import domain.Dict;
import domain.Sign;
import domain.User;

public interface DictDao {
	public boolean insertDict(Dict t);

	public boolean checkDict(Dict t);

	public boolean deleteDict(String user_name);

	public boolean updateDict(Dict user_name);

	public List queryDict();

}
