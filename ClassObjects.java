//concept of classes, constructors and objects in java.


//declaring a class 
class student{

    //data members of class student
    int rollNo;
    String name;
    int proj_id;
    String dept;
    
    //declaring a constructor initializing rollNo & name
    student(int rno, String n){
        rollNo= rno;
        name= n;
    }
     
    //defining methods getData-->initialize data members proj_id, dept; and display-->displaying details
    void getData(int pid, String dept_name){
        proj_id= pid;
        dept= dept_name;
    }
    void display(){
        System.out.println("-----Student Details-----");
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNo);
        System.out.println("Department Name: "+dept);
        System.out.println("Project id: "+proj_id);
    }
}

//creating the final class with the main function
class ClassObjects{
    public static void main(String args[]){

        //creating an object of student class & passing parameters to the constructor of student class.
        student s= new student(62,"Prayag");
     
        //calling the methods of student class using the dot(.) operator
        s.getData(23,"Computer");
        s.display();
    }
}