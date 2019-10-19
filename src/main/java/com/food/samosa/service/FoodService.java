package com.food.samosa.service;

import com.food.samosa.entity.FoodEntity;
import com.food.samosa.mapper.FoodMapper;
import com.food.samosa.mapper.FoodPreferenceMapper;
import com.food.samosa.model.FoodModel;
import com.food.samosa.repository.FoodRepository;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

public class FoodService {

    @Autowired
    private FoodMapper foodMapper;

    @Autowired
    private FoodRepository foodRepository;

    private final RestTemplate restTemplate;

    public FoodService(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<FoodModel> foodModelList(String categoryName){
        List<FoodModel> food = new ArrayList<>();
        List<FoodEntity> foodEntityList = this.foodRepository.findAllByCategory(categoryName);

        foodEntityList.forEach( foodEntity ->  {
            food.add(foodMapper.entityToModel(foodEntity));
        });
        return  food;
    }

    public List<FoodModel> foodByLocation(String location){
        List<FoodModel> food = new ArrayList<>();



    }


    public List<String> getYelpBusinessIds() throws JSONException {
        List<String> businessIds = new ArrayList<>();
        // TODO add in location
        String url = "https://api.yelp.com/v3/businesses/search?term=food&location=" /*+ location*/;

        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
        headers.set("Authorization", "Bearer Ell5pBPevz8du9BOpvMmUWpDDfyI7rw408V2uP24aOJzEJ9DTa25Rrk0j0wDpcRA59eOsacOgx--rf2I-ePAzt2aEkYLRcE8b81GNU_QnR6knG1Bskb-FUdv9UGqXXYx");

        HttpEntity request = new HttpEntity(headers);

        ResponseEntity<JSONObject> response =  this.restTemplate.exchange(url, HttpMethod.GET, request, JSONObject.class);
        JSONArray businesses = response.getBody().getJSONArray("businesses");
        if (businesses != null) {
            for(int i = 0; i<businesses.length(); i++) {
                JSONObject business = businesses.getJSONObject(i);
                String businessId = business.getString("id");
                if (businessId != null) {
                    businessIds.add(businessId);
                }
            }
        }
        return businessIds;
    }

}
