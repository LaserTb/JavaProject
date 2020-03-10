package OCATEST;

//What will the following class print when compiled and run?
class Holder{
   int value = 1;
   Holder link;
   public Holder(int val){ this.value = val; }
   public static void main(String[] args){
	final Holder a = new Holder(5);
	Holder b = new Holder(10);
	a.link = b;
	b.link = setIt(a, b);
	System.out.println(a.link.value+" "+b.link.value);
   }
   
   public static Holder setIt(final Holder x, final Holder y){
       x.link = y.link;
       return x;
   }
   
}
//
//Please select 1 option.
//
//It will not compile because 'a' is final.
//
//It will not compile because method setIt() cannot change x.link.
//
//It will print 5, 10.
//
//It will print 10, 10.
//
//It will throw an exception when run.      ja