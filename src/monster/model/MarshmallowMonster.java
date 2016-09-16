package monster.model;

public class MarshmallowMonster
{
	private String name;
	private double antennaCount;
	private int eyeCount;
	private int legCount;
	private int noseCount;
	private boolean hasBellyButton;
	
	public MarshmallowMonster()
	{
		this.name = "no name";
		this.antennaCount = -65436.2;
		this.eyeCount = -684735;
		this.legCount = -358471;
		this.noseCount = -2;
		this.hasBellyButton = false;
	}
	
	public MarshmallowMonster(String name,
								double antennaCount,
								int eyeCount,
								int legCount, 
								int noseCount,
								boolean hasBellyButton)
								
	{						
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.legCount = legCount;
		this.noseCount = noseCount;
		this.hasBellyButton = hasBellyButton;
	}
	
	public String toString()
	{
		String description = "Monster says: Name is " + name;
		
		return description;
	}
	
	public String getName()
	{
		return name;
	}
	
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	
	public int getLegCount()
	{
		return legCount;
	}
	
	public double getAntennaCount()
	{
		return antennaCount;
	}
	
	public int getNoseCount()
	{
		return noseCount;
	}
	
	public int getEyeCount()
	{
		return eyeCount;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setHasBellyButton(boolean hasBellyButton)
	{
		this.hasBellyButton = hasBellyButton;
	}
	
	public void setLegCount(int LegCount)
	{
		this.legCount = LegCount;
	}
	
	public void setAntennaCount(double AntennaCount)
	{
		this.antennaCount = AntennaCount;
	}
	
	public void setnoseCount(int NoseCount)
	{
		this.noseCount = NoseCount;
	}
	
	public void seteyeCount(int EyeCount)
	{
		this.eyeCount = EyeCount;
	}
	/*
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
}
