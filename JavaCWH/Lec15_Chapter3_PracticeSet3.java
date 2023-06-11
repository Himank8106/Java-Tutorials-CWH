package JavaCWH;

public class Lec15_Chapter3_PracticeSet3 {
    public static void main(String[] args) {
        //Problem 1 - Convert all letters to lowercase
        String name = "Himank Joshi";
        name = name.toLowerCase();
        System.out.println(name);

        //Problem 2 - Replace spaces with underscores
        String text = "Hi Himank Joshi";
        System.out.println(text.replace(" ","_"));
        //OR
        text = text.replace(" ","_");
        System.out.println(text);

        //Problem 3 - Program to fill in a letter template
        String letter = "Hi <|name|>,Thanks a lot!";
        letter = letter.replace("<|name|>","Himank");
        System.out.println(letter);

        //Problem 4 - Detect double or triple space in a string
        String a = "Hi Himank   ,How  are you?";
        System.out.println(a.indexOf("  "));
        System.out.println(a.indexOf("   "));
        System.out.println(a.indexOf("    "));

    }
}
