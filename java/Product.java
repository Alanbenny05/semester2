class Product {
    int pcode;
    String pname;
    double price;

Product(int pcode,String pname,double price){
    this.pcode=pcode;
    this.pname=pname;
    this.price=price;
}
public static void main(String[] args){
    Product p1=new Product(001,"Pen",10);
    Product p2=new Product(002,"Notebook",50);
    Product p3=new Product(003,"Pencil",5);

    Product lowest=p1;
    if(p2.price<lowest.price){
        lowest=p2;
    }
    if(p3.price<lowest.price){
        lowest=p3;
    }
    System.out.println("Product with lowest price:");
    System.out.println("Code:"+lowest.pcode);
    System.out.println("Name:"+lowest.pname);
    System.out.println("Price"+lowest.price);
}
}
