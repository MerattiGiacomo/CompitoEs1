public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Partita iniziata!");
        Dado d = new Dado(6);
        Giocatore g1 = new Giocatore("gino", d);
        Giocatore g2 = new Giocatore("Antonio", d);

        g1.setPriority(10);
        g1.start();
        g2.start();

        g1.join();
        g2.join();
        if(g1.getPunteggio() > g2.getPunteggio()){
            System.out.println("Gino ha vinto");
        }
        else if(g1.getPunteggio() < g2.getPunteggio()){
            System.out.println("Antonio ha vinto");
        }
        else{
            System.out.println("Pareggio");
        }
        System.out.println("Partita terminata");
    }
}
