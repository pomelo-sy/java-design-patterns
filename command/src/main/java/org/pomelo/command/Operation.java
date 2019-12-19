package org.pomelo.command;

public interface Operation {

    Target execute(Target target);

    Target redo(Target target);

    Target undo(Target target);
}
