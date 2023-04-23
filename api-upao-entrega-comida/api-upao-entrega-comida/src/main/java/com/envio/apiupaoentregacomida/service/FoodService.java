package com.envio.apiupaoentregacomida.service;


import com.envio.apiupaoentregacomida.modelo.Food;

import java.util.List;

public interface FoodService {
    Food createFood(Food food);
    List<Food> getAllFoods();
}