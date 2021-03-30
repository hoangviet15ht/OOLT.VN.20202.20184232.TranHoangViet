package hust.soict.hedspi.test.disc;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;

public class newClass {
    public static void swap(Object o1,Object o2)
    {
        Object tmp = o1;
        o1 = o2;
        o2 = tmp;
    }
    public static void changeTitle(DigitalVideoDisc dvd, String title)
    {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
    public static void main(String[] args) {
        DigitalVideoDisc o1 = new DigitalVideoDisc("jungle");
        DigitalVideoDisc o2 = new DigitalVideoDisc("cinderella");
        swap(o1,o2);
        System.out.printf(""+o1.getTitle()+";"+o2.getTitle());
        changeTitle(o1,o2.getTitle());
        System.out.printf(""+o1.getTitle()+";"+o2.getTitle());
    }
}
