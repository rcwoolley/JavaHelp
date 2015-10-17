public class HelpingEthan {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        
        Algorithm myAlgorithm = new Algorithm("RobAlgorithm");
        
        System.out.println(myAlgorithm.getAlgName());
        
        Algorithm[] theArray = new Algorithm[10];
        theArray[1] = new Scalar("RobScalar");
        
        System.out.println(theArray[1].getAlgName());
    }
}
