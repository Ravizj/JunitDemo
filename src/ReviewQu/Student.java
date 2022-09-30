package ReviewQu;

class Student{
    int id;
    String Address;
    String name;
    Student(int i,String n,String a){
        id=i;
        name=n;
        Address=a;
    }
    //method to display the value of id and name
    void display()
    {System.out.println(id+" "+name+" "+Address);}

    public static void main(String args[]){
//creating objects  
        Student s1=new Student(11,"Ravi","sd");
        Student s2=new Student(23,"tushar","gfdg");
        Student s3=new Student(11,"Ravi","fdgdf");
        Student s4=new Student(23,"tushar","gffdg");
//displaying values of the object  
        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}  