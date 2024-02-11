import java.util.List;

public class tag {
   final public String id="0";
    private String tagName;
    private String text;
    private List<tag> children;
    final private String color = "#12344sdf"; //#ff0000 = red

    public tag(String id, String tagName, String text, List<tag> children) {
        this.tagName = tagName;
        this.text = text;
        this.children = children;
    }

    public tag() {
    }

    public String getId() {
        return id;
    }

 

    public String getTagName() {
        return tagName;
    }
    
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }
    
    public String getText() {
        return text;
    }
    
    public void setText(String text) {
        this.text = text;
    }   
    
    public List<tag> getChildren() {
        return children;
    }
    
    public void setChildren(List<tag> children) {
        this.children = children;
    }   
    
    public String getColor() {
        return color;
    }

}

