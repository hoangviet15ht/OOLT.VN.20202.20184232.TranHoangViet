public class FirstDegreeEquation {
    private int a;
    private int b;

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
    public String resolve(){
        if(a==0)
        {
            if(b==0) return ("phuong trinh co vo so nghiem");
            else return ("phuong trinh vo nghiem");
        }
        else return ("phuong trinh co nghiem:"+(double)-b/a);
    }
}
