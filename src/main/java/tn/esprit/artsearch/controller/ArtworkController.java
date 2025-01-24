package tn.esprit.artsearch.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.artsearch.entity.Artwork;
import tn.esprit.artsearch.Service.ArtworkService;

import java.util.List;

@RestController
public class ArtworkController {

    @Autowired
    private ArtworkService artworkService;

    @GetMapping("/artworks")
    public List<Artwork> getArtworks(@RequestParam String query) {
        return artworkService.searchArtworks(query);
    }
}
