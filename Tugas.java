import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Tugas<T> {

    private T value;

    public Tugas(T value) {
        this.value = value;
    }

    public T getvalue() {
        return value;
    }

    public static <E> void printList(List<E> list) {
        for (E element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        List<String> stringList = new ArrayList<>();
        stringList.add("Wafa");
        stringList.add("Unnisa");
        printList(stringList);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "28 Desember");
        map.put(2, "22 Tahun");
        map.forEach((key, value) -> System.out.println(value));

        Tugas<Integer> genericInteger = new Tugas<>(2003);
        System.out.println("Tahun : " + genericInteger.getvalue());
    }
}