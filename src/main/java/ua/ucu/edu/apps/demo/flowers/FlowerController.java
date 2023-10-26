package ua.ucu.edu.apps.demo.flowers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flower")
public class FlowerController {
    @GetMapping("/hello")
	public String getHello() {
		return "Hello";
	}

	@GetMapping("/list")
	public List<Flower> getFlower() {
		return List.of(new Flower(45.0, FlowerColor.RED, 0.8, FlowerType.ROSE));
	}
}
