/*
Zadanie nr3 Laboratorium3,  Bartosz Bizoń
*/public class zad3 {
    String id;
    String name;
    int balance;


    zad3 (String id, String name){
        id="222";
        name="Konto";

    }
    zad3 (String id, String name,int balance){
        id="222";
        name="Konto";
        balance=123;
    }

    public static void main(String args[]){


        zad3 something = new zad3("123","konto",123);
        zad3 something2 = new zad3("123","konto");

    }

        String getId(){
        return id;
        }

        String getName(){
        return name;
        }

        int getBalance(){
        return balance;
        }

        int credit(int amount){
        balance = balance+amount;
        return balance;
        }

        int debit(int amount){
        if(amount<=balance){
            return amount/balance;
        }else{
            System.out.println("Amount exceeded balance");
            return balance;
        }
    }

        int transfetTo(zad3 account, int amount){
            if(amount<=balance){
                account.balance=amount;
                return account.balance;
            }else{
                System.out.println("Amount exeeded balance");
                return balance;
            }
        }


    String tooString(){
        return "Account[id= "+id+" ,name= "+name+" ,balance= "+balance+"]";
    }
}
