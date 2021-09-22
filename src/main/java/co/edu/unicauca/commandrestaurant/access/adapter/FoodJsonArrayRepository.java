/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.commandrestaurant.access.adapter;

import co.edu.unicauca.commandrestaurant.domain.Food;
import co.edu.unicauca.commandrestaurant.domain.FoodTypeEnum;
import co.edu.unicauca.commandrestaurant.domain.decorator.CapitalFood;
import co.edu.unicauca.commandrestaurant.domain.decorator.CryptFood;
import java.util.ArrayList;
import java.util.List;

/**
 * repositorio que permite grabar y recuperar comidas en un arreglo String Json
 *
 * @author Beca98
 */
public class FoodJsonArrayRepository implements IFoodJsonRepository {

    private static List<Food> foods;

    public FoodJsonArrayRepository() {
        if (foods == null) {
            foods = new ArrayList<>();
            initData();
        }
    }

    private void initData() {
        foods.add(new CryptFood(0, "Arroz", FoodTypeEnum.ENTRADA));
        foods.add(new CryptFood(1, "jugo de mango", FoodTypeEnum.JUGO));
    }

    @Override
    public Food getById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<String> foods() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(Food food) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remove(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modify(Food food) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    

}
