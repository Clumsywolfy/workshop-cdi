package nl.han.ica.oose.dea;

import nl.han.ica.oose.dea.resources.HealthCheckResource;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestHealthCheckResource {
    private HealthCheckResource healthCheckResource;

    @BeforeEach
    public void setup(){
        healthCheckResource = new HealthCheckResource();
    }

    @Test
    public void happyFlowTest(){
        var expected = "Up & Running";

        var actual = healthCheckResource.healthy();

        assertEquals(actual,expected);
    }

}
