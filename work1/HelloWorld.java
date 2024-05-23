//package class1;
//import Login;
public class HelloWorld {


  String username = "janeDoe";
  String Password = "password";
  
  String Login(){
      if(username.equals("janeDoe")&& Password.equals("password")){
        return "success";
      }else{
        System.out.println("incorrect");
        }
  
}

  public static void main(String[] args) {

    User jane = new User();
    System.out.println(jane.login());



     // inheritance, encapsulaton& polymorphism
      // interfaces & method overriding
      // data structures array, stack & queues
      // generics; lists, sets, maps
      // java swing library --------> file water
      // exception handling
      // streams API
    
      System.out.println("hello world");
  }
}