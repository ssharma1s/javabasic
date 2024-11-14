package product;

public class Product {
    // class variable
    String name;
    float price;
    char grade;
    Long serialNumber;
    Double discount;

    public String getName(){
        return name;
    }
   // method or function with argument-- right hand side name is argument and this.name is coming from the String name
    public void setName(String name){ // the argument can be of different datatypes
        this.name = name;// this represents the variable of the class variable
    }
    public float getPrice() {
        return this.price;

    }
        public void setPrice(float price){
        this.price = price;
    }
    public char getGrade(){
        return grade;
    }
    public Long getSerialNumber(){
        return serialNumber;
    }
    public Double getDiscount(){
        return discount;
    }

}
