package org.lessons.java.shop;



public class Main {
//    Nello stesso package aggiungete una classe Main con metodo main nella quale create tre prodotti e ne stampate il nome completo e il prezzo comprensivo di iva.
    public static void main(String[] args) {
        Prodotto prodotto1 = new Prodotto("Pane", "Da farine di grano tenero italiane nasce il nostro pane super fragrante", 2.50, 4);
        Prodotto prodotto2 = new Prodotto("Benzina", "La nostra migliore 80 ottani", 2.0, 23);
        Prodotto prodotto3 = new Prodotto("Colla", "La super-incollatrice migliore del mercato", 21.3, 23);

//        Stampa nome completo
        System.out.println(prodotto1.getFullProductName());
        System.out.println(prodotto2.getFullProductName());
        System.out.println(prodotto3.getFullProductName());

//        Stampa prezzo completo
        System.out.println(prodotto1.getFullPrice());
        System.out.println(prodotto2.getFullPrice());
        System.out.println(prodotto3.getFullPrice());



    }
}
