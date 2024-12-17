package Main.Subject;

public class Subject {

	private int id,aStatus;
	private String clsId,subName,sId,subId,subCode,subFee,subTeacherId;
	
	
	public void setid(int id) {
		this.id = id;
	}public void setaStatus(int aStatus) {
		this.aStatus = aStatus;
	}public void setsubId(String subId) {
		this.subId = subId;
	}public void setsubName(String subName) {
		this.subName = subName;
	}public void setsubCode(String subCode) {
		this.subCode = subCode;
	}public void setsubFee(String subFee) {
		this.subFee = subFee;
	}public void setsubTeacherId(String subTeacherId) {
		this.subTeacherId = subTeacherId;
	}public void setsId(String sId) {
		this.sId = sId;
	}public void setclsId(String clsId) {
		this.clsId = clsId;
	}
	
	public int getid() {
		return id;
	}public int getaStatus() {
		return aStatus;
	}public String getsubName() {
		return subName;
	}public String getsubCode() {
		return subCode;
	}public String getsubId() {
		return subId;
	}public String getsubFee() {
		return subFee;
	}public String getsubTeacherId() {
		return subTeacherId;
	}public String getsId() {
		return sId;
	}public String getclsId() {
		return clsId;
	}
	
	
	public String toString() {
		return subName+"("+""+")";
	}
	
	public static void main(String[] args) {


	}

}
