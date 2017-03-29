import java.util.List;
import java.util.ArrayList;
import org.sql2o.*;

public class Cuisine{
  private String cuisine;


  public Cuisine (String cuisine){
    this.cuisine=cuisine;
  }
  public String getCuisine(){
    return cuisine;
  }
// @Override
//  public boolean equals(Object otherCategory) {
//    if (!(otherCategory instanceof Category)) {
//      return false;
//    } else {
//      Category newCategory = (Category) otherCategory;
//      return this.getName().equals(newCategory.getName()) &&
//             this.getId() == newCategory.getId();
//    }
//  }
}
