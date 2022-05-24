package Students;

import java.util.UUID;

public class Student {
    private String id;

    private int consecNum;
    private String firstname;
    private String lastname;
    private String location;
    private String subject;

    public Student(String firstname, String lastname, String location, String subject){
        this.id = UUID.randomUUID().toString();
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

    public void setSubject(String subject) {
        this.subject = subject;
    }
    public String getSubject() {
        return subject;
    }

}
