package praktikum52;

/**
 * Kelas Main untuk mendemonstrasikan sistem manajemen barang
 * yang menggunakan konsep inheritance, polymorphism, dan interface
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Goods Management System ===\n");
        
        // Membuat objek Book dengan parameter: deskripsi, harga, dan penulis
        // Book merupakan subclass dari Goods dan mengimplementasikan interface Taxable
        Book book1 = new Book("Java Programming Guide", 89.99, "John Doe");
        Book book2 = new Book("Data Structures and Algorithms", 125.50, "Jane Smith");
        
        // Membuat objek Food dengan parameter: deskripsi, harga, dan kalori
        // Food merupakan subclass dari Goods tetapi tidak mengimplementasikan Taxable
        Food food1 = new Food("Organic Apple", 2.99, 95);
        Food food2 = new Food("Whole Wheat Bread", 4.50, 245);
        
        // Membuat objek Toy dengan parameter: deskripsi, harga, dan umur minimum
        // Toy merupakan subclass dari Goods dan mengimplementasikan interface Taxable
        Toy toy1 = new Toy("LEGO Building Set", 59.99, 8);
        Toy toy2 = new Toy("Educational Puzzle", 24.99, 5);
        
        // Membuat array polymorphic yang dapat menyimpan berbagai jenis Goods
        // Ini mendemonstrasikan konsep polymorphism dimana semua objek disimpan 
        // sebagai referensi ke parent class (Goods)
        Goods[] goods = {book1, book2, food1, food2, toy1, toy2};
        
        // Menampilkan semua barang menggunakan polymorphic method call
        // Method display() akan dipanggil sesuai dengan implementasi di masing-masing subclass
        System.out.println("Semua barang di toko:");
        System.out.println("===================");
        for (int i = 0; i < goods.length; i++) {
            System.out.print((i + 1) + ". ");
            // Polymorphic method call - method yang dipanggil tergantung pada tipe objek sebenarnya
            goods[i].display();
        }
        
        // Perhitungan pajak untuk barang-barang yang mengimplementasikan interface Taxable
        // Hanya Book dan Toy yang mengimplementasikan Taxable, Food tidak kena pajak
        System.out.println("\nPerhitungan pajak:");
        System.out.println("=================");
        double totalTax = 0;
        
        // Enhanced for loop untuk iterasi melalui array goods
        for (Goods good : goods) {
            // Menggunakan instanceof untuk mengecek apakah objek mengimplementasikan Taxable
            // Ini adalah contoh runtime type checking
            if (good instanceof Taxable) {
                // Type casting dari Goods ke Taxable untuk mengakses method calculateTax()
                Taxable taxableItem = (Taxable) good;
                double tax = taxableItem.calculateTax();
                totalTax += tax;
                System.out.printf("%s - Tax: $%.2f%n", good.getDescription(), tax);
            }
        }
        
        System.out.printf("%nTotal Pajak: $%.2f%n", totalTax);
        
        // Analisis dan pengelompokan barang berdasarkan kategori
        // Menggunakan instanceof untuk mengidentifikasi tipe objek dan menghitung statistik
        System.out.println("\nRingkasan Sesuai Kategori:");
        System.out.println("====================");
        
        // Variabel untuk menyimpan jumlah dan total harga per kategori
        int bookCount = 0, foodCount = 0, toyCount = 0;
        double bookTotal = 0, foodTotal = 0, toyTotal = 0;
        
        // Loop untuk mengkategorikan dan menghitung total per kategori
        for (Goods good : goods) {
            // Runtime type checking untuk menentukan kategori barang
            if (good instanceof Book) {
                bookCount++;
                bookTotal += good.getPrice();
            } else if (good instanceof Food) {
                foodCount++;
                foodTotal += good.getPrice();
            } else if (good instanceof Toy) {
                toyCount++;
                toyTotal += good.getPrice();
            }
        }
        
        // Menampilkan ringkasan statistik per kategori
        System.out.printf("Buku: %d, Total: $%.2f%n", bookCount, bookTotal);
        System.out.printf("Makanan: %d, Total: $%.2f%n", foodCount, foodTotal);
        System.out.printf("Mainan: %d, Total: $%.2f%n", toyCount, toyTotal);
        
        // Demonstrasi lebih lanjut tentang polymorphism
        // Membuat objek baru dan menyimpannya sebagai referensi parent class
        System.out.println("\nDemo Polymorphism:");
        System.out.println("==================");
        System.out.println("Calling display() method through Goods reference:");
        
        // Polymorphic assignment - objek subclass disimpan dalam referensi superclass
        // Walaupun referensinya bertipe Goods, method yang dipanggil adalah dari subclass
        Goods polymorphicBook = new Book("Design Patterns", 79.99, "Gang of Four");
        Goods polymorphicFood = new Food("Premium Coffee", 12.99, 5);
        Goods polymorphicToy = new Toy("RC Car", 149.99, 10);
        
        // Late binding/dynamic method dispatch - method yang tepat dipilih saat runtime
        // berdasarkan tipe objek sebenarnya, bukan tipe referensi
        polymorphicBook.display(); // Memanggil Book.display()
        polymorphicFood.display();  // Memanggil Food.display()
        polymorphicToy.display();   // Memanggil Toy.display()
        
        System.out.println("\n=== Akhir Demo ===");
    }
}