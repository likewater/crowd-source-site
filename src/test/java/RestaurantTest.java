import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class RestaurantTest{

@Test
  public void Instantiates_true(){
    Restaurant testRestaurant=new Restaurant("Hot Dog Place","123 Apple St", "www.hotdogs.com");
    assertEquals( true, testRestaurant instanceof Restaurant);
  }

@Test
  public void Returns_Name_HotDogPlace(){
    Restaurant testRestaurant=new Restaurant("Hot Dog Place","123 Apple St", "www.hotdogs.com");
    assertEquals( "Hot Dog Place", testRestaurant.getName());
  }

  @Test
    public void ReturnsAddress_123AppleSt(){
      Restaurant testRestaurant=new Restaurant("Hot Dog Place","123 Apple St", "www.hotdogs.com");
      assertEquals( "123 Apple St", testRestaurant.getAddress());
    }

    @Test
      public void ReturnsURL_wwwhotdogscom(){
        Restaurant testRestaurant=new Restaurant("Hot Dog Place","123 Apple St", "www.hotdogs.com");
        assertEquals( "www.hotdogs.com", testRestaurant.getUrl());
      }
}
