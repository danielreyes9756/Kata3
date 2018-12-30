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
public class Kata33 {

    public static void main(String[] args) {
        
        Histogram<String> histogram= new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("hotmail.es");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("ulpgc.es");
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAMA", histogram);
        histo.execute();
    }
}
