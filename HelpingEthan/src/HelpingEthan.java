import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class HelpingEthan {
    public static void main(String[] args) {
        System.out.println("Hello, World");
        
        Scalar myScalar = new Scalar("myScalar");
        System.out.println("Scalar object's AlgName is: "+myScalar.getAlgName());
        
        Class[] theArray = new Class[10];
        theArray[1] = Scalar.class;

        try {
        	Method myMethod = theArray[1].getMethod("getAlgName");
            Object myAlgName = myMethod.invoke(myScalar, null);
            System.out.println("Scalar object's AlgName is: "+myAlgName);

        } catch (NoSuchMethodException e) {
        	System.out.println("No such method exists");
        } catch (InvocationTargetException e) {
        	System.out.println("Invocation target exception");
        } catch (IllegalAccessException e) {
        	System.out.println("Illegal access");
        }
    }
}
