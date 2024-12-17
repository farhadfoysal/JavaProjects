package Main.scl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Main.DBConnection;

public class schoolDep {

	private Connection con = null;
	private PreparedStatement pst = null, pstt=null, pstaY=null;
	private ResultSet rs = null, rsp=null;
	private String sql,sqlu,sqlaY;
	
	private int id,mStatus;
	private String sId,mName,startId,endId,currentId;
	
	public schoolDep() {
		con = DBConnection.ConnectionDB();
	}
	
	public void setid(int id) {
		this.id = id;
	}public void setsId(String sId) {
		this.sId = sId;
	}public void setmStatus(int mStatus) {
		this.mStatus = mStatus;
	}public void setmName(String mName) {
		this.mName = mName;
	}public void setstartId(String startId) {
		this.startId = startId;
	}public void setendId(String endId) {
		this.endId = endId;
	}public void setcurrentId(String currentId) {
		this.currentId = currentId;
	}
	
	
	public int getid() {
		return id;
	}public int getmStatus() {
		return mStatus;
	}public String getmName() {
		return mName;
	}public String getstartId() {
		return startId;
	}public String getendId() {
		return endId;
	}public String getcurrentId() {
		return currentId;
	}public String getsId() {
		return sId;
	}
	
	public String toString() {
		return mName;
	}
	

	
	public static void main(String[] args) {


	}

}
