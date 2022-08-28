package com.example.Album.repository;

import com.example.Album.model.Album;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AlbumRepository {
    List<Album> albumList = new ArrayList();

    public Album getAlbum(){
        Album album = new Album("MyPictures", "My Personal Images", "myPic.com");
        return album;
    }

    public Album createAlbum(Album album){
        album.setAlbumId(albumList.size()+1);
        albumList.add(album);
        return album;
    }

    public List<Album> getAllAlbums(){
        return albumList;
    }

    public Album getAlbumById(int albumId){
        for(Album album:albumList) {
            if (album.getAlbumId() == albumId) {
                return album;
            }
        }
        return null;
    }

    public Album updateAlbumById(int albumId, Album album){
        for(Album a:albumList){
            if(a.getAlbumId()==albumId){
                a.setName(album.getName());
                a.setDescription(album.getDescription());
                a.setCoverPicUrl(album.getCoverPicUrl());
                return album;
            }
        }
        return null;
    }

    public Album deleteAlbum(int albumId){
        Album deletedAlbum = null;
        for(Album a:albumList) {
            if (a.getAlbumId() == albumId) {
                deletedAlbum = a;
                albumList.remove(a);
                return deletedAlbum;
            }
        }
        return deletedAlbum;
    }

}
