package domain.command;

public class MacroCommand implements Command
{

	Command[] commands;
	
	public MacroCommand(Command[] commands)
	{
		this.commands = commands;
	}
	
	@Override
	public void execute()
	{
		for(int command = 0; command < commands.length; command++)
		{
			commands[command].execute();
		}
	}

	@Override
	public void undo()
	{
		for(int command = 0; command < commands.length; command++)
		{
			commands[command].undo();
		}
	}

}
