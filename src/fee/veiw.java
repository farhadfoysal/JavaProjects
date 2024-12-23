package fee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

import Main.DBConnection;
import Main.Subject.Subject;
import Main.scl.School;
import Main.scl.schoolData;

public class veiw extends fee{

	private Connection con = null;
	private PreparedStatement pst = null, pstt=null, pstaY=null;
	private ResultSet rs = null, rsp=null;
	private String sql,sqlu,sqlaY;
	
	public veiw(){
		con = DBConnection.ConnectionDB();
	}
	
	
	public int addFee(fee s) {
		int result = 0;
		
		sql = "INSERT INTO fee (sId,fee_type,feeDetails,fee,sessionId,subId,feeId,depId,status,clsId,secId,scholarshipStatus,discount,discountStatus,disAmount,payStatus,trxId,payMethod,date,time) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		
		try {
			pst = con.prepareStatement(sql);
			
			pst.setString(1, s.getsId());
			pst.setInt(2, s.getFeeType());
			pst.setString(3, s.getFeeDetails());
			pst.setString(4, s.getFee());
			pst.setInt(5, s.getSessionId());
			pst.setInt(6, s.getSubId());
			pst.setString(7, s.getFeeId());
			pst.setInt(8, s.getDepId());
			pst.setInt(9, s.getStatus());
			pst.setInt(10, s.getClsId());
			pst.setInt(11, s.getSecId());
			pst.setInt(12, s.getScholarshipStatus());
			pst.setInt(13, s.getdiscount());
			pst.setInt(14, s.getdiscountStatus());
			pst.setString(15, s.getdisAmount());
			pst.setInt(16, s.getPayStatus());
			pst.setString(17, s.getTrxId());
			pst.setString(18, s.getPayMethod());
			pst.setString(19, s.getDate());
			pst.setString(20, s.getTime());
			
			pst.execute();
			
//			int upS = new schoolData().updateSchoolNum("sCourse=sCourse+1", s.getsId());
//			if(upS==1) {
//				result = 1;
//			}
			return result;
			
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {
			try {
				pst.close();
			}catch(Exception ef){
				
			}
		}
		
		return result;
	}
	
	public String date() {
		LocalDate currentDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String date = currentDate.format(formatter);
		return date;
	}
	
	public int deleteFee(int id, String sId) {
		int result = 0;
		
		sql = "DELETE FROM fee WHERE id = ? and sId = ?";
		
		try {
			pst = con.prepareStatement(sql);
			
			pst.setInt(1, id);
			pst.setString(2, sId);
			pst.execute();
				
//			int upS = new schoolData().updateSchoolNum("sCourse=sCourse-1", sId);
//			if(upS==1) {
//				result = 1;
//			}
			return result;
			
		}  catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Fee Data didn't delete, Try Again!"+e1);
			e1.printStackTrace();
		}finally {
			try {
				pst.close();
			}catch(Exception ef){
				
			}
		}
		
		return result;
	}
	
