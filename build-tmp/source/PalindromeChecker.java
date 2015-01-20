import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class PalindromeChecker extends PApplet {

public void setup()
{
  String lines[] = loadStrings("palindromes.txt");
  println("there are " + lines.length + " lines");
  for (int i=0; i < lines.length; i++) 
  {
    if(palindrome(lines[i])==true)
    {
      println(lines[i] + " IS a palidrome.");
    }
    else
    {
      println(lines[i] + " is NOT a palidrome.");
    }
  }
}

public String noSpaces(String sWord){
  int count = 0;
  String str = new String();
  for(int i = 0; i < sWord.length(); i++)
  {   
     if(sWord.charAt(i) != ' ')
        str = str + sWord.charAt(i);   
  }   
    return str;
}

public String numLetters(String sString){
  String temp = new String();
  for(int nI=0; nI < sString.length(); nI++){
     if(Character.isLetter(sString.charAt(nI)))
        temp = temp + sString.charAt(nI);  
  }
    return temp;
}

public boolean palindrome(String word)
{
  word = word.toLowerCase(); 
  word = noSpaces(word);
  word = numLetters(word);

  for(int i=0; i < word.length(); i++){
    if(word.charAt(i) != word.charAt(word.length()-1-i))
      return false;      
  }
    return true;
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "PalindromeChecker" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
