package main;

import domain.CeilingFan;
import domain.GarageDoor;
import domain.Light;
import domain.SimpleRemoteControl;
import domain.Stereo;
import domain.command.CeilingFanOffCommand;
import domain.command.CeilingFanOnCommand;
import domain.command.GarageDoorDownCommand;
import domain.command.GarageDoorUpCommand;
import domain.command.LightOffCommand;
import domain.command.LightOnCommand;
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
		
		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
		
		GarageDoorUpCommand garageDoorOpen = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorClose = new GarageDoorDownCommand(garageDoor);
		
		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffWithCDCommand stereoOffWithCD = new StereoOffWithCDCommand(stereo);
		
		remote.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remote.setCommand(1, kitchenLightOn, kitchenLightOff);
		remote.setCommand(2, ceilingFanOn, ceilingFanOff);
		remote.setCommand(3, stereoOnWithCD, stereoOffWithCD);
		
		System.out.println(remote);
		
		for(int i = 0; i < 7; i++)
		{
			remote.onButtonWasPushed(i);
			remote.offButtonWasPushed(i);
		}
	}

}
