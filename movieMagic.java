import java.util.Scanner;

public class movieMagic {
    int year;
    String title;
    float rating;

    public movieMagic() {
        year = 0;
        title = "";
        rating = 0.0f;
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year:");
        year = sc.nextInt();
        System.out.println("Enter Title:");
        sc.next();
        title = sc.nextLine();
        System.out.print("Enter Rating:");
        rating = sc.nextFloat();
        display();
    }

    public void display() {
        if (rating >= 0.0f && rating <= 2.0f) {
            System.out.print(title + ": Flop");
        } else if (rating > 2.0f && rating <= 3.4f) {
            System.out.print(title + ": Semi-Hit");
        } else if (rating > 3.4f && rating <= 4.5f) {
            System.out.print(title + ": Hit");
        } else {
            System.out.print(title + ": Super-Hit");
        }
    }

    public static void main(String[] args) {
        movieMagic object = new movieMagic();
        object.accept();
        //object.display();
    }
}
