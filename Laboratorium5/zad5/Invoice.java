/*
Zadanie nr5 Laboratorium5,  Bartosz Bizoń, Iwona Rymanowska
*/
public class Invoice {
    int ID;
    Customer customer;
    double amount;

    public Invoice(int ID,Customer customer, double amount){
        this.ID=ID;
        this.customer=customer;
        this.amount=amount;
    }

    int getID(int ID){
        return ID;
    }

    Object getCustomer(Customer customer){
        return customer;
    }

    void setCustomer(Customer customer){
        customer=customer;
    }

    String getAmount(){

        String amountS = Double.toString(amount);
        return amountS;
    }

    void setAmount(){
        amount=100;
    }

    String getCustomerName(String name){
        return name;
    }

    double getAmountAfterDiscount(double afterDiscount){
        afterDiscount=amount*customer.discount;
        return afterDiscount;
    }
}
