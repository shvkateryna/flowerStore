package ua.ucu.edu.apps.demo.payment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/payment")
public class PaymentController {

    @GetMapping("/")
    public String getPayment() {
        return "Payment was successful";
    }
}

