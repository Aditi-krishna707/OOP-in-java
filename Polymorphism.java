// ploymotphism meand many phorms,it comes from greek poly means and morph means forms
// in polymorphism same method or oject behaves differenty in different context
// it is off  2 types->compileitme (method overloading) and runtime(overridding) 

// overloading ->it allows use to use method eith same name but different parameter(no. of paremeter,type of parameter)
// if we only change the return type of method it is not overloading

// multiple method can share a same name with different parameter
// Overloading does not depend on the return type of the method, two methods cannot be overloaded by just changing the return type.

// public class Polymorphism {
//     public  int sum(int a,int b,int c){
//         return a+b+c;
//     }
//     public double sum(double a,double b){
//         return a+b;
//     }
//     public int sum(int a){
//         return a;
//     }
//     public static void main(String[] args) {
//         Polymorphism p=new Polymorphism();
//         System.out.println(p.sum(1,2,3));
//         System.out.println(p.sum(1.8,2.7));
//         System.out.println(p.sum(1));

//     }
// }

// ///////////////////////OVERRIDING///////////////////////////////////
// overriding occurs when subclass or child class implement a method that is already
// in superclass 

/*it occurs when the the subclaass provides of its own version of the method that is already in the super class
 
 * RULES OF OVERRIDING
 * names,paremeter and return type must be same with parent class
 * Static method can't be override
 */

// class Teacher {
//     void DSA() {
//         System.out.println("T sir teach DSA");
//     }

//     void attandance() {
//         System.out.println("75% attandance is compulsary");
//     }
// }

// class students extends Teacher {
//     @Override
//     void DSA() {
//         System.out.println("I like the way S sir teach");
//     }
//     void about(){
//         System.out.println("he also have good dressing sence");
//     }
// }

// public class Polymorphism {

//     public static void main(String[] args) {
//         students obj = new students();
//         obj.DSA();
//         obj.about();
//         Teacher obj2=new Teacher();
//         obj2.DSA();
//     }
// }

// Overriding and Access-Modifiers
// class Parent {
//     // private methods are not overridden
//     private void m1()
//     {
//         System.out.println("From parent m1()");
//     }

//     protected void m2()
//     {
//         System.out.println("From parent m2()");
//     }
// }

// class Child extends Parent {
//     // new m1() method
//     // unique to Child class
//     private void m1()
//     {
//         System.out.println("From child m1()");
//     }

//     // overriding method
//     // with more accessibility
//     @Override public void m2()
//     {
//         System.out.println("From child m2()");
//     }
// }

// class Polymorphism {
//     public static void main(String[] args)
//     {
//         // parent class object
//         Parent P = new Parent();
//         P.m2();
//         // child class object
//         Parent C = new Child();
//         C.m2();
//     }
// }

// Agar parent class ka method private hai toh hum sub class ke methoda ko override 
// krne ke liye private ya public kr sakte hai(Access modifier jada rigid nahi hona chahiye parent class se)

// If we don't want a method to be overridden, we declare it as final.
// class Parent {
//     // Can't be overridden
//     final void show() {}
// }

// class Child extends Parent {
//     // This would produce error
//     void show() {}
// }

//  If a method is declared as final, subclasses cannot override it.

// when a staatic method in a subclass the same name and paraameter as in static method of superclass ic called method hiding
// this is only for the static method
// example of method hiding

// class Teachers{
//     static void display(){
//         System.out.println("Happy teachers day");
//     }
// }
// class students extends Teachers{
//     static void display(){
//         System.out.println("Our teacher is YouTube");
//     }
// }
// public class Polymorphism {

//     public static void main(String[] args) {
//         Teachers t=new Teachers();
//         students s=new students();
//         Teachers st=new students();

//         t.display();//Happy teacher day
//         s.display();//our teacher is youtube
//         st.display();//Happy teacher day        METHOD HIDING
//     }
// }

// Private Methods Cannot Be Overridden

// class Animals{
//     private void food(){
//         System.out.println("I like to eat");
//     }
//     public void sound(){
//         System.out.println("everyone have  its own voice");
//     }
// }
// class Dog extends Animals{
//     private void food(){
//         System.out.println("I like to eat cheenken");
//     }
//     public void sound(){
//         System.out.println("bho bho");
//     }
// }
// public class Polymorphism {

//     public static void main(String[] args) {
//         Animals a=new Animals();
//         Dog d=new Dog();
//         d.Dog();
//         a.Animals();

//     }
// }

class SuperClass {
    private void privateMethod() {
        System.out.println("it is a private method in SuperClass");
    }

    public void publicMethod() {
        System.out.println("it is a public method in SuperClass");
        privateMethod();
    }
}

class SubClass extends SuperClass {
    // This is a new method with the same name as the
    // private method in SuperClass
    private void privateMethod() {
        System.out.println("it is private method in SubClass");
    }

    // This method overrides the public method in SuperClass
    public void publicMethod() {
        // calls the private method in
        // SubClass, not SuperClass
        System.out.println("it is a public method in SubClass");
        privateMethod();
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        SuperClass o1 = new SuperClass();
        // calls the public method in
        // SuperClass
        o1.publicMethod();
        SubClass o2 = new SubClass();
        // calls the overridden public
        // method in SubClass
        o2.publicMethod();
    }
}