package main;

import exman.m03.cmirand0.AltreDispositiu;
import exman.m03.cmirand0.Dispositius;
import exman.m03.cmirand0.Smartphon;
import exman.m03.cmirand0.Tablet;

public class Main {
    public static void main(String[] args) {
        Dispositius dispositius[] = new Dispositius[5];
        dispositius[0] = new AltreDispositiu(100, "rellotge intel·ligent");
        dispositius[1] = new Smartphon("Android", false, false, 500);
        dispositius[2] = new Smartphon("iPhone", true, true, 300);
        dispositius[3] = new Tablet(400);
        dispositius[4] = new Tablet(500);

        for (Dispositius d : dispositius) {
            System.out.println(d.getPreu_base() + " " + d.getPreu_final());
        }

        for (Dispositius d : dispositius) {
            if (d instanceof Smartphon && ((Smartphon) d).isGama()) System.out.println(d.toString());
            if (d instanceof Tablet && ((Tablet) d).isGama()) System.out.println(d.toString());
        }


    }
}
