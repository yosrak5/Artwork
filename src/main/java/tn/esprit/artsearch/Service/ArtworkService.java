package tn.esprit.artsearch.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tn.esprit.artsearch.entity.Artwork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ArtworkService {

    public List<Artwork> searchArtworks(String query) {
        RestTemplate restTemplate = new RestTemplate();
        String API_URL = "https://api.artic.edu/api/v1/artworks";
        String url = API_URL + "?q=" + query;

        Map response = restTemplate.getForObject(url, Map.class);
        List<Map<String, Object>> data = (List<Map<String, Object>>) response.get("data");


        List<Artwork> artworks = new ArrayList<>();
        //if (data != null) {
        for (Map<String, Object> item : data) {
            Artwork artwork = new Artwork();
            artwork.setId(String.valueOf(item.get("id")));
            artwork.setTitle(String.valueOf(item.get("title")));
            artwork.setArtist(String.valueOf(item.get("artist_display")));

            artwork.setDate(String.valueOf(item.get("date_display")));
           // artwork.setScore(String.valueOf(item.get("_score")));




            artworks.add(artwork);
        }


        //}
        return artworks;
    }
}
