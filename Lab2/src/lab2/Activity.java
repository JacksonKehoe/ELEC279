package lab2;
public class Activity {
		private int day; 
			private int month; 
				private int year;
				public Activity() {
			day = 1;
			month = 1;
			year = 1;
		}
		public Activity(int dayIn, int monthIn, int yearIn) {
			setDate(dayIn, monthIn, yearIn);
		}
		public int getDay() {
			return day;
		}
		public int getMonth() {
			return month;
		}
		public int getYear() {
			return year;
		}
		public void setDate(int dayIn, int monthIn, int yearIn){
			if(dayIn<=0 || monthIn<=0 || yearIn<0) {
				System.out.println("Date invalid");
			}
			if(dayIn<=31 || monthIn<=12 || yearIn<=2020) {
			
			if(monthIn==4 || monthIn==6 || monthIn==9|| monthIn==11 && dayIn>0 && dayIn<=30 && yearIn>=0) {
				day=dayIn;
				month=monthIn;
				year=yearIn;
			}
		if(monthIn==1||monthIn==3||monthIn==5||monthIn==7||monthIn==8||monthIn==10||monthIn==12 && dayIn>0 && dayIn<=31 && yearIn!=0) {
			day=dayIn;
			month=monthIn;
			year=yearIn;
		}
		
		if(monthIn==2 && dayIn>0 && dayIn<=28 && year>=0) {
			day=dayIn;
			month=monthIn;
			year=yearIn;
		}
		else System.out.println("Date invalid");
			}
		}
		public void printDate() {
			System.out.println(day+"."+month+"."+year);
		}
		

}
