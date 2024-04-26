public class chapter317test {
    public static void main(String[] args) {
        // Create an instance of chapter317
        chapter317 profile = new chapter317("John", "Doe", "Male", 5, 15, 1985, 70, 170);

        // Display person's information
        System.out.println("First Name: " + profile.getFirstName());
        System.out.println("Last Name: " + profile.getLastName());
        System.out.println("Gender: " + profile.getGender());
        System.out.println("Date of Birth: " + profile.getBirthMonth() + "/" + profile.getBirthDay() + "/" + profile.getBirthYear());
        System.out.println("Height: " + profile.getHeightInches() + " inches");
        System.out.println("Weight: " + profile.getWeightPounds() + " pounds");

        // Calculate and display additional information
        System.out.println("Age: " + profile.calculateAge() + " years");
        System.out.println("BMI: " + profile.calculateBMI());
        System.out.println("Maximum Heart Rate: " + profile.calculateMaxHeartRate());
        System.out.println("Target Heart Rate Range: " + profile.calculateTargetHeartRateRange());
    }
}
