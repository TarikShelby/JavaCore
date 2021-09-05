package enums;

public enum Season {
    SUMMER(30), AUTUMN(14), SPRING(15), WINTER(-40); // обекты класса сизон
    private int temperature;

    Season() {
    }

    Season(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }
}
