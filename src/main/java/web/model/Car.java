package web.model;

import java.util.Objects;

public class Car {

    private int series;
    private String model;
    private String color;

    public Car(int series, String model, String color) {
        this.series = series;
        this.model = model;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
               "series=" + series +
               ", model='" + model + '\'' +
               ", color='" + color + '\'' +
               '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(model, car.model) && Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, model, color);
    }
}
