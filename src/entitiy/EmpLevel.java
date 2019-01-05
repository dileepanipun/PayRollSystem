package entitiy;

public class EmpLevel {
    private int empLvlID;
    private int empNo;
    private int lvlID;
    private String changedDate;
    private int left;

    public EmpLevel() {
    }

    public EmpLevel(int empLvlID, int empNo, int lvlID, String changedDate, int left) {
        this.empLvlID = empLvlID;
        this.empNo = empNo;
        this.lvlID = lvlID;
        this.changedDate = changedDate;
        this.left = left;
    }

    public int getEmpLvlID() {
        return empLvlID;
    }

    public void setEmpLvlID(int empLvlID) {
        this.empLvlID = empLvlID;
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public int getLvlID() {
        return lvlID;
    }

    public void setLvlID(int lvlID) {
        this.lvlID = lvlID;
    }

    public String getChangedDate() {
        return changedDate;
    }

    public void setChangedDate(String changedDate) {
        this.changedDate = changedDate;
    }

    public int getLeft() {
        return left;
    }

    public void setLeft(int left) {
        this.left = left;
    }
}
