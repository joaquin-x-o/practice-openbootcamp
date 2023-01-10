public class Main {
    public static void main(String[] args) {
        int numeroif = 9;

        if (numeroif >= 1){
            System.out.println("es positivo");
        } else if (numeroif <= -1) {
        System.out.println("es negativo");
        } else {
            System.out.println("es 0");
        }

        int numeroWhile = 2;

        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;

        }

        do {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile +1;
        } while (numeroWhile < 3);

        for (int numeroFor= 0; numeroFor <= 3; numeroFor = numeroFor +1) {
            System.out.println(numeroFor);
        }

        var estacion = "Interstellar";
        switch (estacion) {
            case "primavera":
                    System.out.println("es primavera");
                    break;
            case "verano":
                    System.out.println("es verano");
                    break;
            case "otoño":
                    System.out.println("es otoño");
                    break;
            case "invierno":
                    System.out.println("es invierno");
                    break;
            default:
                    System.out.println("no es una estacion");

        }
    }

}