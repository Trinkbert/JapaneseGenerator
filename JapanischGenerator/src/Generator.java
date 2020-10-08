public class Generator {

  public static void main(String[] args) {
    Chooser chooser = new Chooser();
    for (int i = 0; i < 3; i++) {
      System.out.print(chooser.rollConsonant());
    }

  }
}
