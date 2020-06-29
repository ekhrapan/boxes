package academy.belhard;

import academy.belhard.entity.Box;
import academy.belhard.entity.BoxColor;

public class App {

    public static void main(String[] args) {
        Box[] boxes = new Box[3];

        boxes[0] = new Box(1, 2, 3, BoxColor.RED);
        boxes[1] = new Box(2,3,4, BoxColor.LIGHT_GREEN);
        boxes[2] = new Box(3,4,5, BoxColor.LIGHT_GREEN);

        for (Box box : boxes) {
            if (box.getColor() == BoxColor.LIGHT_GREEN) {
                print(box);
            }
        }


    }

    public static void print(Box box) {
        if (box != null) {
            System.out.println("Box volume = " + box.calculateVolume());
        } else {
            System.out.println("Box is null");
        }

    }
}
