package string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Date currentDate = new Date();
		System.out.println(currentDate);
		String currentDateFormat = "dd:MM:yyyy";
		SimpleDateFormat  dateFormat= new SimpleDateFormat(currentDateFormat);
		System.out.println(dateFormat.format(currentDate));*/
		String input = "2016/12/31";
        boolean checkformat;
        if (input.matches("([0-9]{4})/([0-9]{2})/([0-9]{2})")) // for yyyy/MM/dd format
            checkformat = true;
        else
            checkformat = false;

        System.out.println(checkformat);
    
		
		
	}

}
