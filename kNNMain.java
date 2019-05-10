import java.util.List;
import java.io.FileNotFoundException;
import java.util.Arrays;



public class kNNMain{

  public static void main(String... args) throws FileNotFoundException

  {

    // TASK 1: Use command line arguments to point DataSet.readDataSet method to
    // the desired file. Choose a given DataPoint, and print its features and label

    String PATH_TO_DATA= args[0];
    System.out.println (PATH_TO_DATA);


    List<DataPoint> ans = DataSet.readDataSet(PATH_TO_DATA);
    DataPoint flower = ans.get(3);
    System.out.println(flower.getLabel());

    String printableX = Arrays.toString (flower.getX());
    System.out.println (printableX);


    //TASK 2:Use the DataSet class to split the fullDataSet into Training and Held Out Test Dataset
     List<DataPoint> testSet = DataSet.getTestSet(ans, 0.3);
     List<DataPoint> trainingSet = DataSet.getTrainingSet(ans, 0.7);

    // TASK 3: Use the DataSet class methods to plot the 2D data (binary and multi-class)


    // TASK 4: write a new method in DataSet.java which takes as arguments two DataPoint objects,
    // and returns the Euclidean distance between those two points (as a double)



    // TASK 5: Use the KNNClassifier class to determine the k nearest neighbors to a given DataPoint,
    // and make a print a predicted target label

    KNNClassifier determinenearest = new KNNClassifier(5);
    String predict = determinenearest.predict(flower, 3);
    System.out.println(predict);





    // TASK 6: loop over the datapoints in the held out test set, and make predictions for Each
    // point based on nearest neighbors in training set. Calculate accuracy of model.


  }

}
