package com.daniebeler.jukebox;

public class Main {

    private static Box box;

    public static void main(String[] args) {
        box = new Box();
        box.magazine.addRecord(new Record("The Taste", 7));

        box.load(1);
        box.play(3);
        box.play(5);
        box.remove();
        box.play(1);
        box.magazine.addRecord(new Record("Kunst Musik", 1));
        box.load(2);
        box.play(1);
        box.magazine.printSumOfMusicInMinutes();
    }
}
