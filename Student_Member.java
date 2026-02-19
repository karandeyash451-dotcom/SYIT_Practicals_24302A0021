package practial_1_java;
public class Student_Member extends Member{
    public Student_Member(String Id, String name) {
 super(Id, name);
 }
 @Override
 double calculateFine(int no_of_days) {
 return (no_of_days>7)?(no_of_days-7)*5:0;
 }
 void displayDetails(){
 System.out.println("NAME OF THE STUDENT : "+name);
 System.out.println("ID OF THE STUDENT : "+Id);
 System.out.println("TOTAL FINE FOR THE STUDENT : "+calculateFine(10));
 }

}
