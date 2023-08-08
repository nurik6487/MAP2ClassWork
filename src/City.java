public class City implements Comparable<City> {
    private int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(City other) {
        return Integer.compare(this.code, other.code);
    }

    @Override
    public String toString() {
        return code + ": " + name;
    }
}
