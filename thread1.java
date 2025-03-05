class asc implements Runnable{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Ascending Order: "+ i);
        }
    }
}
class desc implements Runnable{
    public void run(){
        for(int i=10;i>=1;i--){
            System.out.println("Descending Order: "+i);
        }
    }
}
class thread1{
    public static void main(String args[]){
        asc a= new asc();
        desc d= new desc();
        Thread t1= new Thread(a);
        Thread t2= new Thread(d);
        t2.setPriority(10);
        t1.setPriority(1);
        int p= t1.getPriority();
        System.out.println("Priority of 2nd thread: "+p);
        t2.start();
        t1.start();
    }
}
