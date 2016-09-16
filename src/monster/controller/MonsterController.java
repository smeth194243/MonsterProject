package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;
public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Methasaurus", 324.324, 1, 55, 4, false);
		keyboardInput = new Scanner(System.in);
	}
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is mine: " + firstMonster);
		System.out.println("My monster has this many legs: " + firstMonster.getLegCount());
		System.out.println("My monster has this many antennas; " + firstMonster.getAntennaCount());
		System.out.println("My monster has this many noses: "+ firstMonster.getNoseCount());
		System.out.println("My monster has this many eyes: " + firstMonster.getEyeCount());
		System.out.println("My monster has a belly button: " + firstMonster.getHasBellyButton());
		
		System.out.println("Do you want to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do you want the name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		
		System.out.println(firstMonster);
	}
	/*
	 * monster name is methasaurus
	 * has 2 antennas
	 * has 3 legs
	 * has 4 noses
	 * has 5 eyes
	 * does not have a belly button
	 */
}
