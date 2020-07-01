package academy.belhard;

import academy.belhard.entity.Box;
import academy.belhard.entity.BoxColor;
import academy.belhard.entity.ColoredBox;
import academy.belhard.entity.TitledBox;

public class App {

    public static void main(String[] args) {
//        TitledBox[] boxes = new TitledBox[3];
//
//        boxes[0] = new TitledBox(1, 2, 3, "Box 1");
//        boxes[1] = new TitledBox(2,3,4, "Box 2");
//        boxes[2] = new TitledBox(3,4,5, "Box 3");
//
//        for (TitledBox box : boxes) {
//            if (box.getTitle().equals("Box 2")) {
//                System.out.println(box.calculateVolume());
//            }
//        }

        TitledBox titledBox = new TitledBox(3, 5, 6, "Box 2");
        System.out.println(titledBox.calculateVolume());

        ColoredBox coloredBox = new ColoredBox(2, 3, 4, BoxColor.RED);
        System.out.println(coloredBox.calculateVolume());

    }

}
