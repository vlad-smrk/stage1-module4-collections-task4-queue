package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        List<Integer> orderedDishes = new ArrayList<>(numberOfDishes);
        Queue<Integer> dishQueue = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; i++) {
            dishQueue.add(i);
        }

        while (!dishQueue.isEmpty()) {
            for (int i = 1; i < everyDishNumberToEat; i++) {
                int skippedDish = dishQueue.remove();
                dishQueue.add(skippedDish);
            }
            orderedDishes.add(dishQueue.remove());
        }

        return orderedDishes;
    }

}
