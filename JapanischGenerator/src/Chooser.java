public class Chooser {

  private String[] vowelArray = {"a", "i", "u", "o", "ya", "yu", "yo", "wa", "wo"};
  private String[] consonantArray = {"", "k", "g", "s", "z", "t", "n", "h", "b", "p", "m", "r", "y", "d", "w"};
  private int randomConsonantNumber;
  private int randomVowelNumber;
  private String syllable;

  public String rollConsonant() {
    syllable = "";
    randomConsonantNumber = (int) (Math.random() * consonantArray.length);
    syllable = syllable + consonantArray[randomConsonantNumber];
    if (randomConsonantNumber == 0) {
      randomVowelNumber = (int) (Math.random() * (vowelArray.length - 1));
    } else if (randomConsonantNumber >= consonantArray.length + 1 && randomConsonantNumber <= consonantArray.length - 3) {
      randomVowelNumber = (int) (Math.random() * (vowelArray.length - 3));
    } else {
      randomVowelNumber = (int) (Math.random() * (vowelArray.length - 5));
    }
    syllable = syllable + vowelArray[randomVowelNumber];
    return syllable;
  }

}
