package codechallenges.stack;

public class BracketValidator<T>
{
    public boolean bracketValidator(T validate)
    {
        Stack validation = new Stack();
        // split the input into an array of strings
        String[] strings = validate.toString().split("");
        // check every character in new strings array
        for (String a : strings)
        {   // opening bracket of bracket type must come first
            if (a.equals("(") || a.equals("[") || a.equals("{"))
            {   //put in only opening brackets in stack
                validation.push(a);
                System.out.println("\n" + "Put Bracket: " + "\"" + a + "\"" + " in stack");
            }
            // we need to compare existing brackets in string with brackets pushed into stack
            else if(a.equals(")") || a.equals("]") || a.equals("}"))
            {   // can not have just closing brackets
                if(validation.isEmpty())
                {
                    System.out.println("There are no opening brackets, only closing brackets");
                    return false;
                }
                else
                {   // set local variable to value of stack top
                    String b = validation.peek().toString();
                    System.out.println("This bracket is at top of stack: " + b);
                    // compare brackets remaining in string to bracket in stack by type
                    if(a.equals(")") && b.equals("(") || a.equals("]") && b.equals("[") || a.equals("}") && b.equals("{"))
                    {
                        System.out.println( a + " is being compared to " + b);
                        validation.pop();
                    }
                    // not all brackets have a match if we reach else.
                    else
                    {
                        System.out.println("\n" + "Not all brackets were matched" + "\n");
                        return false;
                    }
                }
            }

        }
        // for the case where there are no brackets
        System.out.println("Function Completed");
        return true;
    }
}
