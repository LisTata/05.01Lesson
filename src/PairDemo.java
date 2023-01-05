import java.util.Objects;
import java.util.function.BiConsumer;

public class PairDemo {
    public static void main(String[] args) {
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        System.out.println(pair);
        System.out.println(pair2);
        //Pair<Integer, String> pair = new Pair<>();

        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        System.out.printf("key: %d, value: %s%n",i,s);

        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
        System.out.printf("1: %b, 2: %b%n",mustBeTrue, mustAlsoBeTrue);

        pair.ifPresent((first, second) -> {
            System.out.print(first+" ");
            System.out.println(second);
        });
    }
}

class Pair<K,V>{
    private final K key;
    private final V value;

    private static final Pair<?,?> EMPTY = new Pair<>(null,null);

    private Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <K,V> Pair of(K key, V value){
        return new Pair(key, value);
    }

    public static<K,V> Pair<K,V> empty() {
        return (Pair<K,V>) EMPTY;
    }

    public K getFirst(){
        return key;
    }

    public V getSecond(){
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(key, pair.key) &&
                Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, value);
    }

    public void ifPresent(BiConsumer<? super K, ? super V> action) {
        if (key!=null && value != null) {
            action.accept(key, value);
        }
    }
}