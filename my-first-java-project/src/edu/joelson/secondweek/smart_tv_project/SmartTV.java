package edu.joelson.secondweek.smart_tv_project;

public class SmartTV{
    boolean estado = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        estado=true;
    }

    public void desligar(){
        estado=false;
    }

    public void aumentarVolume(){
        // volume = volume +1
        volume++;
        System.out.println("Aumentando volume: " + volume);
    }

    public void diminuirVolume(){
        // volume = volume -1
        volume--;
        System.out.println("Diminuindo o volume: " + volume);
    }

    public void aumentarCanal(){
        canal++;
    }

    public void diminuirCanal(){
        canal--;
    }

    public void mudarCanal(int novoCanal){
        if(estado == false){
            System.out.println("Você não pode mudar o canal quando a TV estiver desligada!");
        }else{
            canal = novoCanal;
        }
        
    }
}