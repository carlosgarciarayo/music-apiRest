package com.cgr.musicapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgr.musicapi.model.Album;
import com.cgr.musicapi.repository.AlbumRepository;
import com.cgr.musicapi.service.AlbumsService;

@Service
public class AlbumsServiceIMPL implements AlbumsService{

	

	@Autowired 
	AlbumRepository albumRepository;

	@Override
	public List<Album> findAll() {
		return albumRepository.findAll();		
	}

	@Override
	public void saveAlbums(Album Album) {
		albumRepository.save(Album);		
	}

	@Override
	public void deleteAlbums(int id) {
		albumRepository.deleteById(id);
		
	}
	
	
	
	
}
