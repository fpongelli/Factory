import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Factory factory = new Factory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cosa vuoi stampare? 1)Stampa HDD / 2)Stampa Tv / 3)Stampa Lavatrice");
        int scelta = scanner.nextInt();

        Production production;


switch ( scelta){
    case 1:
    production = new HddProduction("HDD 1");
    break;

    case 2:
    production = new TvProduction("Samsung");
    break;

    case 3:
        production = new WashMachineProduction("Lavatrice nuova");
        break;

        default:
        System.out.println("Scelta non valida.");
        return;
}
factory.startProduction(production);

}


    }
