package comp5111.assignment;

import java.io.IOException;
import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        /* check the arguments */
        if (args.length < 1) {
            System.err.println("Usage: java comp5111.assignment.Assignment1 test-suite [soot options] " + "classname");
            System.exit(0);
        }

        // these args will be passed into soot.
        String[] classNames = Arrays.copyOfRange(args, 0, args.length);

        // TODO: invoke your line coverage instrument function

        // TODO: run tests on instrumented classes to generate coverage report

    }
}