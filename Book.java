import java.util.Scanner;

public class Book {
    private int id;
    private String title;
    private String author;
    private double price;

    // Constructor không tham số
    public Book() {
    }

    // Constructor đầy đủ tham số
    public Book(int id, String title, String author, double price) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Getter & Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Nhập thông tin sách
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sách: ");
        this.id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên sách: ");
        this.title = sc.nextLine();
        System.out.print("Nhập tác giả: ");
        this.author = sc.nextLine();
        System.out.print("Nhập đơn giá: ");
        this.price = Double.parseDouble(sc.nextLine());
    }

    // Xuất thông tin sách
    public void output() {
        String msg = """
                BOOK: id=%d, title=%s, author=%s, price=%.2f
                """.formatted(id, title, author, price);
        System.out.print(msg);
    }
}
