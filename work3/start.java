package class3;

import class3.person.Student.Staff;
import class3.CMP202;

public class start {
    public static void main (String [] args){

        CMP202 CMP202 = new CMP202();
        CMP202.printUserDetails();

        person person = new person();

        person Student = new Student("Bingham", "eboh", "654321", "BHU/22/04/09/0009");
        
        person Staff = new Staff("Bingham", "abu", "654321", 667);



        
        physic physic = new physic();
        //Calling the physics method
        System.out.println( physic.calculateVelocity1(2.20303, 2.22345323, 50));
        System.out.println(physic.calculateVelocity(5.0303,50));

        
        
        // calling the person instance and methods


        //person person = new person();
        //person.name = "John";
        //System.out.println(person.getName());
        
        //Person person = new Person();
        //person.setName("David smith");
        //System.out.println(person.getName());

        //person.setPass("somto");
        //System.out.println(person.getPass());



        //person.password = "Password";
    
    }
}
