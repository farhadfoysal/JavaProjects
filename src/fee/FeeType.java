package fee;

public class FeeType {

	private int id, typeId,sessionId,depId,subId,secId,clsId,status=1,discount=1;
	private String typeName, sId, Amount;
	
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    // Setter and getter for typeId
    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public int getTypeId() {
        return typeId;
    }

    // Setter and getter for sessionId
    public void setSessionId(int sessionId) {
        this.sessionId = sessionId;
    }

    public int getSessionId() {
        return sessionId;
    }

    // Setter and getter for depId
    public void setDepId(int depId) {
        this.depId = depId;
    }

    public int getDepId() {
        return depId;
    }

    // Setter and getter for subId
    public void setSubId(int subId) {
        this.subId = subId;
    }

    public int getSubId() {
        return subId;
    }

    // Setter and getter for secId
    public void setSecId(int secId) {
        this.secId = secId;
    }

    public int getSecId() {
        return secId;
    }

    // Setter and getter for clsId
    public void setClsId(int clsId) {
        this.clsId = clsId;
    }

    public int getClsId() {
        return clsId;
    }

    // Setter and getter for status
    public void setStatus(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }

    // Setter and getter for discount
    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getDiscount() {
        return discount;
    }

    // Setter and getter for typeName
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeName() {
        return typeName;
    }

    // Setter and getter for sId
    public void setSId(String sId) {
        this.sId = sId;
    }

    public String getSId() {
        return sId;
    }

    // Setter and getter for Amount
    public void setAmount(String amount) {
        Amount = amount;
    }

    public String getAmount() {
        return Amount;
    }
	
	public static void main(String[] args) {


	}

}
