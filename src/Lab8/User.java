package Lab8;

public class User {
    private String name;
    private String password;
    private double money;
    
    public void setName(String name) {
        this.name = name;
    }
    
    private void setPassword(String password) {
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }
    
    public double getMoney() {
        return money;
    }
    
    private void setMoney(double money) {
        this.money = money;
    }
//    private String name(){
//        return name;
//    }
    
    public String getName() {
        return name;
    }

//    private String password(){
//        return password;
//    }
//    private double money(){
//        return money;
    
    
    public void introduce() {
        System.out.printf("%s\n%s\n", getName(), getMoney());
    }
    
    public void expense(double expense) {
        money -= expense;
    }
    
    public void income(double income) {
        money += income;
    }
    
    public static void main(String[] args) {
        User user = new User();
        user.setName("Lucy");
        user.setPassword("123456");
        user.setMoney(1000);
        user.introduce();
        user.expense(2000);
        user.expense(500);
        user.income(1000);
        user.introduce();
    }
}
