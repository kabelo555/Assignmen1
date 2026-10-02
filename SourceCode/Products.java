import java.util.Scanner;

public class Products {

    Scanner scanner = new Scanner(System.in);

    String border = "**********************************************";
    String line = "-------------------------------------------";
    String doubleLine = "============================================";

    
    int max = 5;// Maximum of 5 products that the user needs to capture on our system
    int[] productNumber = new int[max];
    int[] price = new int[max];
    int[] stockLevel = new int[max];
    String[] productCode = new String[max];
    String[] productWarranty = new String[max];
    String[] productName = new String[max];
    String[] productCategory = new String[max];
    String[] supplier = new String[max];          
    boolean a = false;//boolean that will trigger exit app Method
    int exitInt;

    int counts = 0;//Keeps track of the product number captured                            

    // Landing block
    public void LandingBlock() {
    System.out.print("BRIGHT FUTURE TECHNOLOGIES APPLICATION\n" + border + "\n");
    System.out.println("Enter (1) to launch application or any other key to exit");

    String optionSelect = scanner.nextLine();

    if (optionSelect.equals("1")) {
        a = true;
    } else {
        a = false;
    }
 }

    // Display menu
    public void DisplayMenu() {
        System.out.println(border);
        System.out.println("Please Select one of the following items:\n"+border);
        System.out.println("(1) Capture a new product");
        System.out.println("(2) Search for a product");
        System.out.println("(3) Update a product");
        System.out.println("(4) Delete a product");
        System.out.println("(5) Print report");
        System.out.println("(6) Exit Application");
    }

    // Capture a new product Method
    public void CaptureProduct() {
        if (counts >= 5) {
            System.out.println("Maximum number of products (5) reached. Cannot add more.");
            return;
        }

        System.out.println("\nCAPTURE A NEW PRODUCT\n" + border);

        System.out.print("Enter the product code: ");
        scanner.nextLine();
        productCode[counts] = scanner.nextLine();

        System.out.print("Enter Product Name: ");
        productName[counts] = scanner.nextLine();

       System.out.println("Select the product category:");
System.out.println("(1) Desktop Computer");
System.out.println("(2) Tablet");
System.out.println("(3) Laptop");
System.out.println("(4) Printer");
System.out.println("(5) Gaming Console");

System.out.print("Enter your option: ");
String category = scanner.nextLine();

while (!category.equals("1") && !category.equals("2") && !category.equals("3") && !category.equals("4") && !category.equals("5")) {

    System.out.print("Please enter a valid option from (1-5): ");
    category = scanner.nextLine();
}
        switch (category) {
            case "1": productCategory[counts] = "Desktop Computer"; 
                break;
            case "2": productCategory[counts] = "Tablet"; 
                break;
            case "3": productCategory[counts] = "Laptop"; 
                break;
            case "4": productCategory[counts] = "Printer"; 
                break;
            case "5": productCategory[counts] = "Gaming Console"; 
                break;
        }
        String warrantyInput;
        System.out.print("Indicate the product warranty. Enter (1) for 6 Months or any other key for 2 years: ");
        scanner.next();
        warrantyInput = scanner.nextLine();
        productWarranty[counts] = warrantyInput.equals("1") ? "6 Months" : "2 years";//This assigns a warrant value based on the user input/prompt
        
        System.out.print("Enter the price: ");
        while(!scanner.hasNextInt()){
           
            System.out.println("Invalid price! Please enter numbers only.");
            scanner.next();
            System.out.print("Enter the price: ");
        }
        price[counts] = scanner.nextInt();
        scanner.nextLine();

        

        System.out.print("Enter the stock level: ");

        // A while loop to ensure that the user only enters number and to handle input exceptions.
        while (!scanner.hasNextInt()) {
             System.out.println("Invalid stock level!");
             scanner.next();
             System.out.print("Enter the stock level: ");
        };

         stockLevel[counts] = scanner.nextInt();
         scanner.nextLine();
        

        System.out.print("Enter the supplier name: ");
        supplier[counts] = scanner.nextLine();

        productNumber[counts] = counts + 1;     
        counts++;

        System.out.println("Product details have been saved successfully!");
    }

