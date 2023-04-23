package com.envio.apiupaoentregacomida.repository;

import com.envio.apiupaoentregacomida.modelo.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodReposity extends JpaRepository <Food,Long>{
}
