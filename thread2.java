class red extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Red signal!");
        }
    }
}
class green extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Green signal!");
        }
    }
}
class yellow extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            System.out.println("Yellow signal!");
        }
    }
}
class thread2{
    public static void main(String args[]){
        red r= new red();
        green g= new green();
        yellow y= new yellow();
        r.start();
        g.start();
        y.start();
    }
}