package day43_map.map_recap;

import java.util.*;

public class Countries {
    public static void main(String[] args) {

        // Store multiple cities in one data structure
        // ...and store that container into another data structure that country has those cities

        // New York, Fairfax, Bellevue, Miami, Arlington --- > United States
        // Baku, Sumqayit, Ganja --------------------------- > Azerbaijan
        // Lyon, Paris ------------------------------------- > France
        // Toronto, Vancouver, Ontario --------------------- > Canada



        // Sample containers:
        // String str = "New York, Fairfax, Bellevue, Miami, Arlington";
        // String [] cities1 = {"New York", "Fairfax", "Bellevue", "Miami", "Arlington"}
        // List <String> cities1 = new ArrayList <>(Arrays.asList("New York", "Fairfax", "Bellevue", "Miami", "Arlington"));
        // Set <String> cities1 = new HashSet <>(Arrays.asList("New York", "Fairfax", "Bellevue", "Miami", "Arlington"));


        List<String> cities1 = new ArrayList<>(Arrays.asList("New York", "Fairfax", "Bellevue", "Miami", "Arlington"));
        List<String> cities2 = new ArrayList<>(Arrays.asList("Baku", "Sumqayit", "Ganja"));


        Map<String, List<String>> countries = new LinkedHashMap<>();
        countries.put("United States", cities1);
        countries.put("Azerbaijan", cities2);
        countries.put("France", new ArrayList<>(Arrays.asList("Lyon", "Paris")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Toronto", "Vancouver", "Ontario")));

        System.out.println(countries);

        // Can you print uot the cities which has "i" in the name

        // Option 1 - .keySet()
        for ( String each :  countries.keySet()) {

            //countries.get(each); // will return the value assign to this each on every cycle.-> List<String>

            for (String eachCity : countries.get(each)) {

                //System.out.println(eachCity);
                if (eachCity.contains("i")){
                    System.out.println(eachCity);
                }

            }

        }


        System.out.println("*************");
        // Option 2 - .values
        for (List <String> eachList : countries.values()) {

            for (String eachCity : eachList) {

                if (eachCity.contains("i")){
                    System.out.println(eachCity);
                }

            }

        }


        // TODO: Option - 3 --- > do it with Map.Entry / entrySet()



    }
}
