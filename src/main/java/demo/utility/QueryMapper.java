package demo.utility;

public interface QueryMapper {
	public static final String GET_USERDETAIL_BY_USERNAME = "select * from userdetail where username=?";
	public static final String ADD_USERDETAIL= "INSERT INTO USERDETAIL(userid,username,password) VALUES(?,?,?)";

}
