
package com.App.RestaurApp.Repository;

import com.App.RestaurApp.Model.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food, Long> {
    
}
