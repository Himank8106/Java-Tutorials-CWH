package JavaCWH;

/**
 * This is a class to demonstrate javadoc
 */

public class Lec107_JavaDocsMethodTags {

    /**
     * 
     * @param args This are the arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     * This method is used to calculate the sum of two numbers
     * @param a This is the first number
     * @param b This is the second number
     * @return This returns the sum of two numbers as an integer
     * @throws Exception This throws an exception if a is zero
     * @deprecated This method shows this text in deprecated box
     */

    public int sum(int a, int b) throws Exception{
        if(a==0){
            throw new Exception("a is zero");
        }
        int c = a+b;
        return c;
    }
}

/*
Below is the list of the javadoc tags:
Tag	               Syntax                               Description                                                     Example
@param	       @param name text	                Documents a method parameter.	                               @param args array of strings supplied on the command line
@return	       @return description	            Documents the return value of a method.	                       @return the string representation of the object
@see	       @see reference	                Provides a link to another related API element.	               @see java.lang.String
@since	       @since release	                Documents the release in which a feature was introduced.	       @since 1.1
@throws	       @throws classname	            Documents an exception thrown by a method.	                   @throws java.io.IOException
@version	   @version info	                Documents the version of a class.	                           @version 1.1
@see	       @see <a href="reference"></a>	Adds a "See Also" heading that refers to the other element of the documentation.
@deprecated	   @deprecated deprecatedtext	    Adds a "Deprecated" heading indicating that this API should no longer be used.
{@code}	       {@code text}	                    Displays text in code font without interpreting the text as HTML markup or nested javadoc tags.
*/

