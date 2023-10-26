package ua.ucu.edu.apps.demo.flowers;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}
