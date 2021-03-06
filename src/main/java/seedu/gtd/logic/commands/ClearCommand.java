package seedu.gtd.logic.commands;

import seedu.gtd.model.AddressBook;

/**
 * Clears the address book.
 */
public class ClearCommand extends Command {

    public static final String COMMAND_WORD = "clear";
    public static final String MESSAGE_SUCCESS = "Task list has been cleared!";

    public ClearCommand() {}


    @Override
    public CommandResult execute() {
        assert model != null;
        model.resetData(AddressBook.getEmptyAddressBook());
        return new CommandResult(MESSAGE_SUCCESS);
    }
}
