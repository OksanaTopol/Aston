package lesson_3;

import java.util.ArrayList;
import java.util.List;

public class Park {

    private List<Attraction> attractions;

    public Park(){
        this.attractions = new ArrayList<>();
    }

    public void addAttraction(Attraction  attraction){
        attractions.add(attraction);
    }

    public void getAttractions(){
        for (Attraction attraction : attractions) {
            attraction.showInformation();
        };
    }

    public static class Attraction{
        private String name;
        private String time;
        private int cost;

        public Attraction(String name, String time, int cost){
            this.name = name;
            this.time = time;
            this.cost = cost;
        }

        public void showInformation(){
            System.out.println("Attraction: " + name + ". Working hours: " + time + ". Cost: " + cost);
        }
    }
}
