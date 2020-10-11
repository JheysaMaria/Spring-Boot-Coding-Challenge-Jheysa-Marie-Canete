package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import repository.CodingChallenge_repository;
import entity.Movie;


@Service("CodingChallenge_service")
public class CodingChallenge_service {
	
	@Autowired
	CodingChallenge_repository repository;
	
	public CodingChallenge_service() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Page<Movie> getMovieList(Pageable pageable){
		return repository.findAll(pageable);
	}
	
	public List<Movie> getMovieDetailsByID(int ID){
		return repository.findMovieDetailsById(ID);
	}
}
