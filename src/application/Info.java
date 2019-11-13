/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

/**
 *
 * @author itzfeltrin
 */
public class Info {
    public String nome;
    public Double tempo;
    public int nrComp;
    public int nrMov;
    
    public Info(String nome) {
        this.nome = nome;
        this.nrComp = 0;
        this.nrMov = 0;
    }
    
    public void sumValues(Info aux) {
        this.nrComp += aux.nrComp;
        this.nrMov += aux.nrMov;
        this.tempo += aux.tempo;
    }
    
    public void printValues() {
        System.out.println("Nome: " + this.nome + "\nTempo de execução: " + this.tempo / 1000 + " segundo(s)"
                         + "\nNúmero de movimentações: " + this.nrMov + "\nNúmero de comparações: " + this.nrComp);        
    }
}
