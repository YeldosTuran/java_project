package Model;

public class Subject {
    private String name;
    private float attendence;

    public Subject(String name, float attendence) {
        this.name = name;
        this.attendence = attendence;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAttendence() {
        return attendence;
    }

    public void setAttendence(float attendence) {
        this.attendence = attendence;
    }

}
