package academy.belhard.entity;

import academy.belhard.util.BoxCounterUtil;

public class Box {
    private int height;
    private int width;
    private int length;
    private BoxColor color;
    private String title;

    public Box(int height, int width, int length, BoxColor color) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.color = color;

        BoxCounterUtil.plusBox();
    }

    public int calculateVolume() {
        int volume = height * width * length;

        return volume;
    }

    public BoxColor getColor() {
        return color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
