package hust.soict.hedspi.aims.order;

import hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import hust.soict.hedspi.aims.utils.MyDate;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITTED_ORDERED = 4;
    public DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered =0;
    private static int nbOrdered =0;
    private MyDate dateOdered;

    public Order()
    {

    }
    public static boolean checkLimitedOrdered() {
        return nbOrdered < MAX_LIMITTED_ORDERED;
    }
    public Order(MyDate dateOdered) {
        nbOrdered++;
        this.dateOdered = dateOdered;
    }

    public MyDate getDateOdered() {
        return dateOdered;
    }

    public void setDateOdered(MyDate dateOdered) {
        this.dateOdered = dateOdered;
    }



    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }
    public void addDigitalVideoDisc(DigitalVideoDisc disc)
    {
        if(this.getQtyOrdered() >=MAX_NUMBERS_ORDERED) System.out.printf("Khong the them.");
        else {
            this.itemsOrdered[this.getQtyOrdered()] = disc;
            this.setQtyOrdered(this.getQtyOrdered()+1);
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        int c =0;
        for(int i=0;i<this.getQtyOrdered();i++)
        {
//            if(this.itemsOrdered[i].getTitle().equals(disc.getTitle()) == false)
            if(this.itemsOrdered[i] != disc)
            {
                this.itemsOrdered[c] = this.itemsOrdered[i];
//                this.itemsOrdered[c] = new hust.soict.hedspi.aims.disc.DigitalVideoDisc(this.itemsOrdered[i].getTitle(),this.itemsOrdered[i].getCategory(),this.itemsOrdered[i].getDirector(),this.itemsOrdered[i].getLength(),this.itemsOrdered[i].getCost());
                c++;
            }
        }
        this.setQtyOrdered(c);
    }
    public void show()
    {
        for(int i =0; i<this.getQtyOrdered();i++)
        System.out.printf("\n"+this.itemsOrdered[i].toString());
    }
    public float totalCost()
    {
        float a=0f;
        for(int i=0;i< this.getQtyOrdered();i++)
        {
            a = a+this.itemsOrdered[i].getCost();
        }
        return a;
    }
    public float totalCost(DigitalVideoDisc dvd)
    {
        float a=0f;
        for(int i=0;i< this.getQtyOrdered();i++)
        {
            if(this.itemsOrdered[i]!= dvd)
            {a = a+this.itemsOrdered[i].getCost();}
        }
        return a;
    }
    public DigitalVideoDisc getALuckyItem()
    {
        double randomDouble = Math.random();
        randomDouble = randomDouble*this.getQtyOrdered();
        int randomInt = (int) randomDouble;
        return itemsOrdered[randomInt];
    }

}
