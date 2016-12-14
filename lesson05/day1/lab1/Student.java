package lesson5.day1.lab1;

class Student extends Person {

    private double GPA;
    private String major;
    private int    yearOfGraduation;

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public Student(String name, String SSN, int age, Gender gender, String address, String phoneNumber) {
        super(name, SSN, age, gender, address, phoneNumber);
    }

    public void display() {
        super.display();

        StringBuilder sb = new StringBuilder();
        sb.append(" GPA: " + GPA);
        sb.append("\n Major: " + major);
        sb.append("\n Year of graduation: " + yearOfGraduation);
        System.out.println(sb.toString());
    }
}
