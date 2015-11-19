
public class Dice {

	public int Throw (int dices){
		int DTotal = 0;
		
		for (int x = 1; x<=dices; x++){
			int D = 1 + (int) (Math.random() * 6);
			DTotal = DTotal + D;
		}
		return DTotal;
	}
	
	public int Throw (int dices, int bounces){
		
		int DTotal2 = 0;
		
		for (int y = 1; y<=dices; y++){
			int DBounce = 0;
			for (int q = 1; q<=bounces; q++){
			int D2 = 1 + (int)(Math.random() * 6);
			DBounce = DBounce + D2;
			}
			DTotal2 = (DBounce/(bounces)) + DTotal2;
		}
		return DTotal2;
	}
	
}