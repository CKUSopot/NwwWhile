import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 13. Używając pętli while() napisz program NwwWhile, który będzie obliczał
 * Najmniejszą Wspólną Wielokrotność (NWW) dwóch liczb wprowadzonych przez
 * użytkownika (liczbaA i liczbaB) – czyli najmniejszą liczbę naturalną, która jest
 * podzielna bez reszty przez obie liczby. Algorytm postępowania jest następujący:
 * 1. NWW=liczbaA*liczbaB
 * 2. zmiennaA=liczbaA
 * 3. zmiennaB=liczbaB
 * 4. Gdy zmiennaB<>0 wykonuj
 * • zmiennaC=zmiennaB
 * • zmiennaB= zmiennaA % zmiennaB
 * • zmiennaA=zmiennaC
 * • Idź do punktu 4
 * 5. Wynik = Math.floor(NWW/zmiennaA)
 */

public class NwwWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean bylBlad;
        do {
            bylBlad = false;
            try {
                System.out.print("Podaj liczbę A: ");
                int liczA = scanner.nextInt();
                System.out.print("Podaj liczbę B: ");
                int liczB = scanner.nextInt();
                int nWW = liczA * liczB;
                int zmienA = liczA;
                int zmienB = liczB;
                while (zmienB != 0){
                    int zmienC = zmienB;
                    zmienB = zmienA % zmienB;
                    zmienA = zmienC;
                }
                double wynik = Math.floor(nWW/zmienA);
                System.out.println(wynik);
            } catch (InputMismatchException e) {
                scanner.nextLine();
                bylBlad = true;
            }
        }while(bylBlad);
    }
}

// boolean bylBlad;
//        do{
//            bylBlad = false;
//            try {
//                System.out.print("Podaj liczbę: ");
//                int liczba = scanner.nextInt();
//
//            } catch (Exception e) {
//                scanner.nextLine();
//                bylBlad = true;
//            }
//        }while(bylBlad);