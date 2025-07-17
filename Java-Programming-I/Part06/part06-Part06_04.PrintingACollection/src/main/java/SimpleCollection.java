
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString() {
        if (elements.isEmpty()) {
            return "The collection " + name + " is empty.";
        }
        
        String ret = "";
        
        for (int i = 0; i < elements.size(); ++i) {
            if (i == elements.size() - 1) {
                ret += elements.get(i);
            } else {
                ret += elements.get(i) + "\n";
            }
        }
        
        String _ret;
        
        if (elements.size() == 1) {
            _ret = " element:\n";
        } else {
            _ret = " elements:\n";
        }
        
        return "The collection " + name + " has " + elements.size() + _ret + ret;
    }
}
