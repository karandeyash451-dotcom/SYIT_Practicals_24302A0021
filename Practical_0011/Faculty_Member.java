package practical_07;
public class Faculty_Member extends Member{
 public Faculty_Member(String Id, String name) {
 super(Id, name);
 }
 @Override
 double calculateFine(int no_of_days) {
 return (no_of_days>15)?(no_of_days-15)*10:0;
 }
 void displayDetails(){
 System.out.println("NAME OF THE FACULTY : "+name);
   System.out.println("ID OF THE FACULTY : "+Id);
 System.out.println("TOTAL FINE FOR THE FACULTY : "+calculateFine(30));
 }

}
