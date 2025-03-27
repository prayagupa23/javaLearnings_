class Parent{
    void show(){
        System.out.println("This is the parent class");
    }
}
class Child extends Parent{
    void show(){
        System.out.println("This is the child class");
    }
}
class methodOverride{
    public static void main(String[] args) {
        Parent obj = new Child(); // Runtime polymorphism
        obj.show();
    }
}
