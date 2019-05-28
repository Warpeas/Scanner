package Lab8;

public class Food {
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    private String name;
    public String getType() {
        return type;
    }
    
    public void setType(String type) {
        this.type = type;
    }
    
    private String type;
    
    public int getSize() {
        return size;
    }
    
    public void setSize(int size) {
        this.size = size;
    }
    
    private int size;
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    private double price;
    
    public void showInformation(){
        System.out.printf("%s\t%s:\t(%d Inches)\t$%.2f\n",getType(),getName(),getSize(),getPrice());
    }
}
