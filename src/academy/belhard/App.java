package academy.belhard;

import academy.belhard.entity.*;

import java.util.Random;

public class App {

    public static void main(String[] args) {

        Box box1 = new Box(2, 3, 4);
        Box box2 = new Box(33, 13, 44);

        System.out.println(box1.toString());
        System.out.println(box2);
    }

}
