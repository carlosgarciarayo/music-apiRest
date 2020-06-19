package com.cgr.musicapi.service;

import java.util.List;



import com.cgr.musicapi.model.Album;

public interface AlbumsService {

	List<Album> findAll();	
	void saveAlbums (Album albums);
	
	void deleteAlbums(int id);
}
