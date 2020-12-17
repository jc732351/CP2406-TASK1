//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class testCode {
//
//    public static final int USERINPUT = 2;
//    //creates multiple car objects:                   *************
//    public static void main(String[] args) {
//        List<Car> cars = new ArrayList<>();
//        for (int i = 0; i < USERINPUT; i++){
//            cars.add(new Car("car_" + (i +1)));
//        }
//        cars.get(0).setSpeed(1);
//        for (int object = 0; object < USERINPUT; object++) {
//            System.out.printf("%s going:%dseg/s at location:%s%n", cars.get(object).getId(), cars.get(object).getSpeed(), cars.get(object).getPosition());
//        }
//
////Simulation loop: that gets user input for each turn
//        System.out.println("Start Simulation?(y)");
//        Scanner simController = new Scanner(System.in);
//        String answer = simController.nextLine();
//        answer = answer.toLowerCase();
//        System.out.println("How many cars?");
//        int carSpawns = simController.nextInt();
//        int turn = 0;
//        if (answer.equals("y")) {
//            do {
//                turn = turn + 1;
//                for (int i = 0; i < carSpawns; i++) {
//                    Car currentCar = cars.get(i);
//                    int numOfRoad = simController.nextInt();
//                    for (int j = 0; j<numOfRoad; j++){
//                        System.out.println("Please input parameters for road_" + j + "...");
//                        System.out.print("Length:");
//                        int lengthInput = simController.nextInt();
//                        System.out.print("Speed limit:");
//                        int speedLimitInput = simController.nextInt();
//                        TrafficLight currentLight = new TrafficLight("id_"+j, new Road(Integer.toString(j),speedLimitInput, lengthInput, new int[]{0, 0}));
//                        System.out.println("How long for each light?");
//                        currentLight.operate(simController.nextInt());
//
