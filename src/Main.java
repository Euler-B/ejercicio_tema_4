public class Main {
    public static void main(String[] args) {
        //Salida del If
        int numeroIf = 3;
        if (numeroIf == 0) {
            System.out.println("El cero no es ni positivo ni negativo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
             System.out.println("El numero es positivo");
        }
        //Salida del While
        System.out.println("");
        int numeroWhile = 0;
        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile++;
        }
        //Salida del Do While
        System.out.println("");
        do {
            System.out.println(numeroWhile);
            numeroWhile++;
        } while (numeroWhile < 3);
        //Salida del for
        System.out.println("");
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }
        //Salida del switch
        System.out.println("");
        String estacion = "Verano";
        switch (estacion) {
            case "Verano":
            System.out.println("Estamos en Verano");
            break;
            case "Invierno":
            System.out.println("Estamos en Invierno");
            break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Primavera":
                System.out.println("Estamos en Primavera");
        }


    }
}