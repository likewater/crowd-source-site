import java.util.List;
import java.util.ArrayList;
import org.sql2o.*;

public class Restaurant{
  private String nameOfRestaurant;
  private String address;
  private String url;
  private String review;
  private int rating;


  public Restaurant (String nameOfRestaurant, String address, String url, String review, int rating){
    this.nameOfRestaurant=nameOfRestaurant;
    this.address=address;
    this.url=url;
    this.review=review;
    this.rating=raitng;
  }
  public String getName(){
    return nameOfRestaurant;
  }

  public String getAddress(){
    return address;
  }

  public String getUrl(){
    return url;
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
