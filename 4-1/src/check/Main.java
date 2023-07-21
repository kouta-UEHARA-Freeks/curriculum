package check;

import constants.Constants;

public class Main {
    
    //課題①
    private String firstName = "上原";
    private String lastName = "孝太";
    
    //課題②
    private void printName(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("prinNameメソッド → " + this.firstName + this.lastName);
    }
    
    

    public static void main(String[] args) {

       Main main = new Main();
       main.printName("七海", "真弥");
       
       Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
       pet.introduce();

       RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
       robotpet.introduce();
       
       
    }

    

    
    
    
    
}
