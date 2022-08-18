
package com.App.RestaurApp.Service;

import com.App.RestaurApp.Model.Restaurant;
import com.App.RestaurApp.Repository.RestaurantRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RestaurantService {
    
    @Autowired
    private RestaurantRepository restaurantRepository;
    
    
    
}
