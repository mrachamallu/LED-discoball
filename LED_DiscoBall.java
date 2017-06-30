import com.phidgets.*;
import com.phidgets.event.*;
import java.util.Random;

public class LED_DiscoBall {
	public static final void main(String args[]) throws Exception {
		InterfaceKitPhidget sound = new InterfaceKitPhidget(); 
		//1133 sound sensor. makes new object for interaction
		Random rnd = new Random();
		
		
			
		System.out.println(Phidget.getLibraryVersion()); //what does this do??
		
		sound.openAny();//the Phidget needs to search for any Phidgets available to the computer
		System.out.println("waiting for InterfaceKit attachment..."); 
		sound.waitForAttachment();
		
		System.out.println(sound.getDeviceName());
		
		//holds sensor value
		int decibelValue = 0;
		decibelValue= sound.getSensorValue(0); //gets decibel value
		System.out.println(decibelValue); //prints decibel value to screen
		
		//boolean flag = false;
		
		//this loop will continuously check the decibel value through the sound sensor to determine the corresponding output
		for(int i = 0; i < 1000; ++i)
		{
			decibelValue = sound.getSensorValue(0);
			//turn the LEDs on , depending on value of slider
			//turn on green LED in port 0
			
			/////////////////////////////////////
			
			if (decibelValue <=80){
				//turns on lights when decibel level is between 10 and 80
			if(decibelValue > 10 && decibelValue <= 80)
				sound.setOutputState(0, true);
			else
				sound.setOutputState(0, false);
			
			if(decibelValue > 10 && decibelValue <= 80)
				sound.setOutputState(1, true);
			else
				sound.setOutputState(1, false);
			
			if(decibelValue > 10 && decibelValue <= 80)
				sound.setOutputState(2, true);
			else
				sound.setOutputState(2, false);
			
			if(decibelValue > 10 && decibelValue <= 80)
				sound.setOutputState(3, true);
			else
				sound.setOutputState(3, false);
			
			if(decibelValue > 10 && decibelValue <= 80)
				sound.setOutputState(4, true);
			else
				sound.setOutputState(4, false);
			
			if(decibelValue > 10 && decibelValue <= 80)
				sound.setOutputState(5, true);
			else
				sound.setOutputState(5, false);
			
			if(decibelValue > 10 && decibelValue <= 80)
				sound.setOutputState(6, true);
			else
				sound.setOutputState(6, false);
			
			if(decibelValue > 10 && decibelValue <= 80)
				sound.setOutputState(7, true);
			else
				sound.setOutputState(7, false);
			} else {

			////////////////////////////////////////
			//makes lights flash randomly when decibel level is above 80
			if(decibelValue > 80)
				sound.setOutputState(0, getRandBoolean());
			else
				sound.setOutputState(0, false);
			
			if(decibelValue > 80)
				sound.setOutputState(1, getRandBoolean());
			else
				sound.setOutputState(1, false);
			
			if(decibelValue > 80)
				sound.setOutputState(2, getRandBoolean());
			else
				sound.setOutputState(2, false);
			
			if(decibelValue > 80)
				sound.setOutputState(3, getRandBoolean());
			else
				sound.setOutputState(3, false);
			
			if(decibelValue > 80)
				sound.setOutputState(4, getRandBoolean());
			else
				sound.setOutputState(4, false);
			
			if(decibelValue > 80)
				sound.setOutputState(5, getRandBoolean());
			else
				sound.setOutputState(5, false);
			
			if(decibelValue > 80)
				sound.setOutputState(6, getRandBoolean());
			else
				sound.setOutputState(6, false);
			
			if(decibelValue > 80)
				sound.setOutputState(7, getRandBoolean());
			else
				sound.setOutputState(7, false);								
			}
			System.out.print(decibelValue + " ");

			// 300 msec pause
			Pause(300 );

		}	

		//turn off LEDs
		sound.setOutputState(0, false);
		sound.setOutputState(1, false);
		sound.setOutputState(2, false);
		sound.setOutputState(3, false);
		sound.setOutputState(4, false);
		sound.setOutputState(5, false);
		sound.setOutputState(6, false);
		sound.setOutputState(7, false);
		System.out.print("closing...");
		sound.close();
		sound = null;
		System.out.println(" ok");
		if (false) {
			System.out.println("wait for finalization...");
			System.gc();
		}
		
	}
	public static void Pause(int msec) 
	{
	//This function can be used to create a pause
		try
		{
			Thread.sleep(msec);
		} 
		catch (InterruptedException e)
		{;}
	}
	
	public static boolean getRandBoolean() {
		int rand = (int)(Math.random() * 10);
		//System.out.print(rand + " ");
		if (rand % 2 == 0)
		{
			return true;
		} else {
			return false;
		}
	}

	}

