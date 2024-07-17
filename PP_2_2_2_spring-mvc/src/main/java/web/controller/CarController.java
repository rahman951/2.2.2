package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Servie.CarService;
import web.Servie.CarServiceImpl;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
	private CarService carService = new CarServiceImpl();
	
	@GetMapping(value = "/cars")
	public String cars(ModelMap model, @RequestParam(name = "count", defaultValue = "5") int page) {
		List<Car> cars = new ArrayList<>();
		
		cars.add(new Car("BMW", 5, 2020));
		cars.add(new Car("Lada", 2107, 2005));
		cars.add(new Car("BMW", 6, 2020));
		cars.add(new Car("BMW", 4, 2020));
		cars.add(new Car("BMW", 3, 2020));
		
		
		model.addAttribute("cars", carService.returnCar(cars, page));
		return "cars";
	}
}
