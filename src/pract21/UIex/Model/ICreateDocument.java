package pract21.UIex.Model;

import javax.swing.*;
import java.io.IOException;

public interface ICreateDocument {
    IDocument openExisting(String path) throws IOException;
    IDocument createNew();
    JFileChooser createFileChooser();
}
