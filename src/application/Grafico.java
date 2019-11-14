/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.util.ArrayList;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author itzfeltrin
 */
public class Grafico {
    public CategoryDataset createDataSetTempo(ArrayList<Info> listaInfos) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(Info info : listaInfos) {
            dataSet.addValue(info.tempo / 1000, info.nome, "");            
        }
        
        return dataSet;
    }
    public CategoryDataset createDataSetMov(ArrayList<Info> listaInfos) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(Info info : listaInfos) {
            dataSet.addValue(info.nrMov, info.nome, "");            
        }
        
        return dataSet;
    }
    public CategoryDataset createDataSetComp(ArrayList<Info> listaInfos) {
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for(Info info : listaInfos) {
            dataSet.addValue(info.nrComp, info.nome, "");            
        }
        
        return dataSet;
    }
    
    public JFreeChart createBarChart(String linha, CategoryDataset dataSet) {
        JFreeChart graficoBarras = ChartFactory.createBarChart(
                linha,
                "Método",
                "",
                dataSet,
                PlotOrientation.VERTICAL,
                true,
                false,
                false);
        
        return graficoBarras;
    }
    
    public ArrayList<ChartPanel> criarGrafico(ArrayList<Info> listaInfos) {
        CategoryDataset dataSetTempo = this.createDataSetTempo(listaInfos);
        CategoryDataset dataSetMov = this.createDataSetMov(listaInfos);
        CategoryDataset dataSetComp= this.createDataSetComp(listaInfos);
        JFreeChart graficoTempo = this.createBarChart("Tempo", dataSetTempo);
        JFreeChart graficoMov = this.createBarChart("Movimentações", dataSetMov);
        JFreeChart graficoComp = this.createBarChart("Comparações", dataSetComp);
        ChartPanel painelDoGraficoTempo = new ChartPanel(graficoTempo);
        ChartPanel painelDoGraficoMov = new ChartPanel(graficoMov);
        ChartPanel painelDoGraficoComp = new ChartPanel(graficoComp);
        ArrayList<ChartPanel> paineis = new ArrayList<>();
        paineis.add(painelDoGraficoTempo);
        paineis.add(painelDoGraficoMov);
        paineis.add(painelDoGraficoComp);
        return paineis;
    }
}
