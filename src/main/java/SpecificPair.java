import java.util.StringJoiner;

public class SpecificPair {

    private final String first;
    private final String second;


    public SpecificPair(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public String getFirst() {
        return first;
    }

    public String getSecond() {
        return second;
    }

    public String toString(){
        return new StringJoiner(",", GenericPair.class.getSimpleName() + "[", "]")
                .add("first='" + first + "'")
                .add("second='" + second + "'")
                .toString();
    }
}