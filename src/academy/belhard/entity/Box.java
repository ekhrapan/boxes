package academy.belhard.entity;

import academy.belhard.util.BoxCounterUtil;

public class Box {
    protected int height;
    protected int width;
    protected int length;

    public Box(int height, int width, int length) {
        this.height = height;
        this.width = width;
        this.length = length;

        BoxCounterUtil.plusBox();
    }

    public int calculateVolume() {
        int volume = height * width * length;

        return volume;
    }

    public int calculateVolume(int multiplier) {
        int volume = height * width * length * multiplier * multiplier * multiplier;

        return volume;
    }
}