    // Search for a product Method
    public void SearchProduct() {
        System.out.print("\nPlease enter the product code to search: ");
        scanner.nextLine();
        String search = scanner.nextLine();

        int foundIndex = -1;
        for (int i = 0; i < counts; i++) {
            if (search.equalsIgnoreCase(productCode[i])) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println(border);
            System.out.println("PRODUCT SEARCH RESULTS");
            System.out.println(border);
            System.out.println("PRODUCT NUMBER:      " + productNumber[foundIndex]);
            System.out.println("PRODUCT CODE:        " + productCode[foundIndex]);
            System.out.println("PRODUCT NAME:        " + productName[foundIndex]);
            System.out.println("PRODUCT CATEGORY:    " + productCategory[foundIndex]);
            System.out.println("PRODUCT WARRANTY:    " + productWarranty[foundIndex]);
            System.out.println("PRODUCT PRICE:       R" + price[foundIndex]);
            System.out.println("STOCK LEVEL:         " + stockLevel[foundIndex]);
            System.out.println("SUPPLIER:            " + supplier[foundIndex]);
            System.out.println(border);
        } else {
            System.out.println("The product cannot be located. enter a valid product code.");
        }
    }

    // Update a product
    public void UpdateProduct() {
        scanner.nextLine();
        System.out.print("\nEnter the product code you wish to update: ");
        String search = scanner.nextLine();

        int foundIndex = -1;
        for (int i = 0; i < counts; i++) {
            if (search.equalsIgnoreCase(productCode[i])) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Invalid product code!");
            return;
        }

        System.out.println("\nUpdating product: " + productName[foundIndex]);
        System.out.println("Leave a field blank and press Enter to keep the current value.\n");

        System.out.print("New product name [" + productName[foundIndex] + "]: ");
        String input = scanner.nextLine();
        if (!input.isEmpty()) productName[foundIndex] = input;

        System.out.print("New price [" + price[foundIndex] + "]: ");
        input = scanner.nextLine();
        if (!input.isEmpty()) price[foundIndex] = Integer.parseInt(input);

        System.out.print("New stock level [" + stockLevel[foundIndex] + "]: ");
        input = scanner.nextLine();
        if (!input.isEmpty()) stockLevel[foundIndex] = Integer.parseInt(input);

        System.out.print("New supplier [" + supplier[foundIndex] + "]: ");
        input = scanner.nextLine();
        if (!input.isEmpty()) supplier[foundIndex] = input;

        System.out.println("Product updated successfully!");
    }

    // Delete a product
    public void DeleteProduct() {
        System.out.print("\nEnter the product code you wish to delete: ");
        scanner.nextLine();
        String search = scanner.nextLine();

        int foundIndex = -1;
        for (int i = 0; i < counts; i++) {
            if (search.equalsIgnoreCase(productCode[i])) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex == -1) {
            System.out.println("Invalid product code!");
            return;
        }

        for (int i = foundIndex; i < counts - 1; i++) {
            productNumber[i] = productNumber[i + 1];
            productCode[i] = productCode[i + 1];
            productName[i] = productName[i + 1];
            productCategory[i] = productCategory[i + 1];
            productWarranty[i] = productWarranty[i + 1];
            price[i] = price[i + 1];
            stockLevel[i] = stockLevel[i + 1];
            supplier[i] = supplier[i + 1];
        }

        int last = counts - 1;
        productNumber[last] = 0;
        productCode[last] = null;
        productName[last] = null;
        productCategory[last] = null;
        productWarranty[last] = null;
        price[last] = 0;
        stockLevel[last] = 0;
        supplier[last] = null;

        counts--;
        System.out.println("Product deleted successfully!");
    }

    // Print report
    public void PrintReport() {
        if (counts == 0) {
            System.out.println("\nNo products have been captured yet.");
            return;
        }

        System.out.println("\n" + doubleLine);
        System.out.println("PRODUCT REPORT - BRIGHT FUTURE TECHNOLOGIES");
        System.out.println(doubleLine);

        for (int i = 0; i < counts; i++) {
            System.out.println("PRODUCT NUMBER:   " + productNumber[i]);
            System.out.println("PRODUCT CODE:     " + productCode[i]);
            System.out.println("PRODUCT NAME:     " + productName[i]);
            System.out.println("CATEGORY:         " + productCategory[i]);
            System.out.println("WARRANTY:         " + productWarranty[i]);
            System.out.println("PRICE:            R" + price[i]);
            System.out.println("STOCK LEVEL:      " + stockLevel[i]);
            System.out.println("SUPPLIER:         " + supplier[i]);
            System.out.println(line);
        }
        System.out.println("Total products: " + counts);
        System.out.println(doubleLine);
    }

    //Exit Method;
    public void ExitApplication(){
        System.out.println("Thank you for using Bright Future Technologies, Goodbye!!");
        exitInt = 6;
    }
};