# Bright Future Technologies – Product Management Application

## 1. Project Description

The **Bright Future Technologies Product Management Application** is a Java console-based application designed to manage product information.

The application allows the user to:

1. Capture a new product
2. Search for a product
3. Update a product
4. Delete a product
5. Print a product report
6. Exit the application

The application uses Java arrays to store product information and methods to perform the different operations.

---

## 2. Project Structure

The project consists of the following Java files:

```text
BrightFutureTechnologies/
│
├── Main.java
├── Products.java
└── README.md
```

### Main.java

`Main.java` contains the main method and controls the application's main menu and program flow.

It creates an instance of the `Products` class and calls the appropriate method based on the option selected by the user.

### Products.java

`Products.java` contains the main functionality of the application.

It stores product information using arrays and contains methods for:

* Capturing products
* Searching for products
* Updating products
* Deleting products
* Printing a product report
* Exiting the application

---

## 3. Product Information Stored

The application stores the following information for each product:

* Product number
* Product code
* Product name
* Product category
* Product warranty
* Product price
* Stock level
* Supplier

The application currently allows a maximum of **5 products** to be stored.

---

## 4. Product Categories

The following product categories are available:

1. Desktop Computer
2. Tablet
3. Laptop
4. Printer
5. Gaming Console

---

## 5. Warranty Options

When capturing a product, the user can select:

* 6 Months
* 2 Years

---

## 6. Application Menu

After launching the application, the user is presented with the following options:

```text
(1) Capture a new product
(2) Search for a product
(3) Update a product
(4) Delete a product
(5) Print report
(6) Exit Application
```

The application continues displaying the menu until the user selects option 6.

---

## 7. Capture Product

The **Capture Product** function allows the user to enter a new product.

The user provides:

* Product code
* Product name
* Product category
* Warranty
* Price
* Stock level
* Supplier

A product number is automatically assigned when the product is captured.

The application prevents additional products from being added once the maximum of five products has been reached.

---

## 8. Search Product

The **Search Product** function allows the user to search for a product using its product code.

The search is not case-sensitive.

If the product is found, the application displays all of its stored information.

If the product cannot be found, an appropriate error message is displayed.

---

## 9. Update Product

The **Update Product** function allows the user to update an existing product.

The user first enters the product code of the product they want to update.

The following information can be updated:

* Product name
* Price
* Stock level
* Supplier

If a field is left blank, the existing value is retained.

---

## 10. Delete Product

The **Delete Product** function allows the user to remove a product using its product code.

After a product is deleted, the remaining product information is shifted so that the arrays remain organised.

The final unused array position is then cleared.

---

## 11. Print Report

The **Print Report** function displays all products currently stored in the application.

The report includes:

* Product number
* Product code
* Product name
* Category
* Warranty
* Price
* Stock level
* Supplier

The total number of captured products is also displayed.

---

## 12. Exit Application

The **Exit Application** option terminates the main application loop and displays a goodbye message.

---

## 13. Data Storage

The application uses **parallel arrays** to store product information.

Each product's information is stored at the same array index.

For example:

```text
productCode[0]
productName[0]
productCategory[0]
price[0]
stockLevel[0]
```

All of these values represent information belonging to the same product.

A counter is used to keep track of the number of products currently stored.

---

## 14. Requirements

To run the application, you need:

* Java Development Kit (JDK)
* A Java-compatible IDE or terminal
* `Main.java`
* `Products.java`

No external libraries are required.

---

## 15. How to Run

### Using an IDE

1. Open the project in a Java-compatible IDE.
2. Add `Main.java` and `Products.java` to the project.
3. Run `Main.java`.
4. Follow the instructions displayed in the console.

### Using the Terminal

Navigate to the directory containing the Java files and compile them:

```bash
javac Main.java Products.java
```

Then run the application:

```bash
java Main
```

---

## 16. Input Handling

The application includes input validation for several user inputs.

For example, the main menu checks whether the entered menu option is a number. The stock level also checks that the user enters a numerical value.

Invalid menu selections are rejected and the user is prompted to select a valid option.

---

## 17. Program Flow

The general application flow is:

```text
Start
  |
  v
Landing Screen
  |
  v
Launch Application?
  |
  v
Display Menu
  |
  +----> 1. Capture Product
  |
  +----> 2. Search Product
  |
  +----> 3. Update Product
  |
  +----> 4. Delete Product
  |
  +----> 5. Print Report
  |
  +----> 6. Exit
  |
  v
End
```

---

## 18. Author

**Kabelo Len Mohale**

Java Product Management Application
