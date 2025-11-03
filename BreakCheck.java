import java.util.*;

// TODO: Your Code Here

// Numa Fecher
// 08/07/2024
// CSE 122
// This class is a break check, which checks and returns an error with error code 2
// if there is a use of the break statement outside of a single line comment (comments
// that start with //). This check is case-sensitive, only flagging for occurances of break
// in all-lowercase (so occurances of "Break" or "BReaK" outside of a single line comment
// will not be flagged).
// 
// This check will falsely flag the appearance of the word break outside of single line
// comments, regardless if it is used as a statement. For example, it will falsely flag
// System.out.println("break");.
// 
// Implements the Check interface.

public class BreakCheck implements Check {

    // B: Checks for a break statement in the given line, giving an error if it is present
    //    to tell the user that they are not permitted to use a break statement.
    // E:
    // R: Optional<Error> - An error with error code 2 and the line number for the line
    //                      being tested and a custom message to let the user know
    //                      what caused the error.
    // P: String line - line from the code file to be checked for a break statement.
    //    int lineNumber - line number of the line being checked in the code file.
    public Optional<Error> lint(String line, int lineNumber) {
        if (line.contains("break")) {
            int index = line.indexOf("break");
            
            if (!line.substring(0, index).contains("//")) {
                if (index + 4 == line.length() - 1) {
                    return Optional.of(new Error(2, lineNumber,
                                             "break cannot be used outside of single line comments"));
                } else if (!Character.isLetter(line.charAt(index + 5))) {
                    return Optional.of(new Error(2, lineNumber,
                                             "break cannot be used outside of single line comments"));
                }
            }
        }
        return Optional.empty();
    }
}
