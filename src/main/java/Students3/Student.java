package Students3;

import java.util.UUID;

public abstract class Student{
    protected String id;
    protected int consecNum;
    protected String firstname;
    protected String lastname;
    protected String location;
    protected String subject;

    public Student(String id, String firstname, String lastname, String location, String subject){
        this.id = id;
        this.consecNum = 0;
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public int getConsecNum() {
        return consecNum;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getLocation() {
        return location;
    }

    public abstract void setSubject(String subject);
    public abstract String getSubject();

}
