
public class ConsoleInput {
	String getString()
	{
		try {
			byte[] inputString = new byte[100];
			int mainLength =System.in.read(inputString);
			mainLength -= 2;
			byte[] finalString = new byte[mainLength];
			System.arraycopy(inputString, 0,finalString , 0, mainLength);
			return new String(finalString);
		}		
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	int getInt()
	{
		return Integer.parseInt(getString());
	}
	
	float getFloat()
	{
		return Float.parseFloat(getString());
	}
}
