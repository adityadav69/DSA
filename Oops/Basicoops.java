public class Basicoops{

    public static void main(String[] args) {
        Animal horse=new Animal();
        horse.walk();
    }
}
class Animal{
    int feet;
    void walk(){
        System.out.println("Walking..");
    }
}