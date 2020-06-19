package com.cgr.musicapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgr.musicapi.model.Album;
import com.cgr.musicapi.service.impl.AlbumsServiceIMPL;

@RestController
@RequestMapping(path = "/api")
public class AlbumsController {

	@Autowired
	private AlbumsServiceIMPL albumsServiceIMPL;

	@GetMapping(value = "/albums")
	public List<Album> findAll() {
		return albumsServiceIMPL.findAll();
	}

	@PostMapping(value = "/save")
	public Album saveAlbum(@RequestBody Album album) {

		albumsServiceIMPL.saveAlbums(album);

		return album;

	}

	@DeleteMapping("/delete/{id}")
	public String deleteAlbum(@PathVariable("id") int id) {

		albumsServiceIMPL.deleteAlbums(id);
		return "registro eliminado";

	}
	
	@PutMapping("/modificar")
	public Album modificar(@RequestBody Album album) {
		
		albumsServiceIMPL.saveAlbums(album);
		return album;
	}
	
	
}
