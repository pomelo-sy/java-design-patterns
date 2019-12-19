package org.pomelo.command;

public class App {

    public static void main(String[] args) {
        Wizard wizard = new Wizard();
        Target target = new Goblin();


        target.printStatus();
        wizard.executeOper(new ShrinkOper(), target);
        target.printStatus();
        wizard.executeOper(new DisVisibleOper(), target);
        target.printStatus();

        wizard.revertOper(target);
        target.printStatus();
        wizard.revertOper(target);
        target.printStatus();
        wizard.redoOper(target);
        target.printStatus();
        wizard.redoOper(target);
        target.printStatus();

    }
}
