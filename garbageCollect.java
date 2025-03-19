//simple java program to implement the concept of garbage collector.
class garbageCollect{
    public void finalize(){
        System.out.println("Object Destroyed Successfully!");
    }
    public static void main(String args[]){
        garbageCollect g1= new garbageCollect();
        garbageCollect g2= new garbageCollect();
        g1= null;
        g2= null;
        System.gc();
    }
}