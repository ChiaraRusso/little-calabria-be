package com.littleitaly.littleitalybe.repository;

import com.littleitaly.littleitalybe.model.Pizza;
import org.springframework.data.repository.CrudRepository;

public interface PizzaRepository extends CrudRepository<Pizza,Long> {
}
