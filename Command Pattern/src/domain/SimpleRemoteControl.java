package domain;

import domain.command.Command;
import domain.command.NoCommand;

public class SimpleRemoteControl
{
	
	Command[] onCommands;
	Command[] offCommands;
	Command undoCommand;
	
	public SimpleRemoteControl()
	{
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		Command noCommand = new NoCommand();
		for(int i = 0; i < 7; i++)
		{
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand)
	{
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonWasPushed(int slot)
	{
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void offButtonWasPushed(int slot)
	{
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed()
	{
		undoCommand.undo();
	}
	
	@Override
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append("\n----- Remote Control -----\n");
		for(int i = 0; i < onCommands.length; i++)
		{
			buffer.append("[slot " + i + "]" + onCommands[i].getClass().getSimpleName() + "     " + offCommands[i].getClass().getSimpleName() + "\n"); 
		}
		buffer.append(undoCommand.getClass().getSimpleName() + "\n");
		return buffer.toString();
	}
	
}
