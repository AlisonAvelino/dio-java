package alison.avelino.sistemasmart;

public class SmartTv {
    private boolean ligada =  false;
    private int canal = 1;
    private int volume = 25;

    public SmartTv() {
    }

    public SmartTv(boolean ligada, int canal, int volume) {
        this.ligada = ligada;
        this.canal = canal;
        this.volume = volume;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar(){
        setLigada(true);
    };

    public void desligar(){
        setLigada(false);
    };

    public void aumentarVolume(){
        setVolume(++this.volume);
        System.out.println("Aumentando o Volume para: "  + this.getVolume());
    };

    public void diminuirVolume(){
        setVolume(--this.volume);
        System.out.println("Diminuindo o Volume para: "  + this.getVolume());
    };

    public void mudarCanal(int novoCanal){
        setCanal(novoCanal);
    };

    public void aumentarCanal(){
        setCanal(++this.canal);
    };

    public void diminuirCanal(){
        setVolume(--this.volume);
    };


}
