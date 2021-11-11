package codechallenges.stack;
import org.junit.jupiter.api.Test;

public class BracketValidatorTest
{
    @Test void bracketValidatorTest1()
    {
        BracketValidator testValidation = new BracketValidator();
        // function completed as expected
        testValidation.bracketValidator("()[]{}");
        // function completed as expected
        testValidation.bracketValidator("{}{Code}[Fellows](())");
        // function does not complete, shows "not all brackets were matched" as expected.
        testValidation.bracketValidator("[({}]");
    }
}
