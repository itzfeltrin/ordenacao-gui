/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author itzfeltrin
 */
public class Sorting {
    public ArrayList<Integer> listaVal = new ArrayList<>();     
    
    public void Sorting() {}
    
    public void loadValues(int metodo, int tam) throws FileNotFoundException, IOException {
        this.listaVal.clear();
        File file;
        switch(metodo) {
            case 1:
                file = new File("files/decrescente.txt");
                break;
            case 2:
                file = new File("files/aleatorio.txt");
                break;
            default:
                file = new File("files/crescente.txt");
        }
        
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st;
        int i = 0;
        while((st = br.readLine()) != null) {
            this.listaVal.add(Integer.parseInt(st));
            if(++i == tam) break;
        }
        
    }
    
    public Info sort(int metodo, int ordem, int tam) throws IOException {        
        loadValues(ordem, tam);
        switch(metodo) {
            case 0: 
                return selectionSort();                
            case 1:
                return insertionSort();                
            case 2:
                return bubbleSort();
            case 3:
                return shellSort();
            case 4:
                return quickSort(0, this.listaVal.size() - 1);
        }
        return null;
    }
    
    public Info selectionSort() { 
        Info auxInfo = new Info("Selection Sort");        
        int tam = this.listaVal.size();
        long tempoInicio = System.currentTimeMillis();            
        for(int i = 0; i < tam - 1; i++) {             
            int minIndex = i; 
            for(int j = i + 1; j < tam; j++) {
                auxInfo.nrComp++;
                if(this.listaVal.get(j) < this.listaVal.get(minIndex)) minIndex = j; 
            }            
            int temp = this.listaVal.get(minIndex); 
            this.listaVal.set(minIndex, this.listaVal.get(i));
            this.listaVal.set(i, temp);
            if(minIndex != i) auxInfo.nrMov++;
        }
        Double tempo = (double) (System.currentTimeMillis() - tempoInicio);
        auxInfo.tempo = tempo;
        return auxInfo;
    } 
    
    public Info insertionSort() {         
        Info auxInfo = new Info("Insertion Sort");
        int tam = this.listaVal.size();
        long tempoInicio = System.currentTimeMillis();
        for(int i = 1; i < tam; ++i) { 
            int key = this.listaVal.get(i); 
            int j = i - 1; 
            auxInfo.nrComp++;
            while(j >= 0 && this.listaVal.get(j) > key) { 
                this.listaVal.set(j + 1, this.listaVal.get(j));                
                j = j - 1;
                auxInfo.nrMov++;
                auxInfo.nrComp++;
            } 
            this.listaVal.set(j + 1, key); 
        } 
        Double tempo = (double) (System.currentTimeMillis() - tempoInicio);
        auxInfo.tempo = tempo;
        return auxInfo;
    }
    
    public Info bubbleSort() { 
        Info auxInfo = new Info("Bubble Sort");
        int tam = this.listaVal.size();        
        long tempoInicio = System.currentTimeMillis();
        for(int i = 0; i < tam - 1; i++) {
            for(int j = 0; j < tam - i - 1; j++) {                
                if(this.listaVal.get(j) > this.listaVal.get(j + 1)) { 
                    int temp = this.listaVal.get(j);
                    this.listaVal.set(j, this.listaVal.get(j + 1));
                    this.listaVal.set(j + 1, temp);
                    auxInfo.nrMov++;
                } 
                auxInfo.nrComp++;
            }        
        }
        Double tempo = (double) (System.currentTimeMillis() - tempoInicio);
        auxInfo.tempo = tempo;
        return auxInfo;
    }
    
    public Info shellSort() { 
        Info auxInfo = new Info("Shell Sort");
        int tam = this.listaVal.size();        
        long tempoInicio = System.currentTimeMillis();
        for(int gap = tam / 2; gap > 0; gap /= 2) { 
            for(int i = gap; i < tam; i += 1)  { 
                int temp = this.listaVal.get(i);
                int j; 
                for(j = i; j >= gap && this.listaVal.get(j - gap) > temp; j -= gap) {                    
                    this.listaVal.set(j, this.listaVal.get(j - gap));
                    auxInfo.nrMov++;
                    auxInfo.nrComp++;
                }
                this.listaVal.set(j, temp);
                auxInfo.nrComp++;
            } 
        }         
        Double tempo = (double) (System.currentTimeMillis() - tempoInicio);
        auxInfo.tempo = tempo;
        return auxInfo;
    }
    
    private Info quickSort(int lowerIndex, int higherIndex) {
        Info auxInfo = new Info("Quick Sort");
        int tam = this.listaVal.size();
        long tempoInicio = System.currentTimeMillis();
        int i = lowerIndex;
        int j = higherIndex;
        int pivot = this.listaVal.get(lowerIndex + (higherIndex - lowerIndex) / 2);
        while (i <= j) {
            while (this.listaVal.get(i) < pivot) {
                i++;
                auxInfo.nrComp++;
            }
            while (this.listaVal.get(j) > pivot) {
                auxInfo.nrComp++;
                j--;
            }
            if (i <= j) {
                int temp = this.listaVal.get(i);
                this.listaVal.set(i, this.listaVal.get(j));
                this.listaVal.set(j, temp);
                i++;
                j--;
                auxInfo.nrMov++;
            }
        }
        Double tempo = (double) (System.currentTimeMillis() - tempoInicio);
        auxInfo.tempo = tempo;
        if (lowerIndex < j) {
            Info auxiliar = quickSort(lowerIndex, j);
            auxInfo.sumValues(auxiliar);
        }
        if (i < higherIndex) {
            Info auxiliar = quickSort(i, higherIndex);
            auxInfo.sumValues(auxiliar);
        }
        return auxInfo;
    }
    
    public void printValues() { 
        int tam = this.listaVal.size();
        for(int i = 0; i < tam; i++) {
            System.out.println(this.listaVal.get(i)); 
        }
        System.out.println(); 
    } 
}
