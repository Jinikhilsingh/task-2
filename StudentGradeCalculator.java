import java.util.*;
public class StudentGradeCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Five Subjects Marks: ");
        float subject_1=sc.nextFloat();
        float subject_2=sc.nextFloat();
        float subject_3=sc.nextFloat();
        float subject_4=sc.nextFloat();
        float subject_5=sc.nextFloat();
        float total_marks=subject_1+subject_2+subject_3+subject_4+subject_5;
        float average_marks = total_marks/5;
        System.out.println("Total marks: "+total_marks);
        System.out.println("Average marks:"+average_marks);
        if(average_marks>=90){
            System.out.print("Grade A ");
        }else if (average_marks>=80){
            System.out.print("Grade B ");
        }else if (average_marks>=70){
            System.out.print("Grade C");
        }else if (average_marks>=60){
            System.out.print("Grade D");
        }else if (average_marks>=40){
            System.out.print("Grade E");
        }else {
            System.out.print("Grade F");
        }
    }
}