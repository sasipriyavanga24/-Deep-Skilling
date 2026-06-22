import java.util.Scanner;

public class ECommerceSearch {

    public static void main(String[] args) {

        String[] products = {
            "Laptop",
            "Mobile",
            "Headphones",
            "Smart Watch",
            "Keyboard"
        };

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter product name: ");
        String search = sc.nextLine();

        boolean found = false;

        for (String product : products) {
            if (product.equalsIgnoreCase(search)) {
                System.out.println("Product Found: " + product);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product Not Found");
        }

        sc.close();
    }
}