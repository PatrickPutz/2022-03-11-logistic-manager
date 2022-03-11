package org.campus02.logisticmanager;

import java.util.ArrayList;

public class LogisticManager {

    private ArrayList<Moveable> moveables;

    public LogisticManager() {
        this.moveables = new ArrayList<>();
    }

    public void add(Moveable m){
        this.moveables.add(m);
    }

    public void moveAll(String destination){
        for (Moveable moveable : moveables) {
            moveable.move(destination);
        }
    }
}
