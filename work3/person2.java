package class3;

public class person2{
    private String name;
    private String schoolName;
  
    public person2(String name, String schoolName) {
      this.name = name;
      this.schoolName = schoolName;
    }
  
    public String getName() {
      return name;
    }
  
    public String getSchoolName() {
      return schoolName;
    }
  }
  
  class Student extends person2 {
    private String matricNumber;
    private String password;
  
    public Student(String name, String schoolName, String matricNumber, String password) {
      super(name, schoolName);
      this.matricNumber = matricNumber;
      this.password = password;
    }
  
    public String getMatricNumber() {
      return matricNumber;
    }
  }
  
  class Staff extends person2 {
    private int staffNumber;
    private String password;
  
    public Staff(String name, String schoolName, int staffNumber, String password) {
      super(name, schoolName);
      this.staffNumber = staffNumber;
      this.password = password;
    }
  
    public int getStaffNumber() {  
      return staffNumber;
    }
  }

