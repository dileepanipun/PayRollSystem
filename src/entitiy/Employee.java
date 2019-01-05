package entitiy;

public class Employee {
    private int empno;
    private String EmpName;
    private String empAddress;
    private String dob;

    public Employee() {
    }

    public Employee(int empno, String empName, String empAddress, String dob) {
        this.empno = empno;
        EmpName = empName;
        this.empAddress = empAddress;
        this.dob = dob;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
}
