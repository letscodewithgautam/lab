package feb_23_lab;

class Sports {
	String getName() {
		return "Generic Sports";
	}
	void getNumberOfTeamMembers() {
		System.out.println("Each team has n players in "+ getName());
	}
}
class Soccer extends Sports{
	String getName() {
		return "Soccer Class";
	}
	void getNumberOfTeamMembers() {
	System.out.println("Each team has 11 players in "+ getName());
	}
}
public class Sport {
	public static void main(String[] args) {
		Sports game = new Sports();
		game = new Sports();
		System.out.println(game.getName());
		game.getNumberOfTeamMembers();
		game = new Soccer();
		System.out.println(game.getName());
		game.getNumberOfTeamMembers();
	}
}
