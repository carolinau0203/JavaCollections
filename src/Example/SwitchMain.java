package Example;

public class SwitchMain {
    public static void main(String[] args) {
        String azi = "Marti", x = "Astazi e ";

        switch (azi) {
            case "Luni":
                System.out.println(x.concat(azi));
                break;
            case "Marti":
                System.out.println(x.concat(azi));
                break;
            case "Miercuri":
                System.out.println(x.concat(azi));
                break;
            case "Joi":
                System.out.println(x.concat(azi));
                break;
            case "Vineri":
                System.out.println(x.concat(azi));
                break;

            case "Sambata":
                System.out.println(x.concat(azi));
                break;

            case "Duminica":
                System.out.println(x.concat(azi));
                break;

            default:
                System.out.println("Variabila 'azi' nu este o zi a saptamnii");
        }
    }
}