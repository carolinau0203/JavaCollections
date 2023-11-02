package Example;

public class WineCount123 {
    public static void main(String[] args) {
        wineCount(7);
    }

    static void wineCount(int glasses) {
        if (glasses < 5) {
            System.out.println("The night is not over, drink more!");
        } else {
            System.out.println("Go home");
        }
    }
}

