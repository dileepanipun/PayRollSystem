package entitiy;

public class DeletedLevel {
    private int levelid;
    private String levelName;
    private double medicalVal;
    private double basicSalary;
    private String user;

    public DeletedLevel() {
    }

    public DeletedLevel(int levelid, String levelName, double medicalVal, double basicSalary, String user) {
        this.levelid = levelid;
        this.levelName = levelName;
        this.medicalVal = medicalVal;
        this.basicSalary = basicSalary;
        this.user = user;
    }

    public int getLevelid() {
        return levelid;
    }

    public void setLevelid(int levelid) {
        this.levelid = levelid;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public double getMedicalVal() {
        return medicalVal;
    }

    public void setMedicalVal(double medicalVal) {
        this.medicalVal = medicalVal;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
