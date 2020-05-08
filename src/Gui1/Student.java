package Gui1;

public class Student {
    private String name,surname,faculty,group;


    public Student() {
    }

    public Student(String name, String surname, String faculty, String group) {
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getFaculty() {
        return faculty;
    }

    public String getGroup() {
        return group;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return name + " " +
                surname + " " +
                 faculty + " " +
                group;
    }
}
