package model;
/*@ZoePiper
This class describes client info such as: company name, contact person's name, address,
country and email address.
 */
public class Client implements Formatibel{
private String companyName;
private  String contactPersonName;
private String address;
private String email;
private  String country;



    public Client(String companyName, String contactPersonName, String address, String email, String country) {
        this.companyName = companyName;
        this.contactPersonName = contactPersonName;
        this.address = address;
        this.email = email;
        this.country = country;
    }
    public Client() {
    }

    @Override
    public String format() {
        System.out.printf("%s\n%s\n%s\n%s\n%s\n",companyName,contactPersonName,address,email,country);

        return null;
        //TODO wat moet het returnen?
    }
}
