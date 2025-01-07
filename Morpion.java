//vérifier que le x a bien gagné en diagonale
//vérifier si X à gagner
public class Morpion {
    public static void main (String[]args){ 
        /*char monMorpion[][] = new char[3][3]; 
        monMorpion[][] = 'X';
        */ 
        char monMorpion[][] = {{'X','O','O'},{'O','X','X'},{'O','O','X'}};
            System.out.println(monMorpion[0][0]);

            System.out.println("Les valeurs de la diagonale sont : " + monMorpion[0][0] + monMorpion[1][2] + monMorpion[2][2]);
            if (monMorpion[0][0] == 'X' && monMorpion[1][1] == 'X' && monMorpion[2][2] == 'X') {
                System.out.println("Le X gagne en diagonale");
            }

            else if (monMorpion[0][0] == 'X' && monMorpion[0][1] == 'X' && monMorpion[0][2] == 'X' 
                    && monMorpion[0][1] == 'X' && monMorpion[1][1] == 'X' && monMorpion[2][1] == 'X'){
                System.out.println("Le X gagne en horizontale");
            }
            else {
                System.out.println("Il ne gagne pas en diagonale");
            }
            /*  
                X O O
                O X X
                O O X    
            */
    }
}