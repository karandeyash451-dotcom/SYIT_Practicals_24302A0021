package practical_5;
public class Bus extends Vehicle{
 int seatBooked;
 int rstePerSeat;
 public Bus(int seatBooked, int rstePerSeat, String vehicleNymber, String engineNumber, double distance) {
 super(vehicleNymber, engineNumber, distance);
 this.seatBooked = seatBooked;
 this.rstePerSeat = rstePerSeat;
 }
 @Override
 double calculateFare() {
 return seatBooked*rstePerSeat;
 }
 @Override
 void displayDetails() {
 System.out.println("VEHICLE NUMBER : "+vehicleNumber);
 System.out.println("DISATNCE : "+distance);
 System.out.println("ENGINE NUMBER : "+getengineNumber());
 System.out.println("NO.OF SEAT BOOKED :" +seatBooked);
 System.out.println("FARE : "+calculateFare());
 }


}
