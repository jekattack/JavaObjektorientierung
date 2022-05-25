package Students3;

import java.util.UUID;

public class ArtStudent extends Student {

    public ArtStudent(String id, String firstname, String lastname, String location, String subject){
        super(id, firstname, lastname, location, subject);
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
