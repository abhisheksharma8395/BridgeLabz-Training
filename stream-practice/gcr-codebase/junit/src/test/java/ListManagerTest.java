import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class ListManagerTest {

    ListManager tester = new ListManager();
    List<Integer> list;

    @BeforeEach
    public void setUp(){
        list = new ArrayList<>();
    }

    // This test method is used to test the addElement of ListManager class
    @ParameterizedTest
    @ValueSource (ints = {4,5,6,7,8,8})
    public void testAddElement(Integer number){
        assertTrue(tester.addElement(list, number));
    }

    // This test method is used to test the removeElement of ListManager class on valid inputs
    @ParameterizedTest
    @ValueSource (ints = {4,6,7,8})
    public void testRemoveElement(Integer number){
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        assertTrue(tester.removeElement(list, number));
    }

    // This test method is used to test the removeElement of ListManager class on invalid inputs
    @ParameterizedTest
    @ValueSource (ints = {10,200,7,8})
    public void testRemoveElementInvalid(Integer number){
        list.add(4);
        assertFalse(tester.removeElement(list, number));
    }

    // This test method is used to test the getSize of ListManager class on valid inputs
    @Test
    public void testGetSize(){
        list.add(4);
        list.add(6);
        list.add(7);
        list.add(8);
        assertEquals(4,tester.getSize(list));
    }
}
