package FindMyTain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FindMyTrainApp {
    public static void main(String[] args) {

        TrainSystem system = new TrainSystem();

        //adding new station
        Station station1 = new Station("S00333" , "Agra");
        Station station2 = new Station("S00444" , "LUCKNOW");


        //adding new trains
        Train train1 = new Train("12408" , "Duranto Expr" , "Express" );
        Train train2 = new Train("12608" , " Intercity" , "Passenger" );

        Platform p1 = new Platform(1);
        Platform p2 = new Platform(2);

        List<Platform> platformList = new ArrayList<>();
        platformList.add(p1);
        platformList.add(p2);

        station1.setPlatformList(platformList);
        station2.setPlatformList(platformList);

        Schedule s1 = new Schedule(train1 , station1 , "9Am" , "9:05Am" , p1);
        Schedule s2 = new Schedule(train2 , station2 , "9:05Am" , "9:10Am" , p1);


        system.addStations(station1);
        system.addStations(station2);

        system.addTrain(train1);
        system.addTrain(train2);
        system.addSchedule(s1);
        system.addSchedule(s2);



        // let find between stations

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the source :");
        String source = sc.nextLine();

        System.out.println("Enter the destination : ");
        String des = sc.nextLine();

        List<Schedule> myTrains = system.findMyTrains(source , des);
        System.out.println("Your Trains Between " + source + " and " + des);
        for (Schedule schedule : myTrains){
            System.out.println(schedule);

        }

    }
}
