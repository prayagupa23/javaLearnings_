class thisOp{
    int a,b;
    void getData(int a,int b){
        this.a=a;
        this.b=b;
    }
    void display(){
        System.out.println("Values of a and b using this keyword:\na= "+a+", b= "+b);
    }
}
class thisDemo{
    public static void main(String args[]){
        thisOp t1= new thisOp();
        t1.getData(10,20);
        t1.display();
    }
}