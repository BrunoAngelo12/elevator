import java.util.Scanner;
import java.util.Random;

public class ElevatorApp {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Random floorRandom = new Random();
        int currentFloor = floorRandom.nextInt(11);

        System.out.println("\n----------Elevator Wall Street Tower-----------\n");
        System.out.println("Current floor: " + currentFloor);
        int selectedFloor;
        do{
            System.out.print("Enter your desired floor: ");
            selectedFloor = sc.nextInt();
        }while(selectedFloor == currentFloor || selectedFloor > 10 || selectedFloor < 0);


        if (selectedFloor > currentFloor) {
            for (int i = currentFloor; i <= selectedFloor; i++) {
                if (i == selectedFloor) {
                    System.out.println("Current floor: " + i + "\nBe careful with the door.");
                    break;
                }
                System.out.println("Current floor: " + i + "\nGoing up..");
            }
        } else if (selectedFloor < currentFloor) {
            for (int i = currentFloor; i >= selectedFloor; i--) {
                if (i == selectedFloor) {
                    System.out.println("Current floor: " + i + "\nBe careful with the door.");
                    break;
                }
                System.out.println("Current floor: " + i + "\nGoing down..");
            }
        } else {
            System.out.print("Enter your desired floor: ");
            selectedFloor = sc.nextInt();
        }
        sc.close();
    }
}
