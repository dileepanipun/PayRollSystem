package entitiy;

public class DeletedEmployee {
    private int empno;
    private String empName;
    private String dob;
    private String user;

    public DeletedEmployee() {
    }

    public DeletedEmployee(int empno, String empName, String dob, String user) {
        this.empno = empno;
        this.empName = empName;
        this.dob = dob;
        this.user = user;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}


