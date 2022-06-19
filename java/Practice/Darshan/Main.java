class Customer{
    private String custId;
    private String custName;
    private Address address;


}
class RegisterCustomer{
    private double fees;

}
class Address{
    String addr1;
    String addr2;
    String city;
    int pin ;

    public String getAddr1() {
        return this.addr1;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public String getAddr2() {
        return this.addr2;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPin() {
        return this.pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }
    

}

public class Main {
    
}
