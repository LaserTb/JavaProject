package OCATEST;

public class Q222 {

}
//Question 222
//
//Which of these are valid expressions to create a string of value "hello world" ?
//
//Please select 3 options.
//
//" hello world".trim()             ja
//
//("hello" + new String("world"))
//
//"hello".concat(" world")            ja
//
//new StringBuilder("world").insert(0, "hello ").toString();           ja
//
//new StringBuilder("world").append(0, "hello ").toString();
//
//new StringBuilder("world").append("hello ", 0 , 6).toString();
//
//new StringBuilder("world").add(0, "hello ").toString();
//
//All the expressions are legal. String literals are String objects and can be used just like any other object.