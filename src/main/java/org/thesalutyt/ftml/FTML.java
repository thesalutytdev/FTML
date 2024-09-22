package org.thesalutyt.ftml;

import org.thesalutyt.ftml.objects.FTMLObject;
import org.thesalutyt.ftml.parser.FTMLParser;

public class FTML {
    public static void main(String[] args) {
        FTMLObject[] objects = FTMLParser.parseFile("src/main/resources/example.ftml");
        for (FTMLObject object : objects) {
            System.out.println(object.str());
        }
    }
}
