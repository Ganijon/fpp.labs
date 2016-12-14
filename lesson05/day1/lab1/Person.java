package lesson5.day1.lab1;

abstract class Person {

    protected String name;
    protected String SSN;        //abbreviated Social Security Number
    protected int    age;
    protected Gender gender;
    protected String address;
    protected String phoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSSN() {
        return SSN;
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public Person(String name, String SSN, int age, Gender gender, String address, String phoneNumber) {
        this.name = name;
        this.SSN = SSN;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void display() {

        String entityName = getClass().getSimpleName().replaceAll("([A-Z][a-z]+)", " $1");

        StringBuilder sb = new StringBuilder("\n");
        sb.append(entityName.toUpperCase().trim());
        sb.append("\n Name: " + name);
        sb.append("\n SSN: " + SSN);
        sb.append(String.format("\n Age: %syrs", age));
        sb.append("\n Gender: " + gender.description);
        sb.append("\n Address: " + address);
        sb.append("\n Telephone Number: " + phoneNumber);
        System.out.println(sb.toString());
    }
}
