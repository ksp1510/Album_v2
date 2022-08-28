package com.example.Album.service;

import com.example.Album.model.Album;
import com.example.Album.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository arepo;

    public Album getAlbum(){
        return arepo.getAlbum();
    }

    public Album createAlbum(Album album){
        return arepo.createAlbum(album);
    }

    public List<Album> getAllAlbums(){
        return arepo.getAllAlbums();
    }

    public Album getAlbumById(int albumId){
        return arepo.getAlbumById(albumId);
    }

    public Album updateAlbumById(int albumId, Album album){
        return arepo.updateAlbumById(albumId, album);
    }

    public Album deleteAlbum(int albumId){
        return arepo.deleteAlbum(albumId);
    }
}
