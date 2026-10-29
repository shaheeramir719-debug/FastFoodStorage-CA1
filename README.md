# Fast Food Storage System

## Algorithms and Architecture — CA1

This Java application manages food trays in a fast-food restaurant using a Stack data structure.

### Food Items
The application supports five types of food:
- Burger
- Pizza
- Fries
- Sandwich
- Hotdog

### Features
- Add food with its name, weight, and best-before date.
- Store a maximum of 8 food trays.
- Remove the most recently added food.
- Display all stored food trays.
- Peek at the top food item.
- Search for food by name.
- Validate incorrect inputs.
- Exit the application.

### Data Structure
We use an array-based Stack following the LIFO (Last In, First Out) principle.

### Time Complexity

| Operation | Complexity |

| Add | O(1) |
| Remove | O(1) |
| Peek | O(1) |
| Display | O(n) |
| Search | O(n) |

### Technologies
- Java
- Apache NetBeans IDE
- GitHub

### Group Members
- Member 1: Syed Shaheer Mohtashim
- Member 2: Sharjeel Akhlaq

### How to Run
Open the Java project in NetBeans and run `Main.java` in the `fastfood` package.
