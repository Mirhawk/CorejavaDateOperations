public class Date {

	int day,month,year;
	int monthDaysArray[];
	boolean isLeap = false;
	
	public boolean setDate(int day,int month,int year) {
		if(validateDate(day,month,year))
		{
			this.day=day;
			this.month= month;
			this.year = year;
			return true;
		}
		return false;
	}
	
	private boolean checkIfLeap(int year)
	{
		if(year %4 == 0)
		{
			monthDaysArray = new int[] {0,31,29,31,30,31,30,31,31,30,31,30,31};
			return true;
		}
		monthDaysArray = new int[]  {0,31,28,31,30,31,30,31,31,30,31,30,31};
		return false;
	}
	public boolean validateDate(int day,int month,int year) {
		if(year > 1752)
		{
			isLeap = checkIfLeap(year);
			if(month > 0 && month <13)
			{	
				if(day > 0 && day <= monthDaysArray[month])
				{
					return true;
				}
			}
			
		}
		return false;
	}

	
	public void addDays(int numberOfDays) {	
		while(numberOfDays > 0){
			if((day + numberOfDays) > monthDaysArray[month]) {
				numberOfDays = numberOfDays - (monthDaysArray[month] - day) - 1;
				day = 1;
				addMonths(1);
			}
			else {
				day += numberOfDays;
				//setMonthMaxDay();
				break;
			}
		}
	}
	
	void addMonths(int numberOfMonths) {
		while(numberOfMonths > 0)
			{
			if((month + numberOfMonths) > 12){
				numberOfMonths = numberOfMonths - (12 - month) - 1;
				/*
				 * numberOfMonths = numberOfMonths - (12 - month) - 1 explaination
				 * (12 - month) gets the remaining months of the year
				 * numberOfMonths - (12 - month) is done to make the year reach till end of year
				 * -1 in the end is done to set it to the january month
				 * then month = 1 is set below to set the current month as January after turning over a new year.
				 * */
				month = 1;
				addYears(1);
			}
			else
			{
				month += numberOfMonths;
				break;
			}
		}
		
		if(day>monthDaysArray[month])
			day = monthDaysArray[month];
	}

	void addYears(int numberOfYears){
		year += numberOfYears;
		if(!checkIfLeap(year) && day > monthDaysArray[month])
		{
			day = monthDaysArray[month];
		}
	}
}


