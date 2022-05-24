public class Giocatore extends Thread{
    private String nome;
    private Dado dado;
    private int punteggio;

    public Giocatore() {
    }

    public Giocatore(String nome, Dado dado) {
        this.nome = nome;
        this.dado = dado;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dado getDadi() {
        return this.dado;
    }

    public void setDadi(Dado dado) {
        this.dado = dado;
    }

    public Giocatore nome(String nome) {
        setNome(nome);
        return this;
    }

    public Giocatore dadi(Dado dado) {
        setDadi(dado);
        return this;
    }

    public void setPunteggio(int punteggio){
        this.punteggio = punteggio;
    }

    public int getPunteggio(){
        return punteggio;
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", dadi='" + getDadi() + "'" +
            "}";
    }

    public void run(){
    
        System.out.println(this.nome + " e' entrato in partita");
        try {
            sleep(1000);
        } catch (InterruptedException e) {
        }
        int l1 = dado.lancio();
        int l2 = dado.lancio();
        int l3 = 0;
        if(l1 == l2){
            System.out.println(this.nome + " ha ottenuto 2 volte " + l1 + ": Lancio BONUS");
            l3 = dado.lancio();
            System.out.println(this.nome + " ha ottenuto " + l1 + ", " + l2 + " e " + l3);
        }
        else{
            System.out.println(this.nome + " ha ottenuto " + l1 + " e " + l2);
        }
        setPunteggio(l1 + l2 + l3);
    }
}
