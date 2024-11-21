package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "model1", "color1"));
        carList.add(new Car(2, "model2", "color2"));
        carList.add(new Car(3, "model3", "color3"));
        carList.add(new Car(4, "model4", "color4"));
        carList.add(new Car(5, "model5", "color5"));

    }

    public List<Car> getCarList(Integer count) {
        if (count == null || count < 1) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
