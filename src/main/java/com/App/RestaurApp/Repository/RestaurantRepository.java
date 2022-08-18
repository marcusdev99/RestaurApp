
package com.App.RestaurApp.Repository;

import com.App.RestaurApp.Model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepository extends JpaRepository<Restaurant, Long> {
    
}
