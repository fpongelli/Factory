public abstract class Production {
   protected String model;
    public Production (String model) {
        this.model = model;
    }
    public abstract void makeProduct();
}
//factory ha un metodo start production che mette, creo sottoclassi hddproduction, tv production e
  //      washmachine production