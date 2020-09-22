package Com.training;

public class SnakeLadderGame {
	public static final int No_Play=0;
	public static final int Ladder=1;
	public static final int Snake=2;
	public static final int Winning_Position=100;
	public static void main(String[] args) {
		int PlayerPosition=0,turn=0;
		while(PlayerPosition< Winning_Position) {
		int DieRoll =(int)Math.floor(Math.random()*10)%6 +1;
		int CheckOptions=(int)Math.floor(Math.random()*10)%3;
		switch(CheckOptions)
		{
		case No_Play : 	break ;
		case Ladder : PlayerPosition+=DieRoll;
						break;
		case Snake : PlayerPosition-=DieRoll;
						break;
		default : 		break;
		}
		if(PlayerPosition<0)
			PlayerPosition=0;
		System.out.println("The position is : "+PlayerPosition);
	}

}
}
