public class CustomerAccount {
    String id;
    String firstName;
    String lastName;
    double heldMoney;

    public void setDetails (String personId, String personFirstName, String personLastname, double personHeldMoney){

        id = personId;
        firstName = personFirstName;
        lastName = personLastname;
        heldMoney = personHeldMoney;
    }
}
