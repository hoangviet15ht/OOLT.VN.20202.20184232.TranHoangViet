package hust.soict.hedspi.aims;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.order.Order;

public class Aims {
    public static void main(String[] args) {
        Order anOrder = new Order();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
        anOrder.addDigitalVideoDisc(dvd1);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Starwars","Science Fiction","Geogre Lucas",87,24.95f);
        anOrder.addDigitalVideoDisc(dvd2);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

//        System.out.printf(""+anOrder.getQtyOrdered());
        anOrder.removeDigitalVideoDisc(dvd1);
//        anOrder.removeDigitalVideoDisc(dvd2);
//        anOrder.removeDigitalVideoDisc(dvd3);
//        System.out.printf(""+anOrder.getQtyOrdered());
        anOrder.show();
        System.out.printf("\n Total cost is:"+anOrder.totalCost());
    }
}
