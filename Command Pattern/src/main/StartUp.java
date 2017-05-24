package main;

import domain.CeilingFan;
import domain.GarageDoor;
import domain.Light;
import domain.SimpleRemoteControl;
import domain.Stereo;
import domain.command.CeilingFanHighCommand;
import domain.command.CeilingFanLowCommand;
import domain.command.CeilingFanMediumCommand;
import domain.command.CeilingFanOffCommand;
import domain.command.Command;
import domain.command.GarageDoorDownCommand;
import domain.command.GarageDoorUpCommand;
import domain.command.LightOffCommand;
import domain.command.LightOnCommand;
import domain.command.MacroCommand;
import domain.command.StereoOffWithCDCommand;
import domain.command.StereoOnWithCDCommand;

public class StartUp
{

	public static void main(String[] args)
	{
		SimpleRemoteControl remote = new SimpleRemoteControl();
		
		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("garage");
		Stereo stereo = new Stereo("Living Room");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		
		CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(ceilingFan);
		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorClose = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
		
		Command[] macroOn = {livingRoomLightOn, kitchenLightOn, stereoOnWithCD};
		Command[] macroOff = {livingRoomLightOff, kitchenLightOff, stereoOffWithCD};
		
		MacroCommand allOn = new MacroCommand(macroOn);
		MacroCommand allOf = new MacroCommand(macroOff);
		
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, ceilingFanLow, ceilingFanOff);
		remote.setCommand(3, ceilingFanMedium, ceilingFanOff);
		remote.setCommand(4, ceilingFanHigh, ceilingFanOff);
		remote.setCommand(5, stereoOnWithCD, stereoOffWithCD);
		remote.setCommand(6, allOn, allOf);

		System.out.println(remote);
		
//		for(int i = 0; i < 7; i++)
//		{
//			remote.onButtonWasPushed(i);
//			remote.offButtonWasPushed(i);
//			remote.undoButtonWasPushed();
//		}
		
		remote.onButtonWasPushed(6);
		remote.offButtonWasPushed(6);
		remote.undoButtonWasPushed();
		
	}

}
