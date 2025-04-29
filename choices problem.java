// Uses boolean variables to make choices
class WeatherCheck {

    void checkWeather() {
        boolean isSunny = true;
        boolean isRaining = false;

        if (isSunny) {
            System.out.println("It's sunny. Wear sunglasses!");
        } else if (isRaining) {
            System.out.println("It's raining. Take an umbrella!");
        } else {
            System.out.println("Weather is unclear. Check the forecast.");
        }
    }

    public static void main(String[] args) {
        (new WeatherCheck()).checkWeather();
    }
}
