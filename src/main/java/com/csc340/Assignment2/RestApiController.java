package com.csc340.Assignment2;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class RestApiController {

    /**
     * Gets a dog image from RandomDog.
     *
     * @return Json file containing the image information.
     */
    @GetMapping("/dog")
    public Object dog() {

        try {
            String url = "https://random.dog/woof.json";
            RestTemplate restTemplate = new RestTemplate();
            ObjectMapper mapper = new ObjectMapper();

            String jsonResponse = restTemplate.getForObject(url, String.class);
            JsonNode root = mapper.readTree(jsonResponse);

            return new DogImage( root.get("fileSizeBytes").asInt(), root.get("url").asText());
        } catch (JsonProcessingException e) {
            Logger.getLogger(RestApiController.class.getName()).log(Level.SEVERE,
                    null, e);

            return "error in /dog";
        }

    }

}
