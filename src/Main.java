import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        List<City> cities = new ArrayList<>();
        cities.add(new City(2, "City Ak"));
        cities.add(new City(5, "City Bravo"));
        cities.add(new City(4, "City Columbia"));
        cities.add(new City(7, "City kanada"));
        cities.add(new City(1, "City new york"));
        cities.add(new City(6, "City Florida"));
        cities.add(new City(3, "City Germany"));

        Set<City> treeSet = new TreeSet<>();
        for (City city : cities) {
            if (city.getCode() % 2 == 1) {
                treeSet.add(city);
            }
        }

        for (City city : treeSet) {
            System.out.println(city);
        }
    }
}