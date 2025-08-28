import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Good> goods = new ArrayList<Good>();
            ArrayList<Report> reports = new ArrayList<Report>();
            Good good1 = new Good("Pulpen", 1000, 1);
            Good good2 = new Good("Spidol", 5000, 3);
            goods.add(good1);
            goods.add(good2);
            Integer t = 1;
            Integer total = 0;
            while (t > 0) {
                System.out.println("-------KOPERASI JUAL BELI-------\n");
                System.out.println("-------Barang Tersedia-------\n");
                for (int i = 0; i < goods.size(); i++) {
                    String goodName = goods.get(i).getName();
                    System.out.println(i + ": " + goodName);
                }
                System.out.println("Pilih Menu: (cantumkan nomornya)");
                Integer ord = scanner.nextInt();
                if (ord < goods.size()) {
                    System.out.println("Berapa banyak?: (cantumkan nomornya)");
                    Integer buyT = scanner.nextInt();
                    Integer stockLeft = goods.get(ord).getStock();
                    if (stockLeft >= buyT) {
                        total += goods.get(ord).getPrice() * buyT;
                        goods.get(ord).buy(buyT);
                    } else {
                        System.out.println("Stok tidak mencukupi");
                    }
                    System.out.println("Total: " + total);
                    System.out.println("Beli lagi? (0 jika tidak, 1 jika iya)");
                    Integer confirm = scanner.nextInt();
                    System.out.println("\n");
                    if (confirm == 1) {
                        t = 1;
                    } else {
                        t = 0;
                    }
                }
            }
            System.out.println("-------Laporan Keuangan-------\n");
            Report report1 = new Report(total, LocalDate.now(ZoneId.systemDefault()));
            reports.add(report1);
            System.out.println("Dana: "+ reports.get(0).getIncome() + " Tanggal: "+ reports.get(0).getDate()+"\n");
            System.out.println("-------Terima Kasih Telah Berbelanja-------\n");
            scanner.close();
        }
    
    }