package pract21.UIex.TextEditor;

import pract21.UIex.Model.IDocument;

import java.nio.charset.Charset;
import java.util.List;

public class TextDocument implements IDocument {
    private List<String> content;

    @Override
    public long getFileSize() {
        if(content==null) return 0;
        return content.size()*2;
    }

    public TextDocument(List<String> content) {
        this.content = content;
    }

    public List<String> getContent() {
        return content;
    }

    public void setContent(List<String> content) {
        this.content = content;
    }

    @Override
    public byte[] getRaw() {
        return String.join("\n", content).getBytes(Charset.defaultCharset());
    }
}
