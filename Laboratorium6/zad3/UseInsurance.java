public class UseInsurance {

    public static void main(String[] args){

        Health inHealht = new Health("Health");
        Life inLife = new Life("Life");

        System.out.println("Name Insurance: "+inHealht.getType()+" , Cost: "+inHealht.setCost()+"$");
        System.out.println("Name Insurance"+inLife.getType()+" ,Cost: "+inLife.setCost()+"$");

    }

}
