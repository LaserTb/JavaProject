package OCATEST;

public class Q226{
    char c;
    public void m1(){
        char[ ] cA = { 'a' , 'b'};
        System.out.println("c in m1 vor den m2 angerufen :  " +( (int)c));
        m2(c, cA);
        System.out.println( ( (int)c)  + "," +  cA[1]);
        System.out.println("----");
        System.out.println("c in m1 nach den m2 angerufen :  " +( (int)c));
        System.out.println(cA);
    }
    public void m2(char c, char[ ] cA){
        c = 'b';
        System.out.println("c in m2: "+c);
        cA[1] = cA[0] = 'm';
    }
    public static void main(String args[]){
        new Q226().m1();
        
    }
}
