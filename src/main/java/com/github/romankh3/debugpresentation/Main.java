package com.github.romankh3.debugpresentation;

import java.util.Arrays;
import java.util.List;

/**
 * Main class for debug presentation.
 */
public class Main {

    public static void main(String[] args) {
        //
        //we create honey plants: apple and plum trees
        HoneyPlant appleTree = new HoneyPlant(40);
        HoneyPlant plumTree = new HoneyPlant(30);

        //
        //adding trees to the collection
        List<HoneyPlant> honeyPlants = Arrays.asList(appleTree, plumTree);

        //
        //create clues with seven bees
        BeeHive beeHive = new BeeHive(7);

        //
        //collecting nectar
        beeHive.getBees().forEach(bee -> {
            bee.fetchNectar(honeyPlants);
        });

        //
        //get honey from bee nectar
        beeHive.populateHoney();

        // отобразим результат
        System.out.println(String.format("%s honey was produced by %d bees from %d honey plants",
                beeHive.getHoney(), beeHive.getBees().size(), honeyPlants.size()));
    }
}
