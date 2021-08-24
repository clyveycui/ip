package duke.command;

import duke.DukeUi;
import duke.task.TaskList;

/**
 * Represents a command to mark a task as completed.
 */
public class CommandDone extends DukeCommand {
    private int taskId;

    /**
     * Creates a new CommandDone.
     *
     * @param taskId ID of the task to be completed.
     */
    public CommandDone(int taskId) {
        this.taskId = taskId;
    }

    /**
     * Sets the task to be complete.
     *
     * @param tl Task list for the user.
     */
    @Override
    public void execute(TaskList tl) {
        DukeUi.printLine(tl.markComplete(taskId));
    }

    /**
     * As described in DukeCommand.
     *
     * @return False.
     */
    @Override
    public boolean isExit() {
        return false;
    }
}
