package OCATEST;

public class Q231 {

}
//Question 231
//
//Which of the following statements concerning the switch construct are true?
//
//Please select 3 options.
//
//A character literal can be used as a value for a case label.
//
//A 'long' cannot be used as a switch variable.
//
//An empty switch block is a valid construct.
//
//A switch block must have a default label.
//
//If present, the default label must be the last of all the labels.
//
//Here are the rules for a switch statement:
//1. Only String, byte, char, short, int, (and their wrapper classes Byte, Character, Short, and Integer), and enums can be used as types of a switch variable. (String is allowed only since Java 7). 
//2. The case constants must be assignable to the switch variable. For example, if your switch variable is of class String, your case labels must use Strings as well.
//3. The switch variable must be big enough to hold all the case constants. For example, if the switch variable is of type char, then none of the case constants can be greater than 65535 because a char's range is from 0 to 65535.
//4.  All case labels should be COMPILE TIME CONSTANTS. 
//5. No two of the case constant expressions associated with a switch statement may have the same value.
//6. At most one default label may be associated with the same switch statement.