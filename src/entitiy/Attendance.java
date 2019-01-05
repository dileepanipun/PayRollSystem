package entitiy;

public class Attendance {
    private int atid;
    private int empID;
    private String date;
    private String inTime;
    private String outTime;
    private int ot;

    public Attendance() {
    }

    public Attendance(int atid, int empID, String date, String inTime, String outTime, int ot) {
        this.atid = atid;
        this.empID = empID;
        this.date = date;
        this.inTime = inTime;
        this.outTime = outTime;
        this.ot = ot;
    }

    public int getAtid() {
        return atid;
    }

    public void setAtid(int atid) {
        this.atid = atid;
    }

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public int getOt() {
        return ot;
    }

    public void setOt(int ot) {
        this.ot = ot;
    }
}
