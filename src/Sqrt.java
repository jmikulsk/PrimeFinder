import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {

        System.out.println(" Podaj liczbę :");
        Scanner scanner = new Scanner(System.in);
        Double d = Double.parseDouble(scanner.nextLine());
        if(d<0){
            throw new IllegalArgumentException();
        }
        System.out.println(Math.sqrt(d));
    }
}
