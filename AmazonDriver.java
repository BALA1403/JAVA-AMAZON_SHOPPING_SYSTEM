
package JavaPractice01;

class AmazonDriver {

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the cart size");
        int cart_size = sc.nextInt();
        Amazon a = new Amazon(cart_size);
        boolean flag = true;

        while (flag) {
            System.out.println("---------------------------");
            System.out.println("1.Add Product");
            System.out.println("2.Remove Product");
            System.out.println("3.Check Cart Empty??");
            System.out.println("4.Check Cart full??");
            System.out.println("5.Display cart items..");
            System.out.println("6.Exit");
            System.out.println("------------------------------");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    System.out.print("Enter name of product :");
                    String name = sc.next();
                    System.out.print("Enter id of product :");
                    int pdt_id = sc.nextInt();
                    System.out.print("Enter price of product :");
                    double price = sc.nextDouble();
                    a.c.addProduct(new Product(name, pdt_id, price));
                }
                break;

                case 2: {
                    a.c.removeProduct();
                }
                break;

                case 3: {
                    if (a.c.isCartEmpty()) {
                        System.out.println("Cart is empty");
                    } else {
                        System.out.println("Cart is not empty");
                    }
                }
                break;

                case 4: {
                    if (a.c.isCartFull()) {
                        System.out.println("Cart is full");
                    } else {
                        System.out.println("Cart is not full");
                    }

                }
                break;

                case 5: {
                    a.c.display();
                }
                break;

                case 6: {
                    flag = false;
                }
                break;

                default: {
                    System.out.println("Invalid option");
                }
            }
        }
    }
}
