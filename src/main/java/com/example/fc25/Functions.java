package com.example.fc25;

public class Functions {
    private static Giocatore[] squadra;
    private static int numGiocatori;

    public Functions(int maxGiocatori) {
        squadra = new Giocatore[maxGiocatori];
        numGiocatori = 0;
    }

    // Metodo per aggiungere un giocatore alla squadra
    public static void addPlayer(Giocatore giocatore, String name, int goal, boolean captain) {
        if (numGiocatori < squadra.length) {
            if (hasCapitano() && giocatore.isCapitano()) {
                System.out.println("La squadra già ha un capitano!");
                return;
            }
            squadra[numGiocatori] = giocatore;
            numGiocatori++;
        } else {
            System.out.println("La squadra è piena!");
        }
    }

    // Metodo per visualizzare tutti i giocatori della squadra
    public void visualizzaSquadra() {
        for (int i = 0; i < numGiocatori; i++) {
            Giocatore giocatore = squadra[i];
            System.out.println("Nome: " + giocatore.getNome() + ", Capitano: " + giocatore.isCapitano() + ", Goal: " + giocatore.getGoal());
        }
    }

    // Metodo per modificare i dati di un giocatore a scelta
    public void modificaGiocatore(int index, String nome, boolean capitano, int goal) {
        if (index >= 0 && index < numGiocatori) {
            Giocatore giocatore = squadra[index];
            giocatore.setNome(nome);
            giocatore.setCapitano(capitano);
            giocatore.setGoal(goal);
        } else {
            System.out.println("Indice non valido!");
        }
    }

    // Metodo per cancellare un giocatore dalla squadra
    public void cancellaGiocatore(int index) {
        if (index >= 0 && index < numGiocatori) {
            for (int i = index; i < numGiocatori - 1; i++) {
                squadra[i] = squadra[i + 1];
            }
            numGiocatori--;
        } else {
            System.out.println("Indice non valido!");
        }
    }

    // Metodo per visualizzare i giocatori che hanno realizzato più di 5 goal
    public void visualizzaGiocatoriGoal() {
        for (int i = 0; i < numGiocatori; i++) {
            Giocatore giocatore = squadra[i];
            if (giocatore.getGoal() > 5) {
                System.out.println("Nome: " + giocatore.getNome() + ", Goal: " + giocatore.getGoal());
            }
        }
    }

    // Metodo per visualizzare il nome del capitano
    public void visualizzaCapitano() {
        for (int i = 0; i < numGiocatori; i++) {
            Giocatore giocatore = squadra[i];
            if (giocatore.isCapitano()) {
                System.out.println("Capitano: " + giocatore.getNome());
                return;
            }
        }
        System.out.println("Non c'è un capitano nella squadra!");
    }

    // Metodo per assegnare il ruolo di capitano in modo casuale
    public void assegnaCapitanoCasuale() {
        if (!hasCapitano()) {
            int index = (int) (Math.random() * numGiocatori);
            Giocatore giocatore = squadra[index];
            giocatore.setCapitano(true);
        }
    }

    // Metodo per controllare se c'è un capitano nella squadra
    private static boolean hasCapitano() {
        for (int i = 0; i < numGiocatori; i++) {
            Giocatore giocatore = squadra[i];
            if (giocatore.isCapitano()) {
                return true;
            }
        }
        return false;
    }
}