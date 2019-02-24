package hu.me;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        JSONMapper jsonMapper = new JSONMapper();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        do{
            System.out.println("Válassz működést! 1. Konzol  2. JSON fájl  3. Kilépés: ");
            int funkcio = scanner.nextInt();

            if(funkcio == 1) {
                jsonMapper.calculateByConsole();
            }
            if(funkcio == 2) {
                jsonMapper.calculateByJSON();
            }
            if(funkcio == 3) {
                running = false;
            }

        }while (running);

    }

}
