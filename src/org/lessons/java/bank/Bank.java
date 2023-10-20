package org.lessons.java.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//        Nome dell'utente
        System.out.println("Inserisci il nome: ");
        String nome = scan.nextLine();

//        Creazione del conto
        Conto conto1 = new Conto(nome);

//        Scelta dell'utente
        int sceltaUtente = 0;
        while (sceltaUtente == 0){
            boolean exit = false;
            while(!exit){
                System.out.println("Selezionare l'operazione da compiere: ");
                System.out.println("1 - Versamento");
                System.out.println("2 - Prelievo");
                System.out.println("3 - Uscire");
                System.out.print("Digita il numero corrispondente: ");
                String sceltaUtenteStr = scan.nextLine();
                sceltaUtente = Integer.parseInt(sceltaUtenteStr);
                if (sceltaUtente == 1) {
                    System.out.println("Qual'è l'importo del versamento? ");
                    String importoVersamentoStr = scan.nextLine();
                    int importoVersamento = Integer.parseInt(importoVersamentoStr);
                    conto1.versamento(importoVersamento);
                    System.out.println("Il tuo nuovo saldo è: " + conto1.getSaldo());
                    sceltaUtente = 0;
                }
                else if (sceltaUtente == 2) {
                    double saldo = conto1.getSaldo();
                    System.out.println("Qual'è l'importo del prelievo? ");
                    String importoPrelievoStr = scan.nextLine();
                    int importoPrelievo = Integer.parseInt(importoPrelievoStr);
                    if (importoPrelievo <= 0){
                        System.out.println("Inserire un numero valido!");
                    } else{
                        conto1.prelievo(importoPrelievo);
                    }
                    double nuovoSaldo = conto1.getSaldo();
                    if (saldo == nuovoSaldo){
                        System.out.println("Operazione impossibile. Il tuo saldo è: " + nuovoSaldo);
                    }
                    else {
                        System.out.println("Il tuo nuovo saldo è: " + nuovoSaldo);
                    }
                    sceltaUtente = 0;
                } else if (sceltaUtente == 3) {
                    System.out.println("Uscita in corso...");
                    System.out.println("...");
                    System.out.println("...");
                    System.out.println("Uscita avvenuta correttamente");
                    exit = true;
                }
            }
        }
        scan.close();
    }
}
