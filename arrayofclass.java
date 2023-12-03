class student
{
   String name;
   int roll; 
   int marks;
}
public class arrayofclass {
    public static void main(String a12[])
    {
        student students[]=new student[3];

        students[0]=new student();
        students[0].name="Susan";
        students[0].roll=46;
        students[0].marks=92;

        students[1]=new student();
        students[1].name="Slok";
        students[1].roll=42;
        students[1].marks=72;

        students[2]=new student();
        students[2].name="Sajav";
        students[2].roll=43;
        students[2].marks=32;
        
        for(student print:students)
        {
            System.out.println("Roll Number " + print.roll + " "+ print.name + " has obtained " + print.marks);
        }

    }
}
