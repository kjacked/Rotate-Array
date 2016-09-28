package ProductInventory;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class ProductInventoryTest {
    @Before
    Products computer;

    @Before
    public void Setup() {
        Products computer = new Products(1200, "ID: 200123", 12);
    }
    Products.hashMap.put(Products.computer);
    int expectedValue = 100;
    int actualValue = account.getBalance();
    assertEquals("The expected value should be 100", expectedValue, actualValue);
}
