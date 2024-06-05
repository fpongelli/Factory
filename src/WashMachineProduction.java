public class WashMachineProduction extends Production{
    //nel csotruttore gli passo il modello
    //usando super(model) stiamo richiamando il csotruttore della classe madre
    //e passando il modello come argomento dopo con l'override ridefinisco il metodo nella sottoclasse:
// il metodo originale e quello che lo ridefinisce hanno la stessa firma,
// e solo l'interprete,a tempo di esecuzione, determina quale dei due deve essere eseguito.
   // La variabile super fa riferimento anch'essa all'istanza che sta eseguendo un metodo o un costruttore,
    // ma costringe l'interprete a vedere l'oggetto come istanza della superclasse.
    // La variabile super viene usata tipicamente per accedere a metodi della superclasse
    // che sono stati sovrascrittinella sottoclasse.

    public WashMachineProduction(String model) {
        super(model);
    }

    //L'overriding consente di ridefinire un metodo in una sottoclasse:
    // il metodo originale e quello che lo ridefinisce hanno necessariamente la stessa firma,
    // e solo l'interprete,a tempo di esecuzione, determina quale dei due deve essere eseguito.
    @Override
    public void makeProduct() {
        System.out.println("Stai producendo una Wash Machine di modello : " + model);
    }
}
