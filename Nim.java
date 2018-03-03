import java.util.Scanner;

public class Nim {

public static void main(String[] args) {

int pilesize = 100;

Scanner input= new Scanner(System.in);
int userGuess;

boolean humanTurn; //true means its humans humanTurn

//decide who goes first

if (Math.random() >= 0.5) {

  humanTurn = true;
} else {
humanTurn = false;
}
//game loop
while (pilesize > 1) {
  //report how many marbles left
  System.out.println("marbles left:" + pilesize);

  if (humanTurn) {
    System.out.println("choose a number: ");
    userGuess = input.nextInt();
    pilesize -= userGuess;
  }else {
    pilesize -= Math.random() * (pilesize/2) + 1;
  }
}
humanTurn = !humanTurn
}
//report the winner
if (humanTurn) {
  System.out.println("Comp wins");
} else {
  System.out.println("Human wins");
}

}
