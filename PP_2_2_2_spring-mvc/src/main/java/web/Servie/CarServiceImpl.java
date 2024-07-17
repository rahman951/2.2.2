package web.Servie;


import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
public class CarServiceImpl implements CarService {
	
	@Override
	public List<Car> returnCar(List<Car> cars, int count) {
		List<Car> cars1 = new ArrayList<>();
		
		if(count >= 5) {
			return cars;
		}else if(count < 5 && count > 0) {
			for(int i = 0; i < count; i++) {
				cars1.add(cars.get(i));
			}
		}
		
		return cars1;
		
	}
}
