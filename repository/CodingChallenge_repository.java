package repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entity.Movie;

@Repository("CodingChallenge_repository")
public interface CodingChallenge_repository extends JpaRepository<Movie, Integer>{
	Page<Movie> findAll(Pageable pageable);
	List<Movie> findMovieDetailsById(int ID);
}