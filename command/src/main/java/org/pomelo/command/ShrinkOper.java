package org.pomelo.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShrinkOper implements Operation {

    private Size old;


    @Override
    public Target execute(Target target) {


        if(target != null){
            Size oldSize = target.getSize();
            this.old = oldSize;
            target.setSize(Size.SMALL);
        }
        return target;
    }

    @Override
    public Target redo(Target target) {

        return undo(target);
    }

    @Override
    public Target undo(Target target) {

        if(old != null){
            Size temp = target.getSize();
            target.setSize(old);
            old = temp;
        }
        return target;
    }

    @Override
    public String toString() {
        return "ShinkOper";
    }
}
