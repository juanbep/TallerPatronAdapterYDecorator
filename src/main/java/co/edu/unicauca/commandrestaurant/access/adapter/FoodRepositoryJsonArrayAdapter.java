/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.commandrestaurant.access.adapter;

import co.edu.unicauca.commandrestaurant.access.IFoodRepository;
import co.edu.unicauca.commandrestaurant.domain.Food;
import java.util.List;

/**
 *
 * @author Beca98
 */
public class FoodRepositoryJsonArrayAdapter implements IFoodRepository {

    private FoodJsonArrayRepository services;

    public FoodRepositoryJsonArrayAdapter() {
        services = new FoodJsonArrayRepository();
    }

    @Override
    public Food findById(int id) {
        return services.getById(id);
    }

    @Override
    public List<Food> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean create(Food food) {
        return services.add(food);
    }

    @Override
    public boolean update(Food food) {
        return services.modify(food);
    }

    @Override
    public void delete(int id) {
        services.remove(id);
    }

}
