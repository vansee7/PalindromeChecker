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