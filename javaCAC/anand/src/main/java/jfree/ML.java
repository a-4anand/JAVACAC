package jfree;
import weka.classifiers.Evaluation;
import weka.classifiers.trees.RandomForest;
import weka.core.Instances;
import weka.core.converters.ConverterUtils.DataSource;

public class ML {
    public static void main(String[] args) {
        try {
            // Load data from CSV file
            DataSource source = new DataSource("data.csv");
            Instances data = source.getDataSet();
            data.setClassIndex(data.numAttributes() - 1); // Set the class attribute

            // Initialize and build the Random Forest regression model
            RandomForest regressor = new RandomForest();
            regressor.buildClassifier(data);

            // Evaluate the model
            Evaluation eval = new Evaluation(data);
            eval.evaluateModel(regressor, data);

            // Output evaluation results
            System.out.println("Mean Absolute Error: " + eval.meanAbsoluteError());
            System.out.println("Root Mean Squared Error: " + eval.rootMeanSquaredError());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
