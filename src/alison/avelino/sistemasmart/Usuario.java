package alison.avelino.sistemasmart;

public class Usuario {

    public static void main(String[] args) {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.isLigada());
        System.out.println("Canal Atual: " + smartTv.getCanal());
        System.out.println("Volume Atual: " + smartTv.getVolume());

        smartTv.ligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.isLigada());

        smartTv.desligar();
        System.out.println("Novo Status -> TV Ligada ? " + smartTv.isLigada());

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Volume Atual: " + smartTv.getVolume());

        smartTv.mudarCanal(32);
        System.out.println("Canal Inserido Manualmente: " + smartTv.getCanal());

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.getCanal());

        smartTv.aumentarCanal();
        System.out.println("Canal Atual: " + smartTv.getCanal());

        smartTv.diminuirCanal();
        System.out.println("Canal Atual: " + smartTv.getCanal());





    }
}
