package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    // Salvare in opportune variabili il nome, cognome, colore preferito 
    // e data di nascita di un utente suddivisa in giorno, mese e anno in numero   
    public static void main(String[] args) {
        String nome;
        String cognome;
        String colore;
        
        int giornoDiNascita;
        int meseDiNascita;
        int annoDiNascita;
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci il tuo nome:");

        nome = sc.nextLine();
        System.out.println("Inserisci il tuo cognome:");

        cognome = sc.nextLine();
        System.out.println("Inserisci il tuo colore preferito:");

        colore = sc.nextLine();
        System.out.println("Inserisci il giorno di nascita:");

        giornoDiNascita = sc.nextInt();
        System.out.println("Inserisci il mese di nascita:");

        meseDiNascita = sc.nextInt();
        System.out.println("Inserisci l'anno di nascita:");

        annoDiNascita = sc.nextInt();
        int sommaPsw= annoDiNascita+meseDiNascita+giornoDiNascita;

        System.out.println("Password genrata: "+ nome+"-"+cognome+"-"+colore+"-"+sommaPsw);
        sc.close();
    }
}
