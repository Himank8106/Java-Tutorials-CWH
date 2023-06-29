package JavaCWH;

/**
 * This class is to demonstrate javadoc 
 * This is <i>italic</i> word <p>this is a new paragraph</p>
 * @author Himank
 * @version 0.1
 * @since 2023
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */

public class Lec106_JavaDocsTags {

    public void sum(int a, int b){
        System.out.println("Sum of a and b is: "+a+b);
    }

    public static void main(String[] args) {
        System.out.println("I am main method");
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
