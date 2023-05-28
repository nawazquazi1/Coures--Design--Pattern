package com.java.coures.Factory;

// This is a factory thats only job is creating ships
// By encapsulating ship creation, we only have one
// place to make modifications

import com.java.coures.Model.BigUFOEnemyShip;
import com.java.coures.Model.RocketEnemyShip;
import com.java.coures.Model.UFOEnemyShip;
import com.java.coures.core.EnemyShip;

public class EnemyShipFactory {

    // This could be used as a static method if we
    // are willing to give up subclassing it

    public EnemyShip makeEnemyShip(String newShipType) {
        EnemyShip newShip = null;
        return switch (newShipType) {
            case "U" -> new UFOEnemyShip();
            case "R" -> new RocketEnemyShip();
            case "B" -> new BigUFOEnemyShip();
            default -> null;
        };

    }

}