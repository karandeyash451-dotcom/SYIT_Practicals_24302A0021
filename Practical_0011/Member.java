package practical_07;
abstract public class Member {
 String Id,name;
 public Member(String Id, String name) {
 this.Id = Id;
 this.name = name;
 }
 abstract double calculateFine(int no_of_days);
}
