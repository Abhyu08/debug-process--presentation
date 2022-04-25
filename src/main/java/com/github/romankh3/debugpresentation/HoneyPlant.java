package com.github.romankh3.debugpresentation;

/**
 * Class represents flower in programmatically way.
 */
public class HoneyPlant {

    private double nectarCapacity;

    public HoneyPlant(double nectarCapacity) {
        this.nectarCapacity = nectarCapacity;
    }

    public double retrieveNectar(double nectar) {
        if ( nectar == 0 ) { // nectar should get replaced by nectarCapacity   // if (nectarCapacity == 0)
                            // nectar--> how much we are going to pull out //nectarCapacity --> How much is available!
            return 0;
        }
        nectarCapacity -= nectar;
        if (nectarCapacity < 0) {
            throw new RuntimeException("there is not enough nectar in this flower");
        }
        return nectar;
    }
}
