import javax.xml.bind.Element;
import java.util.Arrays;

public class MyList {
    private int size=0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object element[];
    public MyList() {
        element=new Object[DEFAULT_CAPACITY];
    }
    private void ensureCapacity() {
        int newSize= element.length*2;
        element= Arrays.copyOf(element, newSize);
    }
    public void add(Element e){
        if(size==element.length){
            ensureCapacity();
        }
        element[size++]=e;
    }
    public Element get(int index){
        if(index>=size){
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index );
        }
        return (Element)element[index];
    }

}