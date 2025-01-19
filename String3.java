/*
Write a java program to fill in a letter template
letter = "Dear <|Name|> , Thanks a lot "
replace latter ("name","Om ");
 */

public class String3 {
    public static void main(String[] args) {
        String letter = "Dear <|Name|> , Thanks a lot ";
        letter = letter.replace("<|Name|>","OM");
        System.out.println(letter);
    }
}
