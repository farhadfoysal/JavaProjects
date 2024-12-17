package Main.Session;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Main.DBConnection;

public class Session {

	private Connection con = null;
	private PreparedStatement pst = null, pstt=null, pstaY=null;
	private ResultSet rs = null, rsp=null;
	private String sql,sqlu,sqlaY;
	
	private String uId,sId,aYname,sYear,sMonth,eYear,eMonth;
	private int id,aStatus;
	
	public Session() {
		
	}
	
	public void setId(int id) {
		this.id = id;
	}public void setsId(String sId) {
		this.sId = sId;
	}public void setaYname(String aYname) {
		this.aYname = aYname;
	}public void setsYear(String sYear) {
		this.sYear = sYear;
	}public void setsMonth(String sMonth) {
		this.sMonth = sMonth;
	}public void seteYear(String eYear) {
		this.eYear = eYear;
	}public void seteMonth(String eMonth) {
		this.eMonth = eMonth;
	}public void setaStatus(int aStatus) {
		this.aStatus = aStatus;
	}
	
	
	public int getId() {
		return id;
	}public int getaStatus() {
		return aStatus;
	}public String getaYname() {
		return aYname;
	}public String getsYear() {
		return sYear;
	}public String getsMonth() {
		return sMonth;
	}public String geteYear() {
		return eYear;
	}public String eMonth() {
		return eMonth;
	}
	
	
	public String toString() {
		return aYname;
	}
	
	
	public static void main(String[] args) {


	}

}
