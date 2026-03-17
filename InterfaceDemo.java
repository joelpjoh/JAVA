interface vehicle
{
    String NAME="i10";
    void msg();
}
class Car implements vehicle{
    int cno=6789;
    public void msg()
    {
        System.out.println("Vehicle name:"+NAME);
        System.out.println("vehicle no.:"+cno);
    }
}
class InterfaceDemo
{
    public static void main(String args[])
    {
        Car ob=new Car();
        ob.msg();

    }
}