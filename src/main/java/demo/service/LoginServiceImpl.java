package demo.service;

import demo.dao.LoginDAO;
import demo.dao.LoginDAOImpl;
import demo.exceptions.PasswordMismatchException;
import demo.exceptions.UserNotFoundException;
import demo.model.UserDetail;

public class LoginServiceImpl implements LoginService {
	private LoginDAO loginDAO = new LoginDAOImpl();
	@Override
	public UserDetail createUser(UserDetail user) {
		
		return loginDAO.createUser(user);
	}

	@Override
	public UserDetail getUserDetailsByUserName(String username) throws UserNotFoundException {
		
		return loginDAO.getUserDetailsByUserName(username);
	}

	@Override
	public boolean verifyUserNameAndPassword(UserDetail user) throws PasswordMismatchException, UserNotFoundException{
		boolean flag = false;
		UserDetail userFromDB = loginDAO.getUserDetailsByUserName(user.getUserName());
		if(userFromDB.getUserName() != null) {
			if(userFromDB.getPassword().equals(user.getPassword())) {
				flag = true;
			}else {
				throw new PasswordMismatchException();
			}
			
		}
		return flag;
	}

}
