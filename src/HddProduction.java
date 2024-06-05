public class HddProduction extends Production{
    public HddProduction(String model) {
        super(model);
    }
    @Override
    public void makeProduct(){
        System.out.println("Stai producendo un HDD di modello: "+model);
    }

}


