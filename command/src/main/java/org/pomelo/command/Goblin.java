package org.pomelo.command;

import org.slf4j.Logger;

public class Goblin extends Target{

    public Goblin(){
        this.size = Size.NORMAL;
        this.flag = true;
    }


    @Override
    public String toString() {
        return "goblin";
    }
}
