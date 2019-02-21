interface player{
	void batsman();
}
class bowler implements player{

	@Override
	public void batsman() {
		// TODO Auto-generated method stub
		System.out.println("Selection criteria");
	}
	
}
class keeper implements player{

	@Override
	public void batsman() {
		// TODO Auto-generated method stub
		System.out.println("having batting skills");
		
	}
	
}

public interface Interf {
	public static void main(String[] args) {
		bowler bw = new bowler();
		//System.out.println("Selection board:" +bw.batsman());
		bw.batsman();
		player py = new keeper();
		py.batsman();
		
	}

}
