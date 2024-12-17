package attendance;

class Student {
    private int id;
    private String name;
    private String email;
    private String attendanceStatus;
    private String date, teacherId, stdId;

    public Student(String id, String name, String email, String attendanceStatus) {
        this.stdId = id;
        this.name = name;
        this.email = email;
        this.attendanceStatus = attendanceStatus;
    }
    public Student(int id, String name, String email, String attendanceStatus) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.attendanceStatus = attendanceStatus;
    }
    
    public Student() {
    	
    }
    
    public void setstdId(String id) {
    	this.stdId = id;
    }
    public void setId(int id) {
    	this.id = id;
    }public void setName(String name) {
    	this.name = name;
    }public void setEmail(String email) {
    	this.email = email;
    }public void setAttendanceStatus(String a) {
    	this.attendanceStatus = a;
    }public void setDate(String date) {
    	this.date = date;
    }public void setTeacherId(String id) {
    	this.teacherId = id;
    }
    
    public int getId() {
        return id;
    }

    public String getstdId() {
    	return stdId;
    }
    
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAttendanceStatus() {
        return attendanceStatus;
    }
}