	public fee getFee(int id, String sId) {
		fee s = new fee();
			
		sqlaY = "SELECT * FROM fee WHERE sId LIKE ? AND id LIKE ? order by id desc;";
		
		try {
			pst = con.prepareStatement(sqlaY);
			pst.setString(1, sId);
			pst.setInt(2, id);
	
			rs = pst.executeQuery();
			
			if(rs.next()) {
				
				s.setId(rs.getInt("id"));
				s.setsId(rs.getString("sId"));
				s.setFeeType(rs.getInt("fee_type"));
				s.setFeeDetails(rs.getString("feeDetails"));
				s.setFee(rs.getString("fee"));
				s.setSessionId(rs.getInt("sessionId"));
				s.setSubId(rs.getInt("subId"));
				s.setFeeId(rs.getString("feeId"));
				s.setDepId(rs.getInt("depId"));
				s.setStatus(rs.getInt("status"));
				s.setClsId(rs.getInt("clsId"));
				s.setSecId(rs.getInt("secId"));
				s.setScholarshipStatus(rs.getInt("scholarshipStatus"));
				s.setdiscount(rs.getInt("discount"));
				s.setdiscountStatus(rs.getInt("discountStatus"));
				s.setdisAmount(rs.getString("disAmount"));
				s.setPayStatus(rs.getInt("payStatus"));
				s.setTrxId(rs.getString("trxId"));
				s.setPayMethod(rs.getString("payMethod"));
				s.setDate(rs.getString("date"));
				s.setTime(rs.getString("time"));
				
				return s;
			}else {
				JOptionPane.showMessageDialog(null, "fee Not Found!");
			}
			
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Data base not Connected!");

			e1.printStackTrace();
		}finally {
			try {
				pst.close();
				rs.close();
			}catch(Exception ef){
				
			}
		}
		
		return s;
	}
	
	
	public ResultSet getFeeInfo(String sId){
		ResultSet res = null;
		
		sqlaY = "SELECT id,sId,fee_type,feeDetails,fee,sessionId,subId,feeId,depId,status,clsId,secId,scholarshipStatus,discount,discountStatus,disAmount,payStatus,trxId,payMethod,date,time FROM fee WHERE sId LIKE ?  order by id desc;";
		
		try {
			pst = con.prepareStatement(sqlaY);
			pst.setString(1, sId);
	
			res = pst.executeQuery();
			
			
			return res;
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Data base not Connected!");

			e1.printStackTrace();
		}finally {
			try {
//				pst.close();
//				res.close();
			}catch(Exception ef){
				
			}
		}
		
		return res;
	}

	public ResultSet getFeeInfoUser(String stdId){
		ResultSet res = null;
		
		sqlaY = "SELECT id,sId,fee_type,feeDetails,fee,sessionId,subId,feeId,depId,status,clsId,secId,scholarshipStatus,discount,discountStatus,disAmount,payStatus,trxId,payMethod,date,time FROM fee WHERE stdId LIKE ? order by id desc;";
		
		try {
			pst = con.prepareStatement(sqlaY);
			pst.setString(1, stdId);
	
			res = pst.executeQuery();
			
			
			return res;
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Data base not Connected!");

			e1.printStackTrace();
		}finally {
			try {
//				pst.close();
//				res.close();
			}catch(Exception ef){
				
			}
		}
		
		return res;
	}
	
	public ResultSet getFeeInfoUser(String stdId,int ses){
		ResultSet res = null;
		
		sqlaY = "SELECT id,sId,fee_type,feeDetails,fee,sessionId,subId,feeId,depId,status,clsId,secId,scholarshipStatus,discount,discountStatus,disAmount,payStatus,trxId,payMethod,date,time FROM fee WHERE stdId LIKE ? AND sessionId LIKE ? order by id desc;";
		
		try {
			pst = con.prepareStatement(sqlaY);
			pst.setString(1, stdId);
			pst.setInt(2,ses);
	
			res = pst.executeQuery();
			
			
			return res;
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Data base not Connected!");

			e1.printStackTrace();
		}finally {
			try {
//				pst.close();
//				res.close();
			}catch(Exception ef){
				
			}
		}
		
		return res;
	}
	
	public ResultSet getFeeInfoUser(String stdId,String condition){
		ResultSet res = null;
		
		sqlaY = "SELECT id,sId,fee_type,feeDetails,fee,sessionId,subId,feeId,depId,status,clsId,secId,scholarshipStatus,discount,discountStatus,disAmount,payStatus,trxId,payMethod,date,time FROM fee WHERE stdId LIKE ? "+condition+" order by id desc;";
		
		try {
			pst = con.prepareStatement(sqlaY);
			pst.setString(1, stdId);
	
			res = pst.executeQuery();
			
			
			return res;
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Data base not Connected!");

			e1.printStackTrace();
		}finally {
			try {
//				pst.close();
//				res.close();
			}catch(Exception ef){
				
			}
		}
		
		return res;
	}
	
