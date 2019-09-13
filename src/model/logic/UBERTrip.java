package model.logic;

public class UBERTrip implements Comparable<UBERTrip> 
{
	private double sourceid;
	private double dstid;
	private double hod;
	private double mean_travel_time;
	private double standard_deviation_travel_time;
	private double geometric_standard_deviation_travel_time;
	private double geometric_mean_travel_time;
	
	public double darSourceId()
	{
		return sourceid; 
	}
	public double darDstid()
	{
		return dstid; 
	}
	public double darHod()
	{
		return hod; 
	}
	public double darMeanTravelTime()
	{
		return mean_travel_time; 
	}
	public double darStandardDeviationTime()
	{
		return standard_deviation_travel_time; 
	}
	public double darGSDTT()
	{
		return geometric_standard_deviation_travel_time; 
	}
	public double darGMTT()
	{
		return geometric_mean_travel_time; 
	}
	
	@Override
	public int compareTo(UBERTrip aComparar) {
		// TODO Auto-generated method stub
		int x=0;
		if(this.mean_travel_time>aComparar.darMeanTravelTime())
		{
			x = 1;
		}
		else if(this.mean_travel_time<aComparar.darMeanTravelTime())
		{
			x = -1;
		}
		else if(this.mean_travel_time==aComparar.darMeanTravelTime())
		{
			if(this.standard_deviation_travel_time>aComparar.darStandardDeviationTime())
			{
				x = 1;
			}
			else if(this.standard_deviation_travel_time<aComparar.darStandardDeviationTime())
			{
				x = -1;
			}
		}
		return x;
	}

}
