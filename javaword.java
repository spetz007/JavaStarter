import java.util.Scanner;

public class javaword {
    public static void main(String[] args)

    {
        String word;
        Scanner inputDevice = new Scanner(System.in);
        System.out.print("enter you word > ");
        word = inputDevice.next();
        char letter = word.charAt(0);
        System.out.print("\t" + "     J" + "\t" + "    A" + "\t" + "   V       V" + "\t" + "A" + "\n" );
        System.out.print("\t" + "     J" + "\t" + "   A A" + "\t" + "    V     V" + "\t" + "   A A" + "\n" );
        System.out.print("\t" + "     J" + "\t" + "  A   A" + "\t" + "     V   V" + "\t" + "  A   A" + "\n" );
        System.out.print("\t" + "J    J" + "\t" +  " AAAAAAA" + "\t" + "  V V" + "\t" + " AAAAAAA" + "\n" );
        System.out.print("\t" + "JJJJJJ" + "\t" + "A       A" + "\t" + "   V" + "\t" + "A       A" + "\n" );
    }
}
