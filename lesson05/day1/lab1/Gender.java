package lesson5.day1.lab1;

enum Gender {
    
    FEMALE("Female"), MALE("Male"), OTHER("Other");
    
    Gender(String description) {
        this.description = description;
    }
    
    String description;
}
