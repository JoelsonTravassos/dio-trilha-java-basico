package edu.joelson.secondweek;

public class User {
    public static void main(String[] args) throws Exception {
        SmartTV smartTV = new SmartTV();

        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.diminuirVolume();
        smartTV.aumentarVolume();

        smartTV.mudarCanal(13);

        System.out.println("TV está ligada? " + smartTV.estado);
        System.out.println("Qual é o canal atual: " + smartTV.canal);
        System.out.println("Qual é o volume atual: " +smartTV.volume);

        smartTV.ligar();
        System.out.println("TV está ligada? "+ smartTV.estado);

        smartTV.mudarCanal(13);
        System.out.println("Novo canal: " + smartTV.canal);

        smartTV.desligar();
        System.out.println("TV está ligada? "+ smartTV.estado);

        smartTV.mudarCanal(14);
        
    }
}
