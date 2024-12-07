package app;

import java.util.ArrayList;
import java.util.List;

public class DataRepository {
    // Метод повертає список імен
    public List<String> getData() {
        return new ArrayList<>(List.of("Alice", "Bob", "Lucy", "Denis", "Tom"));
    }
}
