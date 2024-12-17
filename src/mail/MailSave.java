package mail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Main.DBConnection;

public class MailSave {

	private Connection con = null;
	private PreparedStatement pst = null, pstt=null, pstaY=null;
	private ResultSet rs = null, rsp=null;
	private String sql,sqlu,sqlaY;
	
	public MailSave(){
		con = DBConnection.ConnectionDB();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
