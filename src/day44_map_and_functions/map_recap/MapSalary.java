package day44_map_and_functions.map_recap;

import java.util.*;

public class MapSalary {
    public static void main(String[] args) {

        Map <String, Double> employeesSalaryInfo = new LinkedHashMap<>();
        employeesSalaryInfo.put("Tom", 8500.0);
        employeesSalaryInfo.put("Jack", 2500.0);
        employeesSalaryInfo.put("Jane", 7500.0);
        employeesSalaryInfo.put("John", 4500.0);
        employeesSalaryInfo.put("James.K", 5500.0);
        employeesSalaryInfo.put("James.B", 5500.0);

        System.out.println(employeesSalaryInfo);

        // Q: Can you find the MAX and MIN salary
        // A: there couple different answers
        // 1 - Collects utility class
        System.out.println( Collections.max( employeesSalaryInfo.values() ));
        System.out.println( Collections.min( employeesSalaryInfo.values() ));

        System.out.println("---------------");
        // 2 - We can convert all the values into Collection Data Structure - TreeSet and get the first(min) and last(max)
        TreeSet <Double> values = new TreeSet<>( employeesSalaryInfo.values() );
        System.out.println(values.getLast());
        System.out.println(values.getFirst());


        System.out.println("---------------");
        // 3 - we can loop through and find min and max
        double minSalary = Double.MAX_VALUE;
        double maxSalary = Double.MIN_VALUE;


        for (Double eachValue : employeesSalaryInfo.values()) {

            if (eachValue < minSalary) {
                minSalary = eachValue;
            }

            if (eachValue > maxSalary) {
                maxSalary = eachValue;
            }

        }

        System.out.println(maxSalary);
        System.out.println(minSalary);


        System.out.println("---------------");
        // Q: get me the Names and Salary for MIN and MAX salary
        minSalary = Double.MAX_VALUE;
        String nameOfMaxSalEmp = "";
        maxSalary = Double.MIN_VALUE;
        String nameOfMinSalEmp = "";

        for (String eachKey : employeesSalaryInfo.keySet()) {

            if (employeesSalaryInfo.get(eachKey) < minSalary) {
                minSalary = employeesSalaryInfo.get(eachKey);
                nameOfMinSalEmp = eachKey;
            }

            if (employeesSalaryInfo.get(eachKey) > maxSalary) {
                maxSalary = employeesSalaryInfo.get(eachKey);
                nameOfMaxSalEmp = eachKey;
            }

        }
        System.out.println(nameOfMaxSalEmp + "-" + maxSalary);
        System.out.println(nameOfMinSalEmp + "-" +minSalary);


        System.out.println("---------------");
        // Q: get me the Names and Salary for MIN and MAX salary - use entrySet

        minSalary = Double.MAX_VALUE;
        nameOfMaxSalEmp = "";
        maxSalary = Double.MIN_VALUE;
        nameOfMinSalEmp = "";
        for (Map.Entry <String, Double> eachEntry : employeesSalaryInfo.entrySet()) {


            if (eachEntry.getValue() < minSalary) {
                minSalary = eachEntry.getValue();
                nameOfMinSalEmp = eachEntry.getKey();
            }

            if (eachEntry.getValue() > maxSalary) {
                maxSalary = eachEntry.getValue();
                nameOfMaxSalEmp = eachEntry.getKey();
            }

        }
        System.out.println(nameOfMaxSalEmp + "-" + maxSalary);
        System.out.println(nameOfMinSalEmp + "-" +minSalary);



        System.out.println("---------------");
        // Q: Find me the employees name who earns more than 6000
        List <String> employeeNamesWhoEarnsMoreThan6000 = new ArrayList<>();
        for (Map.Entry <String, Double> eachEntry : employeesSalaryInfo.entrySet()) {

            if (eachEntry.getValue() > 6000 ){
                //System.out.println(eachEntry.getKey());
                employeeNamesWhoEarnsMoreThan6000.add( eachEntry.getKey() );
            }

        }
        System.out.println("Employess who make more than 6000 employees: " + employeeNamesWhoEarnsMoreThan6000.toString().replace("[", "").replace("]", "")); // "[Tom, Jane]"



        System.out.println("---------------");
        System.out.println(employeesSalaryInfo);

        // Our manager want to increase everyones salary by 5K
        for ( String eachName : employeesSalaryInfo.keySet()) {
            employeesSalaryInfo.put(eachName, (employeesSalaryInfo.get(eachName) + 5000.00));
        }

        System.out.println(employeesSalaryInfo);

    }
}
