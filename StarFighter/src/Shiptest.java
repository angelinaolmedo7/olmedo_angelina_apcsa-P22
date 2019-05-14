//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Shiptest
{
    public static void main( String args[] )
    {
        MovingThing test = new Ship();
        System.out.println("Ship 1 " + test);

        Ship test2 = new Ship(50,75);
        System.out.println("Ship 2 " + test2);

        Ship test3 = new Ship(7,7,6,5,1);
        test3.setX(3);
        test3.setY(5);
        System.out.println("Ship 3 " + test3);
        

        MovingThing test4 = new Alien();
        System.out.println("Ship 4 " + test4);

        Alien test5 = new Alien(50,75);
        System.out.println("Ship 5 " + test5);

        Alien test6 = new Alien(7,7,6,5,1);
        test3.setX(3);
        test3.setY(5);
        System.out.println("Ship 6 " + test6);
    }
}
