public class Heft2an {
    private int a1;
    private int b1;
    private int c1;
    private int a2;
    private int b2;
    private int c2;

    public int getA1() {
        return a1;
    }

    public void setA1(int a1) {
        this.a1 = a1;
    }

    public int getB1() {
        return b1;
    }

    public void setB1(int b1) {
        this.b1 = b1;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getA2() {
        return a2;
    }

    public void setA2(int a2) {
        this.a2 = a2;
    }

    public int getB2() {
        return b2;
    }

    public void setB2(int b2) {
        this.b2 = b2;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }
    public int D(){
        return (a1*b2-a2*b1);
    }
    public int Dx() {
        return (c1 * b2 - c2 * b1);
    }
    public int Dy(){
        return (a1*c2- a2*c1);
    }
    public String resolve(){
        if(D()==0)
        {
            if(Dx()==0&&Dy()==0) return ("phuong trinh co vo so nghiem");
            else return ("phuong trinh vo nghiem");
        }
        else return ("phuong trinh co nghiem duy nhat:x="+(double)(Dx()/D())+";y="+(double)(Dy()/D()));

    }
}
