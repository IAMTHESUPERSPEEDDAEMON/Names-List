package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    // Метод повертає список імен
    public List<String> getData() {
        List<String> list = new ArrayList<>();
        list = List.of("Alice", "Bob", "Lucy", "Denis", "Tom");


        return list;
    }
}
