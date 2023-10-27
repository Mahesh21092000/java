public class Ethnus {
    public static void main(String[] args) {
        
    }
    
}
abstract class A{
 void eat(){
 System.out.print("eating fruits");
}
abstract void walk();
   
void walk(int a){
    System.out.println(a+"kms");
}
}

class B extends  A{
    public static void main(String[] args) {
        
    
B obj = new B();
obj.eat();
obj.walk(38);

}
}