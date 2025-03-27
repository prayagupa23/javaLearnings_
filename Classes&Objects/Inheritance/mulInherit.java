//program in java to implement multiple inheritance using interfaces.
interface Norms{
    static final int TA= 3000;
    static final float DA= 0.9f;
    static final float HRA= 0.6f;
}
class Emp{
    int emp_id;
    float basic_sal;
    void getData(int eid, float sal){
        emp_id= eid;
        basic_sal= sal;
    }
    void display(){
        System.out.println("-----EMPLOYEE DETAILS-----");
        System.out.println("Employee id: "+emp_id);
        System.out.println("Employee basic salary: "+basic_sal);
    }
}
class Emp_sal extends Emp implements Norms{
        float gross_sal;
        void cal_gs(){
            gross_sal= basic_sal+(basic_sal*DA)+(basic_sal*HRA)+TA;
        }
        void display(){
            super.display();
            System.out.println("Gross Salary of the Employee: "+gross_sal);
        }
}
class mulInherit{
    public static void main(String args[]){
        Emp_sal e1= new Emp_sal();
        e1.getData(101,15000);
        e1.cal_gs();
        e1.display();
    }
}