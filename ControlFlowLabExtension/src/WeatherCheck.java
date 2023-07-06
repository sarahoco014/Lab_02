public class WeatherCheck {

    public static void main(String[] args) {

        int temperature = 21;
        boolean currentlyRaining = false;

        if (temperature <= 20 && currentlyRaining) {
            System.out.println("Wear a warm and waterproof coat!");
        } else if (temperature > 20 && currentlyRaining) {
            System.out.println("Wear a waterproof coat!");
        } else if (temperature <= 20 && !currentlyRaining) {
            System.out.println("Wear a warm coat!");
        } else {
            System.out.println("Wear shorts and sunscreen!");
        }
    }
}