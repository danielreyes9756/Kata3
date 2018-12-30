/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata33;

/**
 *
 * @author danie
 */
import java.awt.Dimension;
import org.jfree.ui.ApplicationFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;


public class HistogramDisplay extends ApplicationFrame{
    
    public HistogramDisplay() {
        super("HISTOGRAMA");
        setContentPane(createPanel());
        pack();
    }
    public void execute() {
        setVisible(true);
    }
    public JPanel createPanel() {
        ChartPanel chartpanel = new ChartPanel(createChart(createDataset()));
        chartpanel.setPreferredSize(new Dimension(500,400));
        return chartpanel;
    }
    private JFreeChart createChart(DefaultCategoryDataset dataSet) {
        JFreeChart chart = ChartFactory.createBarChart("Histograma JFreeChart", "Dominios"
        +"email", "Nº de emails", dataSet, PlotOrientation.VERTICAL,
        false, false, rootPaneCheckingEnabled);
        return chart;
    }
    
    
    public DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataSet  = new DefaultCategoryDataset();
        dataSet.addValue(5, "", "ulpgc.es");
        dataSet.addValue(10, "", "ull.es");
        dataSet.addValue(13, "", "google.com");
        return dataSet;
    }
}
