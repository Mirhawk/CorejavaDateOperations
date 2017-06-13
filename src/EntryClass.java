
public class EntryClass {
	
	public static void main(String[] args) {
		int menuChoice;
		int day,month,year;
		boolean dateIsaValid;
		ConsoleInput consoleInputObject = new ConsoleInput();
		Date dateObject = new Date();
		
		System.out.print("Enter the day of day: ");
		day = consoleInputObject.getInt();
		System.out.print("Enter the month: ");
		month = consoleInputObject.getInt();
		System.out.print("Enter the year: ");
		year = consoleInputObject.getInt();
		
		
		dateIsaValid = dateObject.setDate(day, month, year);
			
		while(dateIsaValid)
		{
			System.out.println("Set date is: "+dateObject.day+"/"+dateObject.month+"/"+dateObject.year);
			System.out.println("Menu driven program for date operations: ");
			System.out.println("1. Add Days\n2. Add Months\n3. Add Years");
			System.out.println("4. Exit\nChoice: ");
			menuChoice = consoleInputObject.getInt();
			
			switch(menuChoice)
			{
				case 1:
					System.out.println("Enter the days to be added: ");
					int daysToAdd = consoleInputObject.getInt(); 
					dateObject.addDays(daysToAdd);
					break;
					
				case 2:
					System.out.print("Enter the months to be added: ");
					int monthsToAdd = consoleInputObject.getInt(); 
					dateObject.addMonths(monthsToAdd);
					break;
					
				case 3:

					System.out.print("Enter the years to be added: ");
					int yearsToAdd = consoleInputObject.getInt(); 
					dateObject.addYears(yearsToAdd);
					break;
					
				case 4:
					return;
				
				default:
					System.out.println("Invalid choice!");
					return;
			}
		}
		if(!dateIsaValid)
		{
			System.out.println("Invalid date!");
		}
	}
}
