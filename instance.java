class Citizen{}
class IndianCitizen extends Citizen{}
 class instance {
    public static void main(String args[]){
        IndianCitizen lucky = new IndianCitizen();
        System.out.println(lucky instanceof IndianCitizen);
        System.out.println(lucky instanceof Citizen);
    }    
}
