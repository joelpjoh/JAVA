class Principal
 {
    String name="Rakesh";    
}
class Teacher extends Principal
{
    int tchrid=56;
}
class Student extends Teacher
{
    int rno=78;
    void display()
    {
        System.out.println("Principal name:"+name);
        System.out.println("Teacher-id:"+tchrid);
        System.out.println("Student-roll no:"+rno);
    }
}
class Multilevel
{
    public static void main(String args[])
    {
        Student ob=new Student();
        ob.display();
    }
}