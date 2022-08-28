package com.example.Album.resource;


import com.example.Album.model.Album;
import com.example.Album.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AlbumResource {

    @Autowired
    private AlbumService aserv;

    @GetMapping("/album")
    public Album getAlbum(){
        return aserv.getAlbum();
    }

    @GetMapping("/allAlbums")
    public List<Album> getAllAlbums(){
        return aserv.getAllAlbums();
    }

    @PostMapping("/album")
    public Album createAlbum(@RequestBody Album album){
        return aserv.createAlbum(album);
    }

    @GetMapping("/album/{albumId}")
    public Album getAlbumById(@PathVariable("albumId") int albumId){
        return aserv.getAlbumById(albumId);
    }

    @PutMapping("/album/{albumId}")
    public Album updateAlbumById(@PathVariable("albumId") int albumId, @RequestBody Album album){
        return aserv.updateAlbumById(albumId, album);
    }

    @DeleteMapping("/album")//delete album
    public Album deleteAlbum(@RequestParam(name = "albumId") int albumId){
        return aserv.deleteAlbum(albumId);
    }
}
