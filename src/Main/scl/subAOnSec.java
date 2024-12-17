package Main.scl;

public class subAOnSec {

	private int id,aStatus=1,secId, subId;
	private String subAId, subFee,secFee, sId;
	
	public void setid(int id) {
		this.id = id;	
	}public void setaStatus(int aStatus) {
		this.aStatus = aStatus;
	}public void setsubAId(String subAId) {
		this.subAId = subAId;
	}public void setsecId(int secId) {
		this.secId = secId;
	}public void setsubId(int subId) {
		this.subId = subId;
	}public void setsubFee(String subFee) {
		this.subFee = subFee;
	}public void setsecFee(String secFee) {
		this.secFee = secFee;
	}public void setsId(String sId) {
		this.sId = sId;
	}
	
	public int getid() {
		return id;
	}public int getaStatus() {
		return aStatus;
	}public String getsubAId() {
		return subAId;
	}public int getsubId() {
		return subId;
	}public int getsecId() {
		return secId;
	}public String getsubFee() {
		return subFee;
	}public String getsecFee() {
		return secFee;
	}public String getsId() {
		return sId;
	}
	
	
	public String toString() {
		return subAId;
	}
	
	public static void main(String[] args) {

	}

}
