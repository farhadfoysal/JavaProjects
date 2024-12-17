package Main.Class;

public class Class {

	private int id, aStatus=1,aYearId,depId;
	private String clsId,sId,clsName,clsCode,aYear;
	
	
	public void setId(int id) {
		this.id = id;
	}public void setaStatus(int aStatus) {
		this.aStatus = aStatus;
	}public void setaYearId(int aYearId) {
		this.aYearId = aYearId;
	}public void setclsId(String clsId) {
		this.clsId = clsId;
	}public void setclsName(String clsName) {
		this.clsName = clsName;
	}public void setclsCode(String clsCode) {
		this.clsCode = clsCode;
	}public void setaYear(String aYear) {
		this.aYear = aYear;
	}public void setsId(String sId) {
		this.sId = sId;
	}public void setdepId(int depId) {
		this.depId = depId;
	}
	
	public int getId() {
		return id;
	}public int getdepId() {
		return depId;
	}public int getaStatus() {
		return aStatus;
	}public int getaYearId() {
		return aYearId;
	}public String getclsName() {
		return clsName;
	}public String getclsCode() {
		return clsCode;
	}public String getaYear() {
		return aYear;
	}public String getclsId() {
		return clsId;
	}public String getsId() {
		return sId;
	}
	
	
	public String toString() {
		return clsName+"("+aYear+")";
	}
	
	public static void main(String[] args) {


	}

}
