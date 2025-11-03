// TODO: Your Code Here

// Numa Fecher
// 08/07/2024
// CSE 122
// This class represents an error that is raised from linting a line of a code file.
// It contains the error code that represents what type of error it is, the line number
// that raised this error, and a custom message to explain to the user what raised
// the specific error.

public class Error {
    private int code;
    private int lineNumber;
    private String message;

    // B: Constructs a new Error
    // E:
    // R:
    // P: int code - error code to indicate which corresponds to a type of Error
    //               (1-long line, 2-contains a break statement, 3-blank print line)
    //    int lineNumber - line number of the line in the file that raised the Error
    //    String message - custom message to explain to the user what raised the Error
    public Error(int code, int lineNumber, String message) {
        this.code = code;
        this.lineNumber = lineNumber;
        this.message = message;
    }

    // B: Represents the Error as a string, containing the line number, error code, and the
    //    custom message to tell the user what raised the Error.
    // E:
    // R: String - string reprsentation of the Error
    // P:
    public String toString() {
        return "(Line: " + lineNumber + ") has error code " + code + "\n" + message;
    }

    // B: Gets the line number that raised the Error
    // E:
    // R: int - line number of the line in the code file that raised the Error
    // P:
    public int getLineNumber() {
        return lineNumber;
    }

    // B: Gets the error code of the Error
    // E:
    // R: int - error code of the Error telling the user which type of error was raised
    // P:
    public int getCode() {
        return code;
    }

    // B: Gets the custom message of the Error
    // E:
    // R: String - custom message that tells the user what in the line raised the error
    // P:
    public String getMessage() {
        return message;
    }
}
