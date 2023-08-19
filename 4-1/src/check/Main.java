package check;

import constants.Constants;

public class Main {
    
    //課題①
    private String lastName = "上原";
    private String firstName = "孝太";
    
    //課題②
    private void printName(String lastName, String firstName) {
        this.lastName =lastName;
        this.firstName = firstName;
        System.out.println("printNameメソッド → " + lastName + firstName);
    }

      public static void main(String[] args) {

       Main main = new Main();
       main.printName(main.lastName, main.firstName);

       Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
       pet.introduce();

       RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
       robotpet.introduce();
              
    }
    
}