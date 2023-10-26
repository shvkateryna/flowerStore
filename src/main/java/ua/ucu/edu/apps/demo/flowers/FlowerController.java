package ua.ucu.edu.apps.demo.flowers;
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
	public Flower getFlower() {
		return new Flower(0, FlowerColor.RED, 0, FlowerType.ROSE);
	}
}
