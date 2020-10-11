package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import entity.Movie;
import service.CodingChallenge_service;

@Controller("CodingChallenge_controller")
public class CodingChallenge_controller {
	@Autowired
	CodingChallenge_service service;
	
	@RequestMapping(value = "/discover/movie?api_key=2f8420c843ff1b5cc34d146d65e97aea")
	public Page<Movie> GetlistPopularMovies(@RequestParam(defaultValue = "0") final int pageNumber,
            @RequestParam(defaultValue = "5") final int pageSize){
		
		final Pageable pageable = PageRequest.of(pageNumber, pageSize);
        final Page<Movie> allMovies = service.getMovieList(pageable);
		
        return allMovies;
	}
	
	@RequestMapping(value="/movie/{id}?api_key=2f8420c843ff1b5cc34d146d65e97aea", method = RequestMethod.POST)
	public List<Movie> GetMovieDetailsByID(@RequestParam("id") int ID){
		Movie movie = new Movie();
		
		movie.setID(ID);
		
		return service.getMovieDetailsByID(ID);
	}
}
