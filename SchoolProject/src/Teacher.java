public class Teacher {
    private String First;
    private String Last;
    private String subject;
    private static  int idnum = 0;
    private String Name;




    //Two constructors
    Teacher(String First, String Last, String subject) {
        this.First = First;
        this.Last = Last;
        this.subject = subject;
        this.Name = First + " " + Last;
    }

    //printing Teacher
    public String toString(){
        return ("Name: " + this.Name + " " + "  Subject: " + this.subject);
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
        return Name;
    }
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

}