package SchoolPackage;

public class Student {

    private String name = "";
    private int groupNr = 0;
    private String location = "";

    public Student(String name, int groupNr, String location){
        this.name = name;
        this.groupNr = groupNr;
        this.location = location;
    };

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setGroupNr(int groupNr) {
        this.groupNr = groupNr;
    }

    public int getGroupNr() {
        return groupNr;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String toString(){
        return name + ", " + groupNr + ", " + location;
    }

}
