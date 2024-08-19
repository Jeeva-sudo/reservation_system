# reservation_systemimport java.util.Random;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        LoginForm person1 = new LoginForm();
        person1.name = "Jeevan";
        person1.luckyNumber = 18;
        person1.dateOfBirth = 19062004;
        ReservationSystem person = new ReservationSystem();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter your email ID");
        String myEmail = sc.nextLine();
        if (person1.email().equals(myEmail)) {
            System.out.println("please Enter your Password");
            int password = sc.nextInt();
            if (person1.password() == password) {
                System.out.println("Login Successful");
            }
        } else {
            System.out.println("Please enter valid email & password");

            ReservationSystem Train = new ReservationSystem();
            Train.TrainName = "Falaknoma Exp";
            Train.TrainNumber = 205487;
            ReservationSystem Train1 = new ReservationSystem();
            Train1.TrainName = "Secundrabad Special Exp";
            Train1.TrainNumber = 458962;
            int PNRNumber = 0;
            Random random = new Random();
            System.out.println("Please Enter Your Boarding Station");
            String myStart = sc.nextLine();
            System.out.println("Please Enter Your Destination Station");
            String myDest = sc.nextLine();
            if (person.starting("Secundrabad").equals(myStart) && person.destination("Vishakapatnam").equals(myDest)) {
                System.out.println("Your Train Number:" + " " + Train.TrainNumber);
                System.out.println("Your Train Name" + " " + Train.TrainName);
                PNRNumber = random.nextInt();
                System.out.println("For Booking Please enter Insert button");
                String yesOrNo = sc.nextLine();
                if (yesOrNo.equals("Insert")) {
                    person.Booking();
                }
            } else {
                System.out.println("Train not available on this route");
            }
            if (person.starting("Secundrabad").equals(myStart) && person.destination("Guwahati").equals(myDest)) {
                System.out.println("Your Train Number:" + " " + Train1.TrainNumber);
                System.out.println("Your Train Name:" + " " + Train1.TrainName);
                PNRNumber = random.nextInt();
                System.out.println(PNRNumber);
                System.out.println("For Booking Please enter Insert button");
                String yesOrNo = sc.nextLine();
                if (yesOrNo.equals("Insert")) {
                    person.Booking();
                }
            } else {
                System.out.println("Train not available on this route");
            }
            System.out.println(" To cancel your tickets press Ok button :");
            String Ok = sc.nextLine();
            if (Ok.equals("Ok")) {
                System.out.println("Please enter your PNR Number");
                int pnr = sc.nextInt();
                if (pnr == PNRNumber) {
                    person.cancellation();
                }
            }

        }
    }
}
