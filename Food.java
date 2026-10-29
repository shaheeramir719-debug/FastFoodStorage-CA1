package fastfood;

import java.time.LocalDate;
import java.time.LocalDateTime;

// One Food object represents one tray.
public class Food {
    String name;
    int weight;
    LocalDate bestBefore;
    LocalDateTime timeAdded;

    public Food(String name, int weight, LocalDate bestBefore) {
        this.name = name;
        this.weight = weight;
        this.bestBefore = bestBefore;
        this.timeAdded = LocalDateTime.now(); // Save time automatically.
    }

    public void showDetails() {
        System.out.println(name + " | " + weight + " g | Best before: "
                + bestBefore + " | Added: " + timeAdded);
    }
}
