package Modelo;

public class Jugador {

    private String name;
    private int cc;
    private Remdimiento rem[];
    private float renprom=0;
    //constructor

    public Jugador() {
    }
    
    public float getRenprom() {
        return renprom;
    }

    public void setRenprom(float renprom) {
        this.renprom = renprom;
    }

    public Jugador(String name, int cc, Remdimiento[] rem) {
        this.name = name;
        this.cc = cc;
        this.rem = rem;
        this. renprom=renprom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public Remdimiento[] getRem() {
        return rem;
    }

    public void setRem(Remdimiento[] rem) {
        this.rem = rem;
    }

}
