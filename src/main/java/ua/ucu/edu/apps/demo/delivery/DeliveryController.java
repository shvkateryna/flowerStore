package ua.ucu.edu.apps.demo.delivery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/delivery")
public class DeliveryController {
	@GetMapping("/")
	public String getDelivery() {
		return "Thank you for your order! It will be delivered soon.";
	}
}
