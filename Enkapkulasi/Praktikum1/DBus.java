public class DBus{
    private int penumpang,maxpenumpang;
    private double bdpenumpang, bdbus;
    double beratbus=1000;
    
    public DBus(int maxpenumpang){
        this.maxpenumpang=maxpenumpang;
        penumpang = 0;
    }
    public void BBus(double bdbus){
        this.bdbus=bdbus;
        bdbus = 0;
    }
    public void pluspenumpang(int penumpang){
        int temp;
        temp=this.penumpang+penumpang;
        if (temp>=maxpenumpang){
            System.out.println("Overload penumpang");
        }
        else {
            this.penumpang=temp;
        }
    }
    public void beratPenumpang(double bdpenumpang){
        double temp;
        temp=this.bdpenumpang+bdpenumpang;
        if (temp>=bdbus){
            System.out.println("Kelebihan beban");
        }
        else {
            this.bdpenumpang=temp;
        }
    }
    public void getPassword(int password){
        if (password==90){
            System.out.println("password benar");
        }
        else{
            System.out.println("pass salah");
        }
    }
    public void cetak(){
        System.out.println("Penumpang sekarang = "+penumpang);
        System.out.println("penumpang seharusnya adalah ="+maxpenumpang);
    }
    public void getAverage(){
        double temp1;
        temp1=this.bdpenumpang/penumpang;
        if (temp1>=1000){
            System.out.println("Kelebihan beban");
        }
        else {
            System.out.println("Jumlah beban: "+bdpenumpang+beratbus);
            System.out.println("Berat rata-rata penumpang: "+temp1+" Kg");
        }
    }
}
