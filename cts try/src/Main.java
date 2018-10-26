import java.util.Scanner; // super is used//
class Product { 
private long id; 
private String productName; 
private String supplierName; 
public Product(long id, String productName , String supplierName) { 
this.id = id; 
this.productName = productName; 
this.supplierName = supplierName; 
} 
public Product() { 
} 
public long getId() { 
return id; 
} 
public void setId(long id) { 
this.id = id; 
} 
public String getProductName() { 
return productName; 
} 
public void setProductName(String productName) { 
this.productName=productName; 
} 
public String getSupplierName() { 
return supplierName; 
} 
public void setSupplierName(String supplierName) { 
this.supplierName = supplierName; 
} 
void display() 
{ 
System.out.println("Product Id is "+getId()); 
System.out.println("Product Name is "+getProductName()); 
System.out.println("Supplier Name is "+getSupplierName()); 
} 
} 
public class Main { 
public static void main(String[] args) { 
Scanner sc=new Scanner(System.in); 
System.out.println("Enter the product id"); 
long id=sc.nextLong(); 
sc.nextLine(); 
System.out.println("Enter the product name"); 
String pN=sc.nextLine(); 
System.out.println("Enter the supplier name"); 
String sN=sc.nextLine(); 
Product p=new Product(id,pN,sN) ; 
p.display(); 
} 
} 