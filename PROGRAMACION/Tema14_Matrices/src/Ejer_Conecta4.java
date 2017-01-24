import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejer_Conecta4 {
	static String [][] board = new String[6][7];
	static int evaluatePlayer = 0;
	static final String jugador1 = "[0]";
	static final String jugador2 = "[X]";
	
	public static void boardConstructor(){
		for(int f=0; f<board.length; f++){
			for(int c=0; c<board[0].length; c++){
				board[f][c]="[ ]";
			}
		}
	}
	
	public static void boardView(){
		for(int f=0; f<board.length; f++){
			for(int c=0; c<board[0].length; c++){
				System.out.print(board[f][c]);
			}
			System.out.println();
		}
	}

	public static String player(int evaluatePlayer){
			String sEvaluatePlayer;
			sEvaluatePlayer = (evaluatePlayer%2 == 0)?jugador1:jugador2;
			return sEvaluatePlayer;
	}	
	
	public static boolean chipDropper(int column){
		boolean flag = false;
		boolean flag2 = false;
		int row=(board.length-1);
		while(!flag && row >=0){
			if(board[row][column-1].compareToIgnoreCase("[ ]") == 0){
				board[row][column-1]=player(evaluatePlayer);
				boardView();
				flag2=evaluateWinnerRow(row, board[row][column-1]);
				flag = true;
		}
			row--;
		}
		evaluatePlayer++;
		return flag2;
	}
	public static boolean evaluateWinnerRow(int row, String player){
		boolean flag=false;
		int aux=0;
			for(int c=0; c<board[row].length; c++){
				if(board[row][c].compareToIgnoreCase("[ ]") !=0){
					if(board[row][c].compareToIgnoreCase(player) == 0){
						aux++;
						if(aux==4){
							System.out.println("El jugador "+player+" ha ganado el juego");
							flag=true;
						}
					}
				}else{
					aux=0;
				}
			}
		return flag;
	}
	
	public static void play(){
		@SuppressWarnings("resource")
		Scanner teclado=new Scanner(System.in);
		int column=0;
		String columnS="";
		boolean flag=false;
		boardConstructor();
        Pattern pat = Pattern.compile("[1-7]{1}");
		while(!flag){
			System.out.println("¿En que columna quieres tirar ficha?");
			columnS=teclado.nextLine();
			Matcher mat = pat.matcher(columnS);
			while(!mat.matches()){
				System.out.println("El numero introducido no coincide con ninguna columna, vuelve a intentarlo");
				columnS=teclado.nextLine();
				mat = pat.matcher(columnS);
			}
			column=Integer.parseInt(columnS);
			flag=chipDropper(column);
		}
	}

	public static void main(String[] args) {
		play();
	}

}
