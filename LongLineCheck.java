import java.util.*;

// TODO: Your Code Here

// Numa Fecher
// 08/07/2024
// CSE 122
// This class is a long line check, which checks and returns an error with error code 1
// if the line being checked is 100 characters long or more.
// 
// Implements the Check interface.

public class LongLineCheck implements Check {

    // B: Checks the length of the line, giving an error if it is 100 characters or longer
    //    to tell the user that each line should be less than 100 characters long.
    // E:
    // R: Optional<Error> - An error with error code 1 and the line number for the line
    //                      being tested and a custom message to let the user know
    //                      what caused the error.
    // P: String line - line from the code file to be checked for length of 100 characters
    //                  or greater.
    //    int lineNumber - line number of the line being checked in the code file.
    public Optional<Error> lint(String line, int lineNumber) {
        if (line.length() >= 100) {
            return Optional.of(new Error(1, lineNumber,
                                         "Lines should each be less than 100 characters long."));
        } else {
            return Optional.empty();
        }
    }
}
