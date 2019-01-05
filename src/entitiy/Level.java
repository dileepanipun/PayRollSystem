package entitiy;

public class Level {
    private int lvlID;
    private String lvlName;
    private double medicalVal;
    private double basicSalary;

    public Level() {
    }

    public Level(int lvlID, String lvlName, double medicalVal, double basicSalary) {
        this.lvlID = lvlID;
        this.lvlName = lvlName;
        this.medicalVal = medicalVal;
        this.basicSalary = basicSalary;
    }

    public int getLvlID() {
        return lvlID;
    }

    public void setLvlID(int lvlID) {
        this.lvlID = lvlID;
    }

    public String getLvlName() {
        return lvlName;
    }

    public void setLvlName(String lvlName) {
        this.lvlName = lvlName;
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
}
