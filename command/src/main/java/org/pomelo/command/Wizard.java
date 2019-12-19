package org.pomelo.command;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Deque;
import java.util.LinkedList;

public class Wizard {

    private Deque<Operation> redoQueue;

    private Deque<Operation> undoQueue;

    Logger logger = LoggerFactory.getLogger(App.class);

    public Wizard(){

        this.redoQueue = new LinkedList<Operation>();
        this.undoQueue = new LinkedList<Operation>();
    }

    void executeOper(Operation opera, Target target){

        logger.info("{} cast {} on ", this, opera, target);
        opera.execute(target);
        undoQueue.addLast(opera);
    }

    void revertOper(Target target){

        Operation lastOper = undoQueue.getLast();
        logger.info("{} revert {}", this, lastOper);
        lastOper.undo(target);
        redoQueue.addLast(lastOper);
    }

    void redoOper(Target target){

        Operation lastOper = redoQueue.getLast();
        logger.info("{} redo {}", this, lastOper);
        lastOper.redo(target);
        undoQueue.addLast(lastOper);
    }


    @Override
    public String toString() {
        return "Wizard";
    }
}
