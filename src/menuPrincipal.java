import java.util.Scanner;

public class menuPrincipal {
    public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
       Genero rock = new Genero("rock",
               "120bpm",
               1950,
               "EEUU",
               "Chuck Berry",
               "festivial de California");
        Genero regueton = new Genero("regueton",
                "dem bow",
                1990,
                "Puerto Rico",
                "Shabba Ranks",
                "Coca-Cola Flow Fest");
        Genero jazz = new Genero("jazz",
                "swing",
                1917,
                "EEUU",
                "Louis Armstrong",
                "Festival de Jazz de Newport");
        Genero pop = new Genero("pop",
                "pop convencional",
                2019,
                "EEUU",
                "Taylor Swift",
                "Coachella");
        Genero hip_hop = new Genero("Hip-hop",
                "enérgico y rap",
                2017,
                "Canadá",
                "Drake",
                "Lollapalooza");
        Genero electronica = new Genero("electrónica",
                "sonidos sintéticos",
                2020,
                "Suecia",
                "Avicii",
                "Tomorrowland");
        //ingreso de datos
        /*int aniotemporal;
        rock.setAnio(aniotemporal = entrada.nextInt());
        regueton.setAnio(aniotemporal = entrada.nextInt());
        jazz.setAnio(aniotemporal = entrada.nextInt());
        pop.setAnio(aniotemporal = entrada.nextInt());
        hip_hop.setAnio(aniotemporal = entrada.nextInt());
        electronica.setAnio(aniotemporal = entrada.nextInt());*/


        /*System.out.println(rock.getAnio());
        System.out.println(regueton.getAnio());
        System.out.println(jazz.getAnio());
        System.out.println(jazz.getAnio()+ rock.getAnio()+ regueton.getAnio());*/
        rock.imprimirDatos();
    }
}
