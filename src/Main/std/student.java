package Main.std;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.imageio.ImageIO;

import Main.fcomf.ImageUtil;
import Main.fcomf.TimeUtil;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class student {
	
	private String uId, sId, stdId, stdName, stdPhone, stdEmail, homePhone, stdReligion, address;
	private String dob, nidBirth, country, UnionWord, fatherName, motherName, fNid, mNid, gName;
	private String gAddress, gPhone, gEmail, stdImg, sMajor, stdPass, gender,addDate;
	private int aStatus;
	private Image image;
	private File file;
	private byte[] imgData;
	
	
	
	public void setFile(File file) {
		this.file = file;
	}
	public void setaStatus(int aStatus) {
		this.aStatus = aStatus;
	}
	public void setuId(String uId) {
		this.uId = uId;
	}public void setgender(String gender) {
		this.gender = gender;
	}
	public void setsId(String sId) {
		this.sId = sId;
	}	public void setstdName(String stdName) {
		this.stdName = stdName;
	}	public void setstdPhone(String stdPhone) {
		this.stdPhone = stdPhone;
	}	public void setstdEmail(String stdEmail) {
		this.stdEmail = stdEmail;
	}	public void sethomePhone(String homePhone) {
		this.homePhone = homePhone;
	}	public void setstdReligion(String stdReligion) {
		this.stdReligion = stdReligion;
	}	public void setaddress(String address) {
		this.address = address;
	}	public void setdob(String dob) {
		this.dob = dob;
	}	public void setnidBirth(String nidBirth) {
		this.nidBirth = nidBirth;
	}	public void setcountry(String country) {
		this.country = country;
	}	public void setUnionWord(String UnionWord) {
		this.UnionWord = UnionWord;
	}	public void setfatherName(String fatherName) {
		this.fatherName = fatherName;
	}	public void setmotherName(String motherName) {
		this.motherName = motherName;
	}	public void setfNid(String fNid) {
		this.fNid = fNid;
	}	public void setmNid(String mNid) {
		this.mNid = mNid;
	}	public void setgName(String gName) {
		this.gName = gName;
	}	public void setgAddress(String gAddress) {
		this.gAddress = gAddress;
	}	public void setgPhone(String gPhone) {
		this.gPhone = gPhone;
	}	public void setgEmail(String gEmail) {
		this.gEmail = gEmail;
	}	public void setstdImg(String stdImg) {
		this.stdImg = stdImg;
	}	public void setsMajor(String sMajor) {
		this.sMajor = sMajor;
	}	public void setstdPass(String stdPass) {
		this.stdPass = stdPass;
	}	public void setstdId(String stdId) {
		this.stdId = stdId;
	}	public void setAdmissionDate(String addDate)
	{
		this.addDate=addDate;
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
	public String getgender() {
		return gender;
	}
	public int getaStatus() {
		return aStatus;
	}
	public String getuId() {
		return uId;
	}public String getsId() {
		return sId;
	}public String getstdId() {
		return stdId;
	}public String getstdName() {
		return stdName;
	}public String getstdPhone() {
		return stdPhone;
	}public String getstdEmail() {
		return stdEmail;
	}public String gethomePhone() {
		return homePhone;
	}public String getstdReligion() {
		return stdReligion;
	}public String getdob() {
		return dob;
	}public String getaddress() {
		return address;
	}public String getcountry() {
		return country;
	}public String getUnionWord() {
		return UnionWord;
	}public String getfatherName() {
		return fatherName;
	}public String getmotherName() {
		return motherName;
	}public String getfNid() {
		return fNid;
	}public String getmNid() {
		return mNid;
	}public String getgName() {
		return gName;
	}public String getgAddress() {
		return gAddress;
	}public String getgPhone() {
		return gPhone;
	}public String getgEmail() {
		return gEmail;
	}public String getstdImg() {
		return stdImg;
	}public String getsMajor() {
		return sMajor;
	}public String getstdPass() {
		return stdPass;
	}public String getnidBirth() {
		return nidBirth;
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
	
	
	
	public Date getBirthDateInDateFormat()
	{
		Date date=null;
		try {
			date=new SimpleDateFormat("dd-MM-yyyy").parse(this.dob);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return date;
	}
	
	
	
	
	public static void main(String[] args) {
		

	}

}
