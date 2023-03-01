package mypackage;

public class Main1 {
	public static void main(String[] args) {
		movie m = new movie();
		m.setMovie_name("PATHAN");
		m.setMovie_Start_Time(4.15);
		m.setMovie_End_time(7.45);
		m.setMovie_ticket_price(500);
		
		System.out.println("Movie Name: "+m.getMovie_name());
		System.out.println("Movie Start Time; "+m.getMovie_Start_Time()+"pm");
		System.out.println("Movie End Time: "+m.getMovie_End_time()+"pm");
		System.out.println("Movie Ticket Price: "+m.getMovie_ticket_price());
		//System.out.println(m.getMovie_name()+" "+m.getMovie_Start_Time()+ " "+m.getMovie_End_time()+" "+m.getMovie_ticket_price());
	}

}
