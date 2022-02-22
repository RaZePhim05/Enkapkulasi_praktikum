import java.util.Scanner;
public class Lingkaran {
    Scanner input = new Scanner(System.in);
    private double jarijari;
    protected double diameter, luaspermukaan, volume;
    double phi=3.14;

    public void setJarijari(){
        System.out.println("Masukkan jari-jari lingkaran: ");
        double jarijari=input.nextDouble();
        this.jarijari=jarijari;
    }
    public void diameterLingkaran(){
        double diameter=jarijari*2;
        this.diameter=diameter;
        System.out.println("Diameter lingkaran: "+ diameter);
    }
    public void luasPermukaan(){
        double luaspermukaan= 4*phi*jarijari*jarijari;
        this.luaspermukaan=luaspermukaan;
        System.out.println("Luas permukaan lingkaran: "+luaspermukaan);
    }
    public void volumLingkaran(){
        double volumlingkaran= 4*phi*jarijari*jarijari*jarijari/3;
        this.volume=volumlingkaran;
        System.out.println("Volume lingkaran:"+ volumlingkaran);
    }
}
