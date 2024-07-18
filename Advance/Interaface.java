package Advance;
// learn interface 


interface student {
    // by deafult public static 

    int variable = 0 ; // default static and FINAL onces declared can't be changed
    void enjoy();
    void study();    
    void a();
}
interface researcher
{
    void readPaper();
    void tryThings();
    void a();
}
class MasterStudent implements student , researcher // mutiple inhertance like
// can we have same name method in different interface , if yes how we can solve this?
{
    public void enjoy(){
        System.out.println("please enjoy when needed : ");
    }

    public void study(){
        System.out.println("Study at first");
    }

    public void readPaper() { 
        System.out.println("Read and Learn How they solve similar problem ");
    } 

    public void tryThings() { 
        System.out.println("Try to solve the problem by your own way"); 
    } 

    public void a()
    {
        System.out.println("Only one can implemented and it will be fine ");
        // variable = 10; we can't change its in FINAL variable ...
    }


    // again we try it will create problem ...  
    // public void a()
    // {
    //     System.out.println(" Only one can implemented and it will be fine ");
    // }
}
public class Interaface {
    public static void main(String[] args) 
    {
        MasterStudent student = new MasterStudent();
        
        student.readPaper();
        student.tryThings();
        student.study();

        student.enjoy();
        student.a();
    }
}
