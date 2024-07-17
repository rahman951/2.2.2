package web.Servie;

import web.model.Car;

import java.util.List;

public interface CarService {
	List<Car> returnCar(List<Car> cars, int count);
}
