package Main.Subject;

public class allSub {

	private int id,status=1,typeId,depId;
	private String clsId,subName,sId,subId,subCode,subFee,subTeacherId,semester;
	
	public void settypeId(int id) {
		this.typeId = id;
	}public void setdepId(int id) {
		this.depId = id;
	}
	public void setid(int id) {
		this.id = id;
	}public void setaStatus(int aStatus) {
		this.status = aStatus;
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
	}public void setsemester(String sId) {
		this.semester = sId;
	}
	
	public int gettypeId() {
		return typeId;
	}
	public int getdepId() {
		return depId;
	}
	public int getid() {
		return id;
	}public int getaStatus() {
		return status;
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
	}public String getsemester() {
		return semester;
	}
	
	
	public String toString() {
		return subName+"("+""+")";
	}
	
	public static void main(String[] args) {


	}

}
