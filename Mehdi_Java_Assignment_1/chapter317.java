// Pakege chapter 3 

/*
*3.17 (Computerization of Health Records) A health-care issue that has been in the 
*news lately is the computerization of health records. This possibility is being approached
*cautiously because of sensitive privacy and security concerns, among others. [We address such
*concerns in later exercises.] Computerizing health records could make it easier for patients to
*share their health profiles and histories among their various health-care professionals. This could
*improve the quality of health care, help avoid drug conflicts and erroneous drug prescriptions, reduce costs
*and, in emergencies, could save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person.
*The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate
*attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class should have a 
*constructor that receives this data. For each attribute, provide set and get methods. The class also should include methods that
*calculate and return the user’s age in years, maximum heart rate and target-heart-rate range (see Exercise 3.16), and body mass index
*(BMI) (BMI; see Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of class HealthProfile for that
*person and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates
*and prints the person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display the BMI values chart from Exercise 2.33.
*/

public class chapter317 {
    private String firstName;
    private String lastName;
    private String gender;
    private int birthMonth;
    private int birthDay;
    private int birthYear;
    private int heightInches;
    private int weightPounds;

    public chapter317(String firstName, String lastName, String gender, int birthMonth, int birthDay, int birthYear, int heightInches, int weightPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.birthYear = birthYear;
        this.heightInches = heightInches;
        this.weightPounds = weightPounds;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }

    public int calculateAge() {
        // Calculate age based on birth date
        // Assume current year is 2024
        int currentYear = 2024;
        int age = currentYear - birthYear;
        if (birthMonth > 10 || (birthMonth == 10 && birthDay > 13)) {
            age--;
        }
        return age;
    }

    public double calculateBMI() {
        // Calculate BMI
        return (double) weightPounds / (heightInches * heightInches) * 703;
    }

    public int calculateMaxHeartRate() {
        // Calculate maximum heart rate
        return 220 - calculateAge();
    }

    public String calculateTargetHeartRateRange() {
        // Calculate target heart rate range
        int maxHeartRate = calculateMaxHeartRate();
        double lowerBound = maxHeartRate * 0.5;
        double upperBound = maxHeartRate * 0.85;
        return String.format("%.0f - %.0f", lowerBound, upperBound);
    }
}
