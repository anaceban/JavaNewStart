import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayListByAnaTest {

    @Test
    public void shouldHaveProperSizeOnCreation() {
        ArrayListByAna<String> list = new ArrayListByAna<>();
        assertEquals(0, list.size());
    }

    @Test
    public void shouldHaveProperSizeOnFilledList(){
        ArrayListByAna<String> list = new ArrayListByAna<>();
        list.add("Obj1");
        list.add("Obj2");
        assertEquals(2, list.size());
    }

    @Test
    public void shouldHaveProperSizeOnObjectRemoval(){
        ArrayListByAna<String> list = new ArrayListByAna<>();
        list.add("Obj1",0);
        list.add("Obj2",1);
        list.remove("Obj2");
        assertEquals(1, list.size());
    }

    @Test
    public void shouldHaveProperSizeWhenInitializedWithArray(){
        String[] arr = {"1", "2", "3"};
        ArrayListByAna<String> list = new ArrayListByAna<>(arr);

        assertEquals(3, list.size());
    }

    @Test
    public void shouldHaveProperSizeWhenInitializedWithArrayAndRemovedElement(){
        String[] arr = {"1", "2", "3"};
        ArrayListByAna<String> list = new ArrayListByAna<>(arr);
        list.remove("1");
        assertEquals("2", list.getElement(0));
        assertEquals(2, list.size());
    }
}
