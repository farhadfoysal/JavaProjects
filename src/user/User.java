package user;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;

import Main.DBConnection;
import Main.fcomf.ImageUtil;
import Main.fcomf.TimeUtil;

public class User {

	private Connection con = null;
	private PreparedStatement pst = null, pstt=null, pstaY=null;
	private ResultSet rs = null, rsp=null;
	private String sql,sqlu,sqlaY;
	
	protected int id,aStatus,uType;
	protected String sId,tId,uId,tName,tPhone,tEmail,tPass,tAddress,tMajor,tBal,tLogo,addDate,nidBirth;
	protected Image image;
	protected File file;
	protected byte[] imgData;
	
	public User() {
		con = DBConnection.ConnectionDB();
	}
	
	public void setFile(File file) {
		this.file = file;
	}
	public void setaStatus(int aStatus) {
		this.aStatus = aStatus;
	}public void setuType(int uType) {
		this.uType = uType;
	}
	public void settId(String tId) {
		this.tId = tId;
	}public void settName(String tName) {
		this.tName = tName;
	}public void settPhone(String tPhone) {
		this.tPhone = tPhone;
	}public void settPass(String tPass) {
		this.tPass = tPass;
	}public void settAddress(String tAddress) {
		this.tAddress = tAddress;
	}public void settEmail(String tEmail) {
		this.tEmail = tEmail;
	}public void settMajor(String tMajor) {
		this.tMajor = tMajor;
	}public void settBal(String tBal) {
		this.tBal = tBal;
	}public void settLogo(String tLogo) {
		this.tLogo = tLogo;
	}public void setid(int id) {
		this.id = id;
	}public void setnidBirth(String nid) {
		this.nidBirth = nid;
	}public void setuId(String uId) {
		this.uId = uId;
	}public void setsId(String sId) {
		this.sId = sId;
	}public void setAdmissionDate(String addDate)
	{
		this.addDate=addDate;
	}
	
	
	
	public int getid() {
		return id;
	}
	public int getaStatus() {
		return aStatus;
	}public int getuType() {
		return uType;
	}
	public String gettId() {
		return tId;
	}public String gettName() {
		return tName;
	}public String gettPhone() {
		return tPhone;
	}public String gettPass() {
		return tPass;
	}public String gettAddress() {
		return tAddress;
	}public String gettEmail() {
		return tEmail;
	}public String gettMajor() {
		return tMajor;
	}public String gettBal() {
		return tBal;
	}public String gettLogo() {
		return tLogo;
	}public String getnidBirth() {
		return nidBirth;
	}public String getuId() {
		return uId;
	}public String getsId() {
		return sId;
	}
	
	
	
	
	public File getFile() {
		return file;
	}
	
	public byte[] getImgData() {
		
		try {
			FileInputStream fis = new FileInputStream(file);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
				byte[] buffer = new byte[4096];
				int byteRead;
				try {
					while((byteRead = fis.read(buffer)) != -1) {
						baos.write(buffer, 0, byteRead);
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
			imgData = baos.toByteArray();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return imgData;
	}
	
	public String generateAdmissionDate()
	{	
		addDate=TimeUtil.getCurrentTime();
		return addDate;
	}
	public String getAdmissionDate()
	{
		return addDate;
		
	}
	
	public void setProfilePic(Image image)
	{
		this.image=image;
	}
	
	public void setProfilePic(byte[] imagedata)
	{
		this.image=Toolkit.getDefaultToolkit().createImage(imagedata);
	}
	
	
	
	public Image getProfilePic()
	{
		return image;
	}
	public byte[] getProfilePicInBytes()
	{
		ByteArrayOutputStream imagedata=new ByteArrayOutputStream();
		try {
			ImageIO.write(ImageUtil.toBufferedImage(image), "jpg", imagedata);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return imagedata.toByteArray();
		
	}
	public Image getProfilePic(int width,int height)
	{
		return image.getScaledInstance(width, height, Image.SCALE_SMOOTH);
	}
	public BufferedImage getRoundedProfilePic(int width,int height,int radius)
	{
		return ImageUtil.makeRoundedCorner(ImageUtil.toBufferedImage(image.getScaledInstance(width, height, Image.SCALE_SMOOTH)), radius);
	}
	
	public static void main(String[] args) {
		

	}

}
