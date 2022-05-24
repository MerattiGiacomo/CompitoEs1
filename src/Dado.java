public class Dado {
    private int faccie;

    public Dado() {
    }

    public Dado(int faccie) {
        this.faccie = faccie;
    }

    public int getFaccie() {
        return this.faccie;
    }

    public void setFaccie(int faccie) {
        this.faccie = faccie;
    }

    public Dado faccie(int faccie) {
        setFaccie(faccie);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " faccie='" + getFaccie() + "'" +
            "}";
    }

    public synchronized int lancio(){
        int l1 = 1 + (int)(Math.random()*this.faccie);
        return l1;
    }

}
