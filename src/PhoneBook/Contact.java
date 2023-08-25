package PhoneBook;

public class  Contact {
    private  String name;
    private String phoneNumber;
    private  String email;

    public Contact(String name,String phoneNumber, String email){
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail(){
        return email;
    }
    @Override
    public String toString(){
        return String.format("""
                ========================
              PhoneBook
              Email:%s
              phoneNumber:%s
              Name:%s
              ===========================
                 """,getEmail(),getPhoneNumber(),getName());

    }


}
