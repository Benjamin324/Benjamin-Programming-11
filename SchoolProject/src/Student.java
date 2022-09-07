public class Student {

    private String First;
    private String Last;

    private String name;
    private int grade;
    private static  int idnum = 0;
    private int studentno;

    //Constructor
    Student(String First, String Last, int grade) {
        this.First = First;
        this.Last = Last;
        this.name = First + " " + Last;
        this.grade = grade;
        studentno = idnum;
        idnum++;

    }
    //printing student
    public String toString(){
        return ("Name: " + this.name + " " + "  Grade: " + this.grade);
    }


//getters and setters
    public String getFirst() {
    return First;
    }

    public void setFirst(String first) {
        First = first;
    }

    public String getLast() {
        return Last;
    }

    public void setLast(String last) {
        Last = last;
    }
    public String getName() {
    return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentno() {
        return studentno;
    }

    public void setStudentno(int studentno) {
        this.studentno = studentno;
    }


}
