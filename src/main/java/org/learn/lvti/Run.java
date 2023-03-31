package org.learn.lvti;

public class Run {

    // cannot use var with class variables

    // static var classVariable = 20; // compile error
    // var instanceVariable = 45; // compile error

    public static void main(String[] args) {
        AVeryLongClassNameForReference aVeryLongClassNameForReference = new AVeryLongClassNameForReference();
        aVeryLongClassNameForReference.setName("Sankha");
        System.out.println(aVeryLongClassNameForReference.getName());

        // can use local variable type inference (aka var declaration) with java 10 onwards to omit long class names
        // only applicable to local variables inside a method body

        var aVeryLongClassNameForReference2 = new AVeryLongClassNameForReference();
        aVeryLongClassNameForReference2.setName("Jayalath");
        System.out.println(aVeryLongClassNameForReference2.getName());

        // var is not a TYPE or a KEYWORD
        // local variable of methods can use VAR on the right hand side and the equation must be inferable by compiler

        /**
         * valid scenarios
         */

        var i = 1;
        var aVarArray = new int[3];

        // but array initializations not works with VAR
        // var varArrayInit = {"A", "B"}; // compile error

        // ok to assign a null object but not null itself (because null cannot be inferred by the compiler)
        Object nullObj = null;
        var nullVar = nullObj;

        // var nullVar2 = null; // compile error

        var var = "hello"; // var is not a keyword

        /**
         * in valid scenarios
         */

        // cannot use with compound declarations
        // var j = 0, k = 0;

        // has to be initialised
        // var m;

        // cannot have array of var
        // var[] newArray = new int[2];
    }

    // INVALID - cannot have a method return var or use var as argument types

//    public static var returnError(var arg) {
//        return arg;
//    }

}
