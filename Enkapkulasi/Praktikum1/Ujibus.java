public class Ujibus {
    public static void main(String[] args) {
        DBus busMini=new DBus(10);
        busMini.getPassword(40);
        busMini.getPassword(90);
        busMini.cetak();
        busMini.BBus(1000.5);

        busMini.pluspenumpang(3);
        busMini.cetak();
        busMini.beratPenumpang(220.9);
        
        busMini.pluspenumpang(1);
        busMini.cetak();
        busMini.beratPenumpang(80.5);
        
        busMini.pluspenumpang(4);
        busMini.cetak();
        busMini.beratPenumpang(350.2);
        
        System.out.println();
        busMini.getAverage();
    }

}
