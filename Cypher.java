import java.util.*;

public class Cypher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the encrpyted text here: ");
        String cypher = input.next();
        //cypher =  "Hxotm euax ycuxj yotik ck gzzgiq gz jgct";     (Comment out for faster testing)
		
        System.out.println(cypher);
        
        decryptMatt test1 = new decryptMatt();
        String cypherDecrypt = test1.ShiftRight(cypher, 5);
        System.out.println("The decrpyted text is:" + cypherDecrypt);
    }


}