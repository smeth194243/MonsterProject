package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController 
{
	private MarshmallowMonster firstMonster;
	
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("Methasaurus", 324.324, 1, 55, 4, false);
	}
	public void start()
	{
		System.out.println("We made monsters today!");
		System.out.println("Here is mine " + firstMonster);
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
