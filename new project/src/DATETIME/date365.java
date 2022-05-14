package DATETIME;

import java.time.LocalDate;

public class date365 {

	public static void main(String[] args) {
		
		//Getting date from the base date i.e 01/01/1970
	    LocalDate dateFromBase = LocalDate.ofEpochDay(365);
	    System.out.println("365th day from base date= "+dateFromBase);
	}

}
