/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VO;

/**
 *
 * @author fernando stiven
 */
public class Colmena {
 private String UbicacionEspa;
 private String fabrica;
 private int ColmenaHija;
 private int Colmena;

    public Colmena() {
    }

    public Colmena(String UbicacionEspa, String fabrica, int ColmenaHija, int Colmena) {
        this.UbicacionEspa = UbicacionEspa;
        this.fabrica = fabrica;
        this.ColmenaHija = ColmenaHija;
        this.Colmena = Colmena;
    }

    public String getUbicacionEspa() {
        return UbicacionEspa;
    }

    public void setUbicacionEspa(String UbicacionEspa) {
        this.UbicacionEspa = UbicacionEspa;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    public int getColmenaHija() {
        return ColmenaHija;
    }

    public void setColmenaHija(int ColmenaHija) {
        this.ColmenaHija = ColmenaHija;
    }

    public int getColmena() {
        return Colmena;
    }

    public void setColmena(int Colmena) {
        this.Colmena = Colmena;
    }
    
}
