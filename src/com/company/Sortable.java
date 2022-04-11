package com.company;

import java.util.List;

public interface Sortable {
    void printAllMovies(List<Movies> movies);

    void findMovie(List<Movies> movies, String input);

    void sortByYear(List<Movies> movies);

    void sortByName(List<Movies> movies);

    void sortByDirector(List<Movies> movies);
}

