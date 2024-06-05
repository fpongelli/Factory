public class TvProduction extends Production{
    public TvProduction(String model){
        super(model);
    }

@Override
    public void makeProduct(){
    System.out.println("Stai producendo una Tv di modello: "+model);
}

}
