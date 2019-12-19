package org.pomelo.command;

public class DisVisibleOper implements Operation {

    @Override
    public Target execute(Target target) {
        target.setFlag(false);
        return target;

    }

    @Override
    public Target redo(Target target) {
        target.setFlag(false);
        return target;
    }

    @Override
    public Target undo(Target target) {
        target.setFlag(true);
        return target;
    }

    @Override
    public String toString() {
        return "disVisibleOper";
    }
}
