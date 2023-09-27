public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? " + smartTv.volume);

        smartTv.escolherCanal(13);
        smartTv.aumentarCanal();

        System.out.println("Canal atual? " + smartTv.canal);
    }

}
