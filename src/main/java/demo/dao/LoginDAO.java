package demo.dao;

import demo.exceptions.UserNotFoundException;
import demo.model.UserDetail;

public interface LoginDAO {
	//C
	public UserDetail createUser(UserDetail user);
	//R
	public UserDetail getUserDetailsByUserName(String username)throws UserNotFoundException;
	//U
	
	//D
	
	

}
