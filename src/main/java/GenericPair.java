import java.util.StringJoiner;

public class GenericPair<T, S>{

    private final T first;
    private final S second;


    public GenericPair(T first, S second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public String toString(){
        return new StringJoiner(",", GenericPair.class.getSimpleName()  + "[", "]")
                .add("first='" + first + "'")
                .add("second='" + second + "'")
                .toString();
    }
}
