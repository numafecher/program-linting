import java.util.*;
import java.io.*;

public class Linter {
    // TODO: Your code here
    private List<Check> checks;

    // B: Constructs a linter
    // E:
    // R:
    // P: List<Check> checks - list of checks that the linter should be implementing/checking for
    public Linter(List<Check> checks) {
        this.checks = checks;
    }


    // B: Lints through a file of code, checking for given possible errors.
    // E: throws FileNotFoundException when file does not exist
    // R: List<Error> - list of errors that were raised when checking through the file
    //                  against the given checks.
    // P: String fileName - name of the file cotaining the code to be checked for linting errors.
    //                      Should be formatted to include the file type (e.g. .java)
    public List<Error> lint(String fileName) throws FileNotFoundException {
        Scanner fileScan = new Scanner(new File(fileName));
        int lineNumber = 0;
        List<Error> errors = new ArrayList<>();

        while (fileScan.hasNextLine()) {
            lineNumber++;
            String line = fileScan.nextLine();
            for (Check check : checks) {
                Optional<Error> error = check.lint(line, lineNumber);
                if (error.isPresent()) {
                    Error e = error.get();
                    errors.add(e);
                }
            }
        }
        return errors;
    }
}
