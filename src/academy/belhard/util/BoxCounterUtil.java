package academy.belhard.util;

public class BoxCounterUtil {
    private static int boxCount = 0;

    public static int getBoxCount() {
        return boxCount;
    }

    public static void plusBox() {
        boxCount++;
    }
}
