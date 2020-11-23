package pract21.UIex.TextEditor;

import pract21.UIex.Model.ICreateDocument;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CreateTextDocument implements ICreateDocument {
    @Override
    public TextDocument openExisting(String path) throws IOException {
        var text = Files.readAllLines(Paths.get(path), Charset.defaultCharset());
        return new TextDocument(text);
    }

    @Override
    public TextDocument createNew() {
        return new TextDocument(null);
    }

    @Override
    public JFileChooser createFileChooser() {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new FileNameExtensionFilter("Text files", "txt"));
        return fc;
    }
}
