package cwiczeniaGrudzien2;

import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        //Napisz program, który rysuje choinke ze znaków '*', tj trójkątrównoramienny a pod nim prostokąt

        Scanner klawiatura = new Scanner(System.in);
        String znak;
        int poziom;
        System.out.println("Podaj znak, z którego powstanie zadaniadomowe.choinka symetryczna:");
        znak = klawiatura.next();
        System.out.println("Podaj ilość poziomów choinki:");
        poziom = klawiatura.nextInt();

        for (int i = 0; i < poziom; i++){
            for (int x = poziom; x > i; x--){
                System.out.print(" ");
            }
            for (int y = 0; y < i + 1; y++){
                System.out.print(znak);
            }
            for (int y = 0; y < i; y++){
                System.out.print(znak);
            }
            System.out.println();
        }
    }
}