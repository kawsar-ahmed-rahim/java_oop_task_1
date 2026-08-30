// Create a Product class with fields: name, price, quantity.
// 
// Add methods:
// 
// totalPrice() → returns price * quantity.
// 
// In main, create an array of 3 products, calculate each product’s total price, and sum all for the cart total.

class Product {
    String name;
    double price;
    int quantity;

    Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double totalPrice() {
        return price * quantity;
    }
}

public class Ex12_ShoppingCart {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("Pen", 10, 5);
        products[1] = new Product("Notebook", 50, 3);
        products[2] = new Product("Bag", 800, 1);

        double cartTotal = 0;

        for (Product p : products) {
            double total = p.totalPrice();
            System.out.println(p.name + " -> Total: " + total);
            cartTotal += total;
        }

        System.out.println("Cart Total: " + cartTotal);
    }
}
