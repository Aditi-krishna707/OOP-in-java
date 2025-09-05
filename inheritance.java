class  Animals{

    void eat(){
        System.out.println("gress");
    }
    void king(){
        System.out.println("Lion");
    }

}
class dog extends Animals {

    void bark(){
        System.out.println(("dogs are barking"));
    }
}
public class inheritance {
    public static void main(String[] args) {
        dog mydog=new dog();
        mydog.eat();
        mydog.king();
        mydog.bark();
    }
}
// superclass->the class which is interited in other class