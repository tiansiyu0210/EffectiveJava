package Item37_EnumMap.EX1;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Set;
import java.util.stream.Collectors;

public class test {
    public static void main(String[] args) {
        //Monday     Soccer
        //Tuesday    Basketball
        //Wednesday  Hiking
        //Thursday   Karate
        EnumMap<DayOfWeek, String> activityMap = new EnumMap<>(DayOfWeek.class);
        activityMap.put(DayOfWeek.MONDAY, "Soccer");
        activityMap.put(DayOfWeek.TUESDAY, "Basketball");

        //copy
        System.out.println("===================copy value=============================");
        EnumMap<DayOfWeek, String> activityMapCopy = new EnumMap<>(activityMap);
        System.out.println(activityMapCopy.size());
        System.out.println(activityMapCopy.get(DayOfWeek.MONDAY).equalsIgnoreCase("Soccer") );

        //checking values
        System.out.println("===================checking value=============================");
        System.out.println(activityMap.containsValue("Hiking"));//false
        System.out.println(activityMap.containsValue("Basketball"));//true
        System.out.println(activityMap.containsKey(DayOfWeek.SATURDAY));//false


        //null value
        System.out.println("===================null value=============================");
        activityMap.put(DayOfWeek.SATURDAY, null);
        System.out.println(activityMap.containsKey(DayOfWeek.SATURDAY));//true
        System.out.println(activityMap.containsValue(null));//true

        //remove value
        System.out.println("===================remove value=============================");
        activityMap.remove(DayOfWeek.MONDAY);
        System.out.println(activityMap.containsKey(DayOfWeek.MONDAY));//false
        activityMap.put(DayOfWeek.MONDAY, "Soccer");
        activityMap.remove(DayOfWeek.MONDAY, "Soccer");

        //collection view
        System.out.println("===================collection view=============================");
        activityMap.put(DayOfWeek.THURSDAY, "Karate");
        activityMap.put(DayOfWeek.WEDNESDAY, "Hiking");
        activityMap.put(DayOfWeek.MONDAY, "Soccer");

        Collection values = activityMap.values();
        System.out.println(values); // [Soccer, Basketball, Hiking, Karate, null]
        Set keys = activityMap.keySet();
        System.out.println(keys); // [MONDAY, TUESDAY, WEDNESDAY, THURSDAY, SATURDAY]
        System.out.println(activityMap.entrySet());//[MONDAY=Soccer, TUESDAY=Basketball, WEDNESDAY=Hiking, THURSDAY=Karate, SATURDAY=null]
    }
}
