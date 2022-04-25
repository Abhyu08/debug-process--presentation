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
        HoneyPlant plumTree = new HoneyPlant(32);
        /*
            Everything would be fine now, but this answer is incorrect... According to the documentation README file, nectar is converted to honey at a ratio of 2 to 1:
            ## Documentation
            Presentation based on honey production.
            **Note**: 2 units of nectar = 1 unit of honey

            O/P:34.0 honey was produced by 7 bees from 2 honey plants

            The main method clearly has two honey plants with 40 and 32 units of nectar, respectively. So we should ultimately end up with 36 units of honey.
            But the program is telling us we get 34.
            Where did the other two units go? Let's find out!
            ** To the method where we populateHoney! Line:47

         */

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
        /*
        Let's update the README file:

        ## Documentation
        Presentation based on honey production.

        **Note**:
        * 2 units of nectar = 1 unit of honey
        * The queen bee eats 2 units of honey every time when beehive is replenished with honey.

        We're done. We've fixed all the bugs we found :)
         */
        //
        //display the result
        System.out.println(String.format("%s honey was produced by %d bees from %d honey plants",
                beeHive.getHoney(), beeHive.getBees().size(), honeyPlants.size()));
    }
}
/*
Let's summarize
In this Code Sample, we learned:
1.everybody's work has errors and debugging is a great way to fix them
2.what a breakpoint is and what types of breakpoints there are
3.how to set an exception breakpoint
4.how to step through code in debug mode
 */