public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    private DigitalVideoDisc itemsOrdered[]= new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered =0;

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
            this.itemsOrdered[this.getQtyOrdered()] = new DigitalVideoDisc(disc.getTitle(), disc.getCategory(), disc.getDirector(), disc.getLength(), disc.getCost());
            this.setQtyOrdered(this.getQtyOrdered()+1);
        }
    }
    public void removeDigitalVideoDisc(DigitalVideoDisc disc)
    {
        int c =0;
        for(int i=0;i<this.getQtyOrdered();i++)
        {
            if(this.itemsOrdered[i].getTitle().equals(disc.getTitle())==false)
            {
                this.itemsOrdered[c] = this.itemsOrdered[i];
//                this.itemsOrdered[c] = new DigitalVideoDisc(this.itemsOrdered[i].getTitle(),this.itemsOrdered[i].getCategory(),this.itemsOrdered[i].getDirector(),this.itemsOrdered[i].getLength(),this.itemsOrdered[i].getCost());
                c++;
            }
        }
        this.setQtyOrdered(c);
    }
    public void show()
    {
        for(int i =0; i<this.getQtyOrdered();i++)
        System.out.printf(""+this.itemsOrdered[i].getTitle()+" ");
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



}
