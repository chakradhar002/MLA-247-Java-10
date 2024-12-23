package chapter4;
//step1
interface Rights{
	void ShowGames();
	} 
//step 2
class Ipl implements Rights{

	@Override
	public void ShowGames() {
		System.out.println("show IPL in summer");
		
	}
	
}
class WorldCup implements Rights{

	@Override
	public void ShowGames() {
		System.out.println("show worldcup ");
		
	}
	
}

//step 3
//abstract factory interface for creating shapes
interface BcciMatches {
	
	Rights ConductIplMatches();
	Rights ConductOneDayMatches();

}

//step 4

//factory for creating rights

class BcciFactory implements BcciMatches{

	@Override
	public Rights ConductIplMatches() {
		
		return new Ipl();
	}

	@Override
	public Rights ConductOneDayMatches() {
		// TODO Auto-generated method stub
		return new WorldCup();
	}
	
	
}


//step 5
public class AbstractDesignPatterms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BcciFactory factory =new BcciFactory();
		
		Rights rights = factory.ConductIplMatches();
		rights.ShowGames();
	}

}
