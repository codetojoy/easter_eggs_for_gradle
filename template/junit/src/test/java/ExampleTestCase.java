
import org.junit.*;
import static org.junit.Assert.*;

import java.util.*;
import java.util.stream.*;

class Location {
    String type;
    public String getType() { return type; }
}

class LocationResponse {
    List<Location> locations = new ArrayList<>();
    public List<Location> getLocations() { return locations; }
}

public class ExampleTestCase {
    @Test
    public void testCanary() {
        int x = 2+2;
        assertEquals(4, x);
    }

    @Test
    public void testExample() {
        var loc = new Location();
        var list = List.of(loc, new Location(), new Location());
        var locationResponse = new LocationResponse();
        locationResponse.locations.addAll(list);

        locationResponse.getLocations()
                        .stream()
                        .map(location -> location.getType())
                        .forEach(t -> assertNull(t));
    }
}
