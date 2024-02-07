package demo.service;

import demo.exceptions.PasswordMismatchException;
import demo.exceptions.UserNotFoundException;
import demo.model.UserDetail;

public interface LoginService {
	//C
	public UserDetail createUser(UserDetail user);
	//R
	public UserDetail getUserDetailsByUserName(String username)throws UserNotFoundException;
	//Verify UserName and Password
	public boolean verifyUserNameAndPassword(UserDetail user)throws PasswordMismatchException, UserNotFoundException;

}