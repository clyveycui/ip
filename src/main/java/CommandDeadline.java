public class CommandDeadline extends DukeCommand {
    Deadline task;

    public CommandDeadline(Deadline t) {
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
