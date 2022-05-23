package com.littleitaly.littleitalybe.repository;

import com.littleitaly.littleitalybe.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaRepository extends JpaRepository<Pizza,Long> {
}
