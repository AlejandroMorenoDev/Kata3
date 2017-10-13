/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata3;

import org.jfree.ui.ApplicationFrame;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author amct2
 */
public class HistogramDisplay extends ApplicationFrame {

    public HistogramDisplay() {
        super("Histograma");
        setContentPane(createPanel());
        
    }
    
    public void execute(){
        setVisible(true);
    }
    
    
    
    private JPanel createPanel(){
        ChartPanel chartPanel = new ChartPanel(createChart(createDataset()));
        chartPanel.setPreferredSize(new Dimension(500,40));
        return chartPanel;
    }
    
    private DefaultCategoryDataset createDataset(){
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        dataSet.addValue(15, "", ".ulpgc.es");
        dataSet.addValue(5, "", ".google.com");
        dataSet.addValue(10, "", ".ull.es");
        dataSet.addValue(2, "", ".hotmail.com");
        
        return dataSet;
    }

    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart(
                "Histograma", 
                "Dominios", 
                "Nº de emails", 
                dataSet, 
                PlotOrientation.VERTICAL, 
                true, 
                rootPaneCheckingEnabled, 
                rootPaneCheckingEnabled);
        return chart;
    }
    
}
