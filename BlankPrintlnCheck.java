import java.util.*;

// TODO: Your Code Here

// Numa Fecher
// 08/07/2024
// CSE 122
// This class is a blank print check, which checks and returns an error with error code 3
// if there is an blank print line in the given line to be checked. A blank print line
// contains the pattern: System.out.println("");
// 
// Implements the Check interface.

public class BlankPrintlnCheck implements Check {

    // B: Checks for blank print line in the given line, giving an error if it is present
    //    to tell the user that they did not use the correct code format to print a blank line.
    // E:
    // R: Optional<Error> - An error with error code 3 and the line number for the line
    //                      being tested and a custom message to let the user know
    //                      what caused the error.
    // P: String line - line from the code file to be checked for a blank print line.
    //    int lineNumber - line number of the line being checked in the code file.
    public Optional<Error> lint(String line, int lineNumber) {
        if (line.contains("System.out.println(\"\")")) {
            return Optional.of(new Error(3, lineNumber,
                                         "For blank new line prints, please use "
                                         + "System.out.println() instead of "
                                         + "System.out.println(\"\")"));
        } else {
            return Optional.empty();
        }
    }
}