	public ResultSet getFeeInfo(String sId,int i){
		ResultSet res = null;
		
		sqlaY = "SELECT id,sId,fee_type,feeDetails,fee,sessionId,subId,feeId,depId,status,clsId,secId,scholarshipStatus,discount,discountStatus,disAmount,payStatus,trxId,payMethod,date,time FROM fee WHERE sId LIKE ? AND sessionId LIKE ? order by id desc;";
		
		try {
			pst = con.prepareStatement(sqlaY);
			pst.setString(1, sId);
			pst.setInt(2, i);
	
			res = pst.executeQuery();
			
			
			return res;
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Data base not Connected!");

			e1.printStackTrace();
		}finally {
			try {
//				pst.close();
//				res.close();
			}catch(Exception ef){
				
			}
		}
		
		return res;
	}

	public ResultSet getFeeInfoByCls(String sId,int i){
		ResultSet res = null;
		
		sqlaY = "SELECT id,sId,fee_type,feeDetails,fee,sessionId,subId,feeId,depId,status,clsId,secId,scholarshipStatus,discount,discountStatus,disAmount,payStatus,trxId,payMethod,date,time FROM fee WHERE sId LIKE ? AND clsId LIKE ? order by id desc;";
		
		try {
			pst = con.prepareStatement(sqlaY);
			pst.setString(1, sId);
			pst.setInt(2, i);
	
			res = pst.executeQuery();
			
			
			return res;
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Data base not Connected!");

			e1.printStackTrace();
		}finally {
			try {
//				pst.close();
//				res.close();
			}catch(Exception ef){
				
			}
		}
		
		return res;
	}
	
	
public int updateFeeWaiver(fee s,String Waiver) {
		
		int result=0;
		
		sqlu = "UPDATE fee set scholarshipStatus = ?, discount = ?, disAmount = ?, fee = ?, discountStatus = ? WHERE  sId = ? AND stdId = ? AND id = ?";
		
		try {
			pst = con.prepareStatement(sqlu);
			pst.setInt(1, s.getScholarshipStatus());
			
			
			pst.setInt(2, s.getdiscount());
			pst.setString(3, s.getdisAmount());
			pst.setString(4, s.getFee());
			pst.setInt(5, s.getdiscountStatus());
			pst.setString(6, s.getSId());
			pst.setString(7, s.getstdId());
			pst.setInt(8, s.getId());

			pst.execute();
			
			pst.close();
			
			result = 1;
			return 1;
			
		} catch (SQLException e1) {
			
			JOptionPane.showMessageDialog(null, "Fee Data not updated, Try Again!"+e1);
			e1.printStackTrace();
		}finally {
			try {
				pst.close();
			}catch(Exception ef){
				
			}
		}
		
		return result;
		
	}
	

public int updateFeeWaiver(fee s,int Waiver) {
	
	int result=0;
	
	
	
	sqlu = "UPDATE fee set scholarshipStatus = ?, discount = ?, disAmount = ?, fee = ?, discountStatus = ? WHERE  sId = ? AND stdId = ? AND id = ?";
	
	try {
		pst = con.prepareStatement(sqlu);
		pst.setInt(1, s.getScholarshipStatus());
		
		
		pst.setInt(2, s.getdiscount());
		pst.setString(3, s.getdisAmount());
		pst.setString(4, s.getFee());
		pst.setInt(5, s.getdiscountStatus());
		pst.setString(6, s.getSId());
		pst.setString(7, s.getstdId());
		pst.setInt(8, s.getId());

		pst.execute();
		
		pst.close();
		
		result = 1;
		return 1;
		
	} catch (SQLException e1) {
		
		JOptionPane.showMessageDialog(null, "Fee Data not updated, Try Again!"+e1);
		e1.printStackTrace();
	}finally {
		try {
			pst.close();
		}catch(Exception ef){
			
		}
	}
	
	return result;
	
}
	
	public static void main(String[] args) {


	}

}
