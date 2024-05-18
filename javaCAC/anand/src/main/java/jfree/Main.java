package jfree;


import weka.core.Instances;
import weka.core.converters.CSVLoader;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            // Load data from CSV file
            CSVLoader loader = new CSVLoader();
            loader.setSource(new File("data.csv"));
            Instances data = loader.getDataSet();

            // Output loaded data
            System.out.println("Loaded data:");
            System.out.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}