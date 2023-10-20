package org.lessons.java.bank;

import java.util.Random;

public class Conto {
//    Dichiarazione attributi

    private int codice;
    private String nome;
    private double saldo;

//    Costruttore
    public Conto(String nome){
//        alla costruzione del conto il saldo viene settato a 0
        this.saldo = 0;
        this.nome = nome;
//        creazione codice tramite assegnazione di numero random
        Random randomGen = new Random();
        this.codice = randomGen.nextInt(1, 100);
    }
//    Metodi


    public int getCodice() {
        return codice;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void versamento(double soldiDaVersare){
        saldo += soldiDaVersare;
    }

    public double prelievo(double soldiDaPrelevare){
        if (soldiDaPrelevare < saldo){
            saldo -= soldiDaPrelevare;
        }
        return saldo;
    }
}
