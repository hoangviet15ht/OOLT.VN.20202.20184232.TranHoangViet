public class SecondDegreeEquation {
    private int a;
    private int b;
    private int c;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public int delta(){
        return b^2-4*a*c;
    }
    public String resolve(){
        if(delta()==0) return ("phuong trinh co nghiem duy nhat:"+(double)(-b/(2*a)));
        else if(delta()<0) return ("phuong trinh vo nghiem");
        else return ("phuong trinh co hai nghiem phan biet la:"+(-b-Math.sqrt(delta()))/(2*a)+";"+(-b+Math.sqrt(delta()))/(2*a));
    }
}
