package OCATEST;

public class Q116 {

}
//Question 116
//
//Consider the following class:
//
//public class PortConnector{
//   public PortConnector(int port) throws IOException{
//   ...lot of valid code.
//   }
//   ...other valid code.
//}
//
//You want to write another class CleanConnector 
//that extends from PortConnector. Which of the following statements
//should hold true for CleanConnector class?
//
//Please select 1 option.
//
//It is not possible to define CleanConnector that 
//does not throw IOException at instantiation.
//
//PortConnector class itself is not valid because 
//you cannot throw any exception from a constructor.
//
//CleanConnector's constructor cannot throw any 
//exception other than subclass of IOException.
//
//CleanConnector's constructor cannot throw any 
//exception other than superclass of IOException.
//
//None of these.
//
//As PortConnector has only one constructor, 
//there is only one way to instantiate it. 
//Now, to instantiate any subclass of PortConnector,
//the subclass's constructor should call super(int). 
//But that throws IOException. And so this exception 
//(or its super class) must be defined in the throws 
//clause of subclass's constructor. Note that you cannot do something like:  
//
//public CleanConnector(){ Â Â Â 
//	try{ super(); }catch(Exception e){} //WRONG : call to super must be first statement in constructor 
//}  	
//
//Remember: Constructor must declare all the checked 
//exceptions declared in the base constructor 
//(or the super classes of the checked exceptions). 
//They may add other exceptions as well. 
//This behavior is exactly opposite from that of methods.
//The overriding method cannot throw any checked exception
//other than what the overridden method throws.
//It may throw subclasses of those exceptions as well.