package nl.han.ica.oose.dea;

import nl.han.ica.oose.dea.resources.ItemResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestItemResource {
    private ItemResource itemResource;

    @BeforeEach
    public void setup(){
        itemResource = new ItemResource();
    }

    @Test
    public void textItemTestSucces(){
        var expected = "bread, butter";

        var actual = itemResource.getTextItems();

        assertEquals(actual, expected);
    }

    @Test
    public void getJasonItemstest(){
        var actual = new ArrayList<String>();
        actual.add("bread");
        actual.add("butter");

        var expected = "[bread, butter]";

        Response response = itemResource.getJsonItems();
        ArrayList item = (ArrayList) response.getEntity();


        assertEquals(expected, response.getEntity());

    }
}
