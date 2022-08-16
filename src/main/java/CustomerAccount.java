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

    void setFirstName(String newfirstName){
        firstName = newfirstName;
    }

    String getFullname(){
        return this.firstName + lastName;
    }
}
