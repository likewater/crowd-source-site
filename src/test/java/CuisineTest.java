import org.junit.*;
import static org.junit.Assert.*;
import org.sql2o.*;
import java.util.Arrays;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CuisineTest{
  @Test
  public void CuisineInstantiate_True(){
    Cuisine testCuisine = new Cuisine("Peruvian");
    assertEquals ( true , testCuisine instanceof Cuisine );
  }

  @Test
  public void Cuisine_InstantiatesWithString_Peruvian(){
    Cuisine testCuisine = new Cuisine("Peruvian");
    assertEquals ( "Peruvian" , testCuisine.getCuisine() );
  }
}
