/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.commandrestaurant.access.adapter;

import co.edu.unicauca.commandrestaurant.domain.Food;
import co.edu.unicauca.commandrestaurant.domain.FoodTypeEnum;
import co.edu.unicauca.commandrestaurant.domain.decorator.CapitalFood;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;

/**
 * Implementación del repositorio con un arreglo de String JSON
 *
 * @author Beca98
 */
public class FoodJsonArrayRepository {

    private static List<String> foods;

    public FoodJsonArrayRepository() {

        if (foods == null) {
            foods = new ArrayList<String>();
            initData();
        }
    }

    /**
     * se inicializan los platos disponibles en un arreglo de String Json
     */
    private void initData() {

        CapitalFood principio = new CapitalFood(1, "Fríjoles", FoodTypeEnum.PRINCIPIO);
        jsonReturn(principio);
        CapitalFood entrada = new CapitalFood(2, "Sopa de verduras", FoodTypeEnum.ENTRADA);
        jsonReturn(entrada);
        CapitalFood jugo = new CapitalFood(3, "Jugo de mango", FoodTypeEnum.JUGO);
        jsonReturn(jugo);

    }

    private void jsonReturn(CapitalFood object) {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            foods.add(objectMapper.writeValueAsString(object));
        } catch (JsonProcessingException e) {
            // TODO Auto-generated catch block 
            e.printStackTrace();
        }

    }

    /**
     * Agrega una comida
     *
     * @param food comida a agregar
     * @return true si la agrega, false en caso contrario
     */
    public boolean add(Food food) {

        return false;
    }

    public void split() {

    }

}
