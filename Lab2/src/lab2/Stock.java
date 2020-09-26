package lab2;

public class Stock
{
	private String name;
	private int[] values = new int[7];
	private int day; 
	private int month; 
		private int year;

public Stock() 
{
	name = "";
	day = 1;
	month = 1;
	year = 1;
	for (int i = 0; i<7; i++) 
	{
		values[i] = 0;
	}
}
public Stock(int dayIn, int monthIn, int yearIn, String nameIn, int[]valIn) 
{
	if(dayIn<=0 || monthIn<=0 || yearIn<0 || valIn.length != 7) 
	{
		System.out.println("Date invalid");
	}
	if(dayIn<=31 && monthIn<=12 && yearIn<=2020 && valIn.length ==7) 
	{
		for(int i = 0; i<7; i++) 
		{
			if(valIn[i]>=0) 
			{	
				if(monthIn==4 || monthIn==6 || monthIn==9|| monthIn==11 && dayIn>0 && dayIn<=30 && year>=0) 
				{
					day=dayIn;
					month=monthIn;
					year=yearIn;
					name = nameIn;
				}
				if(monthIn==1||monthIn==3||monthIn==5||monthIn==7||monthIn==8||monthIn==10||monthIn==12 && dayIn>0 && dayIn<=31 && year!=0) 
				{
					day=dayIn;
					month=monthIn;
					year=yearIn;
					name=nameIn;
				}

				if(monthIn==2 && dayIn>0 && dayIn<=28 && year>=0) 
				{
					day=dayIn;
					month=monthIn;
					year=yearIn;
					name=nameIn;
				}
			}
		}
	}
else System.out.println("Date invalid");
}
		public int getDay() 
		{
			return day;
		}
		public int getMonth() 
		{
			return month;
		}
		public int getYear() 
		{
			return year;
		}
		public String getName() 
		{
			return name;
		}
		public int getValue(int ind) 
		{
			if (ind<0 || ind>6) return -1;
			else return values[ind];
		}
		public void setName(String nameIn) 
		{
			name=nameIn;
		}
		public void setValue(int val, int ind) 
		{
			if(val<0 || ind <0 || ind > 6) 
			{
				System.out.println("error");
			}
			else 
				values[ind]=val;
		}
			public void printStock() 
			{
				System.out.println(name+":"+day+"."+month+"."+year+"values: ");
				for(int i = 0; i <7; i++)
				{
					System.out.print(values[i]+",");
				}
			}
			public int getMeanValue() 
			{
				int mean= 0;
				for (int i = 0; i < 7; i++) 
				{
					mean += values[i];
				}
				return mean/7;
			}

}

