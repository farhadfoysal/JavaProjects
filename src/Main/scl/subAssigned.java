package Main.scl;

public class subAssigned {

	private int id,aStatus=1,clsId,subId,secId;
	private String subAId,sId,subFee,stdId;
	
	public void setid(int id) {
		this.id = id;
	}public void setaStatus(int aStatus){
		this.aStatus = aStatus;
	}public void setsubAId(String subAId){
		this.subAId = subAId;
	}public void setclsId(int clsId){
		this.clsId = clsId;
	}public void setsId(String sId){
		this.sId = sId;
	}public void setsubFee(String subFee){
		this.subFee = subFee;
	}public void setsubId(int subId){
		this.subId = subId;
	}public void setsecId(int secId){
		this.secId = secId;
	}public void setstdId(String stdId){
		this.stdId = stdId;
	}
	
	public int getid() {
		return id;
	}public int getaStatus(){
		return aStatus;
	}public String getsubAId(){
		return subAId;
	}public int getclsId(){
		return clsId;
	}public String getsId(){
		return sId;
	}public String getsubFee(){
		return subFee;
	}public int getsubId(){
		return subId;
	}public int getsecId(){
		return secId;
	}public String getstdId(){
		return stdId;
	}
	
	public String toString() {
		return subAId;
	}
	
	public static void main(String[] args) {


	}

}
