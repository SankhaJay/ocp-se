/**
 * NOTE: Package statement must be the first line of code in a source file, excluding comments and white space.
 * There will be a compiler error on the package statement line and not the lines of code above it.
 */

package org.learn.fqcn;


/**
 * NOTE: cannot have both line 6/7 at the same time -> compile error
 */

//import org.learn.fqcn.garden.VineVegetable;
//import org.learn.fqcn.nursery.VineVegetable;

/**
 * NOTE: can have both
 */
import org.learn.fqcn.garden.*;
import org.learn.fqcn.nursery.*;


/**
 * NOTE: will only import classes in garden package level
 */

import org.learn.fqcn.garden.*;

/**
 NOTE: classes in java.lang can be accessed without FQCN
 */


/**
 * NOTES:
 * To import static variable and methods use import static key word (from java 7 onwards)
 * Have both types single type import and on demand imports
 */


//import static java.lang.Math.*;

import static java.lang.Math.sqrt;
import static java.lang.Math.PI;


public class Run {
    public static void main(String[] args) {

        // always single type imports have the priority
        VineVegetable vineVegetable = new VineVegetable();
        vineVegetable.main(args);

        System.out.println(PI);
        System.out.println(sqrt(PI));

    }
}

/**
 * NOTES:
 * will give and error if there is a single type import with the same class name
 * priority over on demand imports. This local VineVegetable will be picked over star imports
 */

class VineVegetable {
    public static void main(String[] args) {
        System.out.println("I am a local VineVegetable");
    }
}
