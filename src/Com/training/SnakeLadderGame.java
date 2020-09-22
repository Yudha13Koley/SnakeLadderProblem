package Com.training;

public class SnakeLadderGame {
	public static final int No_Play=0;
	public static final int Ladder=1;
	public static final int Snake=2;
	public static final int Winning_Position=100;
	public static void main(String[] args) {
		int Player1Position=0,Player1Turn=0;
		int Player2Position=0,Player2Turn=0;
		boolean Play1 =true;
		while(Player1Position< Winning_Position && Player2Position < Winning_Position) {
			if(Play1==true) {
				Player1Turn++;
		int DieRoll =(int)Math.floor(Math.random()*10)%6 +1;
		int CheckOptions=(int)Math.floor(Math.random()*10)%3;
		switch(CheckOptions)
		{
		case No_Play : Play1=false;
			break ;
		
		case Ladder : Player1Position+=DieRoll;
		              Play1 =true;
						break;
		case Snake : Player1Position-=DieRoll;
		             Play1=false;
						break;
		default : 		break;
		}
		if(Player1Position<0)
			Player1Position=0;
		if(Player1Position>100)
			Player1Position-=DieRoll;
			}
			else {
				Player2Turn++;
			int DieRoll =(int)Math.floor(Math.random()*10)%6 +1;
			int CheckOptions=(int)Math.floor(Math.random()*10)%3;
			switch(CheckOptions)
			{
			case No_Play : Play1=true;
				break ;
			
			case Ladder : Player2Position+=DieRoll;
			              Play1 =false;
							break;
			case Snake : Player2Position-=DieRoll;
			             Play1=true;
							break;
			default : 		break;
			}
			if(Player2Position<0)
				Player2Position=0;
			if(Player2Position>100)
				Player2Position-=DieRoll;
				}
				
			}
		 System.out.println("The Player 1 Position is : "+Player1Position+" Turn no : "+Player1Turn);
		 System.out.println("The Player 2 Position is : "+Player2Position+" Turn no : "+Player2Turn);
		 if(Player1Position==Winning_Position)
			 System.out.println("Player 1 Wins !");
		 else 
			 System.out.println("Player 2 Wins !");
}
}
