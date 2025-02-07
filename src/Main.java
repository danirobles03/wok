import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double preu = 4.10;
        System.out.println("Escull la mida, Normal (4,10€) o Gran (5,10€) :");
        String mida = scan.next();
        if ((mida.equals("Gran"))||(mida.equals("gran"))) {
            preu += 1;
        }
        while (!((mida.equals("Gran"))||(mida.equals("gran"))||(mida.equals("Normal"))||(mida.equals("normal")))){
            System.out.println("Aquesta mida no es vàlida, escull la mida, Normal o Gran (indica només (normal) o (gran)):");
            mida = scan.next();
        }
        System.out.println("Escull la base que vols afegir entre les seguents opcions (indica només el número de la base que vulguis):");
        System.out.println("1.Fideus xinesos");
        System.out.println("2.Tallarins d'arròs");
        System.out.println("3.Fins d'arròs");
        System.out.println("4.Arròs gessami");
        System.out.println("5.Arròs integral");
        System.out.println("6.Verdures variades");
        System.out.println("7.Udon gran (5,40€)");
        ArrayList<Double> preusingredientsarray = new ArrayList<>();
        ArrayList<String> nomingredients = new ArrayList<>();
        preusingredientsarray.add(4.10);
        nomingredients.add("fideus xinesos");
        preusingredientsarray.add(4.10);
        nomingredients.add("tallarins d'arròs");
        preusingredientsarray.add(4.10);
        nomingredients.add("fins d'arròs");
        preusingredientsarray.add(4.10);
        nomingredients.add("arròs gessami");
        preusingredientsarray.add(4.10);
        nomingredients.add("arròs integral");
        preusingredientsarray.add(4.10);
        nomingredients.add("verdures variades");
        preusingredientsarray.add(5.40);
        nomingredients.add("udon");
        int base = scan.nextInt();
        while ((base<1)||(base>7)){
            System.out.println("Aquesta base no es vàlida, escull una base entre el 1 i el 7 :");
            base = scan.nextInt();
        }
        preu = preusingredientsarray.get(base - 1);
        if ((base==4)||(base==5)||(base==7)) {
            System.out.println("Has escollit la mida " + mida + " amb la base d'" + nomingredients.get(base - 1));
        }
        else {
        System.out.println("Has escollit la mida " + mida + " amb la base de " + nomingredients.get(base - 1));}
        System.out.println("Afegeix els ingredients que vulguis, amb un preu adicional de 1,60€ cadascun: (indica només el número de l'ingredient)");
        System.out.println("1.Pollastre");
        System.out.println("2.Vedella (+0,40€)");
        System.out.println("3.Llom a l'ast (+0,40€)");
        System.out.println("4.Bacó");
        System.out.println("5.Gambes (+0,40€)");
        System.out.println("6.Tofu (Ecològic)");
        System.out.println("7.Bambú");
        System.out.println("8.Xampinyons");
        System.out.println("9.Shiitake");
        System.out.println("10.Bróquil");
        System.out.println("11.Espinacs");
        System.out.println("12.Tomàquet sec");
        System.out.println("13.Cacauet");
        System.out.println("14.Sèsam");
        System.out.println("15.Pinya");
        System.out.println("16.Heura (+1,40€)");
        ArrayList<Double> preusingredientsarray2 = new ArrayList<>();
        ArrayList<String> nomingredients2 = new ArrayList<>();
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Pollastre");
        preusingredientsarray2.add(2.0);
        nomingredients2.add("Vedella");
        preusingredientsarray2.add(2.0);
        nomingredients2.add("Llom a l'ast");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Bacó");
        preusingredientsarray2.add(2.0);
        nomingredients2.add("Gambes");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Tofu");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Bambú");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Xampinyons");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Shiitake");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Bróquil");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Espinacs");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Tomàquet sec");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Cacauets");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Sèsam");
        preusingredientsarray2.add(1.60);
        nomingredients2.add("Pinya");
        preusingredientsarray2.add(3.0);
        nomingredients2.add("Heura");
        System.out.println("Vols afegir un ingredient? (si o no)");
        String resposta = scan.next();
        if ((resposta.equals("Si")) || (resposta.equals("si")) || (resposta.equals("SI"))){
        System.out.println("Quin ingredient vols afegir?(indica només el número de l'ingredient)");}
        int ingredientesin = 0;
        String ingredientes = "";
        while ((resposta.equals("Si")) || (resposta.equals("si")) || (resposta.equals("SI"))) {
            ingredientesin++;
            int ingredient = scan.nextInt();
            while ((ingredient<1)||(ingredient>16)){
                System.out.println("Aquest ingredient no es vàlid, escull un ingredient entre el 1 i el 16 :");
                ingredient = scan.nextInt();
            }
            if (ingredientes.contains(nomingredients2.get(ingredient - 1))){
                System.out.println("Aquest ingredient ja ha estat escollit, vols escollir un altre?(si o no)");
                resposta = scan.next();
                if ((resposta.equals("Si")) || (resposta.equals("si")) || (resposta.equals("SI"))){
                System.out.println("Quin ingredient vols afegir? (indica només el número de l'ingredient)");
                ingredient = scan.nextInt();}
                while ((ingredient<1)||(ingredient>16)){
                    System.out.println("Aquest ingredient no es vàlid, escull un ingredient entre el 1 i el 16 :");
                    ingredient = scan.nextInt();
                }
            }
            preu += preusingredientsarray2.get(ingredient - 1);
            ingredientes += nomingredients2.get(ingredient - 1);
            System.out.println("Vols afegir un altre ingredient?(si o no)");
            resposta = scan.next();
                if ((resposta.equals("Si")) || (resposta.equals("si")) || (resposta.equals("SI"))) {
                    ingredientes += ", ";
                    System.out.println("Quin ingredien vols afegir?(indica només el número de l'ingredient)");
                }
            }
        if (ingredientesin>0){
        System.out.println("Els ingredients que has escollit són : "+ingredientes);}
        if (ingredientesin == 0) {
            System.out.println("No has escollit cap ingredient");
        }
        System.out.println("");
        System.out.println("Per últim, escogeix la salsa que vulguis sense cap tipus de preu adicional: (indica només el número de la salsa que vulguis)");
        System.out.println("1.Japonesa (Yakisoba)");
        System.out.println("2.Thai (Llet de coco i curry vermell)");
        System.out.println("3.Soja");
        System.out.println("4.Sweet chili (dolç i picant");
        System.out.println("5.Chasiu (Soja caramelitzada)");
        System.out.println("6.Salsa cacauets");
        System.out.println("7.Vietnamita (Soja i citronella)");
        System.out.println("8.Xinesa (Salsa d'ostres)");
        System.out.println("9.Coreana (Gochujang)");
        System.out.println("10.Sense salsa");
        System.out.println("11.Soja sense gluten");
        ArrayList<String> nomingredients3 = new ArrayList<>();
        nomingredients3.add("la salsa japonesa");
        nomingredients3.add("la salsa Thai");
        nomingredients3.add("soja");
        nomingredients3.add("la salsa sweet chili");
        nomingredients3.add("la salsa Chasiu");
        nomingredients3.add("la salsa de cacauets");
        nomingredients3.add("la salsa vietnamita");
        nomingredients3.add("la salsa xinesa");
        nomingredients3.add("la salsa coreana");
        nomingredients3.add("No has escollit cap salsa");
        nomingredients3.add("soja sense gluten");
        int salsa = scan.nextInt();
        while ((salsa<1)||(salsa>11)){
            System.out.println("Aquesta salsa no es vàlida, escull una salsa entre el 1 i el 11 :");
            salsa = scan.nextInt();
        }
        if (salsa==10){
            System.out.println(nomingredients3.get(salsa - 1));
        }
        else {
        System.out.println("Has escollit "+ nomingredients3.get(salsa - 1));}
        System.out.println(" ");
        if (ingredientesin==0) {
            if (salsa==10) {
                System.out.println("El teu wok final és de mida " + mida + " amb base " + nomingredients.get(base - 1) + ", no té cap ingredient i no porta cap salta .");}
        }
        else {
            System.out.println("El teu wok final és de mida " + mida + " amb base " + nomingredients.get(base - 1) + ", té com a ingredients " + ingredientes + " i porta " + nomingredients3.get(salsa - 1) + " .");
        }
        double roundedValue = Math.round(preu * 100.00) / 100.00;
        System.out.println("El preu final és de "+roundedValue+"€.");
    }
}
