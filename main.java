// public class Main {
//   public static void main(String[] args) {
//     System.out.println("Hello World");
//   }
//  }

//TYPES OF VARIABLES IN JAVA
public class Main {
  public static void main(String[] args) {
    // Local variable
    int localVar = 10;
    System.out.println("Local Variable: " + localVar);

    // Instance variable
    Main instance = new Main();
    instance.instanceVar = 20;
    System.out.println("Instance Variable: " + instance.instanceVar);

    // Static variable
    Main.staticVar = 30;
    System.out.println("Static Variable: " + Main.staticVar);
  }
  // Instance variable
  int instanceVar;  
  // Static variable
  static int staticVar;
  // Local variable is defined inside the main method
  // and is not accessible outside of it.
  // Local variable is not defined here, it is defined in the main method.
  // Local variables must be initialized before use.
  // Instance variables are initialized to default values (0 for int).
  // Static variables are shared across all instances of the class.
  // Static variables are initialized to default values (0 for int).
  // Local variables are not shared and are specific to the method they are defined in.
  // Instance variables are tied to the instance of the class.
  // Static variables are tied to the class itself.
  // Local variables are not stored in the heap, they are stored in the stack.
  // Instance variables are stored in the heap as part of the object.
  // Static variables are stored in the method area of the JVM.
  // Local variables are not accessible outside the method they are defined in.
  // Instance variables can be accessed by all methods in the class.
  // Static variables can be accessed by all instances of the class and also by
  // the class name itself.
  // Local variables are typically used for temporary calculations or state.
  // Instance variables are used to represent the state of an object.
  // Static variables are used for shared state across all instances of the class.
  // Local variables are not part of the class structure.
  // Instance variables are part of the class structure. 
}