abstract class Base {
    abstract void fun();
}
class Derived extends Base {
    void fun() { System.out.println("Derived fun() called"); }
}
class Main {
    public static void main(String args[]) { 
     
        // Uncommenting the following line will cause compiler error as the 
        // line tries to create an instance of abstract class.
        // Base b = new Base();
 
        // We can have references of Base type.
		Derived b1=new Derived();
		        b1.fun();
		//Derived b=new Base();//error can not create object for abstract class
		Base b = new Derived();
        b.fun(); 
    }
}