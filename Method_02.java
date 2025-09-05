public class Method_02 {
    private String name;
    private float salary;
    
    // constructor
    public Method_02(String name,float salary){
        this.name=name;
        this.salary=salary;
    }
    //  getter
    public String getName(){
        return name;
    }
    public float getSalary(){
        return salary;
    }

    // setter
    public void setName(String name){
        this.name=name;
    }
    public void ssetSalary(float salary){
        this.salary=salary;
    }
    public void print(){
        System.out.println("The name is :"+name);
        System.out.println("The salary is :"+salary);
    }

    public static void main(String[] args) {
        Method_02 obj=new Method_02("Tanmay", 10000);
        obj.print();
    }
}
// A setter method is used to update or modify the value of a private instance variable in 
// a safe and controlled way.

// A getter method is used to retrieve (read) the value of a private instance variable in 
// a safe and controlled manner.