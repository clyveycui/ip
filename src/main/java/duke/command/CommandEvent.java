package duke.command;

import duke.DukeUi;
import duke.task.Event;
import duke.task.TaskList;

public class CommandEvent extends DukeCommand {
    Event task;

    public CommandEvent(Event t) {
        this.task = t;
    }

    @Override
    public void execute(TaskList tl) {
        DukeUi.printLine(tl.addTask(task));
    }

    @Override
    public boolean isExit() {
        return false;
    }
}