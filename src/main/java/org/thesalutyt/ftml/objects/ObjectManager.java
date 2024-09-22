package org.thesalutyt.ftml.objects;

import org.thesalutyt.ftml.parser.FTMLParser;

import java.io.File;

public class ObjectManager {
    protected File file;
    protected FTMLObject[] objects;

    public ObjectManager(File file) {
        this.file = file;
        this.objects = FTMLParser.parseFile(file.getAbsolutePath());
    }

    public File getFile() {
        return file;
    }

    public FTMLObject[] getObjects() {
        return objects;
    }
}
