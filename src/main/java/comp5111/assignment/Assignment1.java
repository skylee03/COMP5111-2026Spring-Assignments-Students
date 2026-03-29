package comp5111.assignment;

import comp5111.assignment.instrument.coverage.*;
import comp5111.assignment.instrument.runtime.Profiler;
import comp5111.assignment.tools.JUnit;

import java.io.IOException;
import java.util.Arrays;

public class Assignment1 {
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        /* check the arguments */
        if (args.length < 1) {
            System.err.println("Usage: java comp5111.assignment.Assignment1 test-suite [soot options] " + "classname");
            System.exit(0);
        }

        String testSuite = args[0];

        // these args will be passed into soot.
        String[] classNames = Arrays.copyOfRange(args, 1, args.length);

        SootDriver.instrument(LineTestRequirement.class, LineInstrumenter.class, classNames);
        Class<?> testClass = Class.forName(testSuite);
        Profiler.v().reset();
        System.out.println("Running test suite " + testSuite);
        System.out.println("Measuring Line coverage");
        JUnit.run(testClass);
        Profiler.v().generateReport("src/test/report", testSuite, "Line");
    }
}
