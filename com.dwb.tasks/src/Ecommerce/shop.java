package Ecommerce;

public class shop {
    int stock = 0;

    // get product from suppliers
    public void getProduct(int product) {

        System.out.println("Getting Product from Supplier 1: " +product);
        int totalStock = stock+product;
        System.out.println("After buying Product from Supplier 1: " +totalStock);
        stock = totalStock;
    }
    public void getProduct1(int product) {
        System.out.println("Getting Product from Supplier 2: " +product);
        int totalStock = stock+product;
        System.out.println("After buying Product from Supplier 2: " +totalStock);
        stock = totalStock;
    }
    //sell product to customers
    public void sellProduct(int product)
    {
        System.out.println("Sell product to customer 1: " +product);
        int CustomerProduct = stock - product;
        System.out.println("After selling product to customer 1: " +CustomerProduct);
        stock = CustomerProduct;
    }
    public void sellProduct1(int product)
    {

        System.out.println("Sell product to customer 2: " +product);
        int CustomerProduct = stock - product;
        System.out.println("After selling product to customer 2: " +CustomerProduct);
        stock = CustomerProduct;
    }
    public void sellProduct2(int product)
    {

        System.out.println("Sell product to customer 3: " +product);
        int CustomerProduct = stock - product;
        System.out.println("After selling product to customer 3: " +CustomerProduct);
        stock = CustomerProduct;
    }
    public void sellProduct3(int product)
    {

        System.out.println("Sell product to customer 4: " +product);
        int CustomerProduct = stock - product;
        System.out.println("After selling product to customer 4: " +CustomerProduct);
        stock = CustomerProduct;
    }
    public void sellProduct4(int product)
    {

        if (stock>product) {
            System.out.println("Sell product to customer 5: " + product);
            int CustomerProduct = stock - product;
            System.out.println("After selling product to customer 5: " + CustomerProduct);
            stock = CustomerProduct;
        } else
        {
            System.out.println("Out of stock please wait sometime");
        }
    }
}
