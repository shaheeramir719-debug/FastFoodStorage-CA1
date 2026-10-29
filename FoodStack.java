package fastfood;

// This class manages the food trays using a Stack.
// Stack follows LIFO: Last In, First Out.
// The storage can hold a maximum of 8 food trays.
public class FoodStack {
    Food[] foods = new Food[8]; // Storage holds only eight trays.
    int top = -1;               // -1 means storage is empty.

    public void add(Food food) {
        if (top == 7) {
            System.out.println("Storage is full!");
        } else {
            top++;
            foods[top] = food;
            System.out.println("Food added successfully.");
        }
    }

    public void remove() {
        if (top == -1) {
            System.out.println("Storage is empty!");
        } else {
            System.out.println("Removed: " + foods[top].name);
            foods[top] = null;
            top--;
        }
    }

    public void peek() {
        if (top == -1) {
            System.out.println("Storage is empty!");
        } else {
            System.out.println("Food at the top:");
            foods[top].showDetails();
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Storage is empty!");
        } else {
            System.out.println("Food trays (top to bottom):");
            for (int i = top; i >= 0; i--) {
                foods[i].showDetails();
            }
        }
    }

    public void search(String name) {
        for (int i = top; i >= 0; i--) {
            if (foods[i].name.equalsIgnoreCase(name)) {
                System.out.println("Food found:");
                foods[i].showDetails();
                return;
            }
        }
        System.out.println("Food not found.");
    }
}
