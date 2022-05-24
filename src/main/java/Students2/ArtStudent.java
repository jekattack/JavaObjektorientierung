package Students2;

import java.util.UUID;

public class ArtStudent implements Student {

    private String id;
    private String firstname;
    private String lastname;
    private String location;
    private String subject;


    public ArtStudent(String firstname, String lastname, String location, String subject){
        this.id = UUID.randomUUID().toString();
        this.firstname = firstname;
        this.lastname = lastname;
        this.location = location;
        this.subject = subject;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getFirstname() {
        return this.firstname;
    }

    @Override
    public String getLastname() {
        return this.lastname;
    }

    @Override
    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String getLocation() {
        return this.location;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getSubject() {
        return this.subject;
    }

}
