import java.util.Scanner;
class ReservationSystem {
    String TrainName;
    int TrainNumber;
    Scanner in=new Scanner(System.in);
    public ReservationSystem(){

    }
   public String starting(String start){
       return start;
   }
   public String destination(String destination){
       return destination;
   }
  public void Booking(){
      System.out.println("Please Enter Your name");
      String name=in.nextLine();
      System.out.println("Please Enter Your age");
      int age=in.nextInt();
      System.out.println("Please Enter class type");
      String claasType=in.nextLine();
      System.out.println("Thank you for Booking...Your Seat is is confirmed ");
  }
  public void cancellation(){
      System.out.println(" Please Enter Ok button to cancel your tickets");
      String cancel=in.nextLine();
      if (cancel.equals("Ok")){
          System.out.println("Ticket cancelled");
      }
      else {
          System.out.println("Please enter Ok to cancel");
      }
    }

}


