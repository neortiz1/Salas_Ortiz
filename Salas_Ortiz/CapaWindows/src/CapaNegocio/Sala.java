
package CapaNegocio;

public class Sala {
     private int  numSala;
     private String nombreSala;

    public Sala() {
    }

    public Sala(int numSala, String nombreSala) {
        this.numSala = numSala;
        this.nombreSala = nombreSala;
    }
    

    public int getNumSala() {
        return numSala;
    }

    public void setNumSala(int numSala) {
        this.numSala = numSala;
    }

    public String getNombreSala() {
        return nombreSala;
    }

    public void setNombreSala(String nombreSala) {
        this.nombreSala = nombreSala;
    }
     
     
}
