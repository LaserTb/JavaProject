package OCATEST;


//	What will the following code print when compiled and run?
			class Q32{
			   void methodA(){
			      System.out.println("base - MethodA");
			   }
			}

			class Sub extends Q32{
			   public void methodA(){
			      System.out.println("sub - MethodA");
			   }
			   public void methodB(){
			      System.out.println("sub - MethodB");
			   }
			   public static void main(String args[]){
			      Q32 b=new Sub(); //1
			      b.methodA(); //2
//			      b.methodB(); //3
			   }
			}

//			Please select 1 option.
//
//			sub - MethodA and sub - MethodB
//
//			base - MethodA and sub - MethodB
//
//			Compile time error at //1
//
//			Compile time error at //2
//
//			Compile time error at //3
//
//			The point to understand here is, b is declared to be a reference 
//			of class Base and methodB() is not defined in Base.
//			So the compiler cannot accept the statement b.methodB()
//			because it only verifies the validity of a call by looking
//			at the declared class of the reference. 
//			For example, the compiler is able to verify that b.methodA()
//			is a valid call because class Base has method methodA. 
//			But it does not "bind" the call. Call binding is done 
//			at runtime by the jvm and the jvm looks for the actual class 
//			of object referenced by the variable before invoking the method.