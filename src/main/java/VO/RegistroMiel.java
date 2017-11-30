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
public class RegistroMiel {
   private   String fecha; 
private String recolector;
private int idColmena ;
private int KilosMiel ;
private int Total ;

    public RegistroMiel(String fecha, String recolector, int idColmena, int KilosMiel) {
        this.fecha = fecha;
        this.recolector = recolector;
        this.idColmena = idColmena;
        this.KilosMiel = KilosMiel;
    }

    public RegistroMiel() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getRecolector() {
        return recolector;
    }

    public void setRecolector(String recolector) {
        this.recolector = recolector;
    }

    public int getIdColmena() {
        return idColmena;
    }

    public void setIdColmena(int idColmena) {
        this.idColmena = idColmena;
    }

    public int getKilosMiel() {
        return KilosMiel;
    }

    public void setKilosMiel(int KilosMiel) {
        this.KilosMiel = KilosMiel;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }





}
