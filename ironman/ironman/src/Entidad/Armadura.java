/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

//@author Facundo Cruz
public class Armadura {

    private int resistencia;
    private String colorP;
    private int salud = 100;
    private int bateria = 5000;
    private int guantes = 5000;
    private int respulsorIzq;
    private boolean guanteIzq = true;
    private int respulsorDer;
    private boolean guanteDer = true;
    private int botas = 5000;
    private int propulsorIzq;
    private boolean BotaIzq = true;
    private int propulsorDer;
    private boolean BotaDer = true;
    private int consola = 5;
    private int sintetizador = 5;
    private boolean cascoOperativo = true;

    public Armadura() {
    }

    public int getResistencia() {
        return resistencia;
    }

    public boolean isGuanteIzq() {
        return guanteIzq;
    }

    public void setGuanteIzq(boolean guanteIzq) {
        this.guanteIzq = guanteIzq;
    }

    public boolean isGuanteDer() {
        return guanteDer;
    }

    public void setGuanteDer(boolean guanteDer) {
        this.guanteDer = guanteDer;
    }

    public boolean isBotaIzq() {
        return BotaIzq;
    }

    public void setBotaIzq(boolean BotaIzq) {
        this.BotaIzq = BotaIzq;
    }

    public boolean isBotaDer() {
        return BotaDer;
    }

    public void setBotaDer(boolean BotaDer) {
        this.BotaDer = BotaDer;
    }

    public boolean isCascoOperativo() {
        return cascoOperativo;
    }

    public void setCascoOperativo(boolean cascoOperativo) {
        this.cascoOperativo = cascoOperativo;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public String getColorP() {
        return colorP;
    }

    public void setColorP(String colorP) {
        this.colorP = colorP;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public int getGuantes() {
        return guantes;
    }

    public void setGuantes(int guantes) {
        this.guantes = guantes;
    }

    public int getRespulsorIzq() {
        return respulsorIzq;
    }

    public void setRespulsorIzq(int respulsorIzq) {
        this.respulsorIzq = respulsorIzq;
    }

    public int getRespulsorDer() {
        return respulsorDer;
    }

    public void setRespulsorDer(int respulsorDer) {
        this.respulsorDer = respulsorDer;
    }

    public int getBotas() {
        return botas;
    }

    public void setBotas(int botas) {
        this.botas = botas;
    }

    public int getPropulsorIzq() {
        return propulsorIzq;
    }

    public void setPropulsorIzq(int propulsorIzq) {
        this.propulsorIzq = propulsorIzq;
    }

    public int getPropulsorDer() {
        return propulsorDer;
    }

    public void setPropulsorDer(int propulsorDer) {
        this.propulsorDer = propulsorDer;
    }

    public int getConsola() {
        return consola;
    }

    public void setConsola(int consola) {
        this.consola = consola;
    }

    public int getSintetizador() {
        return sintetizador;
    }

    public void setSintetizador(int sintetizador) {
        this.sintetizador = sintetizador;
    }

}
