import java.util.List;
import java.util.ArrayList;
import org.sql2o.*;

public class Location{
  private String location;

  public Location(String location){
    this.location=location;
  }
}

@Override
 public boolean equals(Object otherCategory) {
   if (!(otherCategory instanceof Category)) {
     return false;
   } else {
     Category newCategory = (Category) otherCategory;
     return this.getName().equals(newCategory.getName()) &&
            this.getId() == newCategory.getId();
   }
 }
