package com.georgidinov;

public abstract class AbstractFactory {
    protected abstract HollyWoodMovies getHollyWoodMovie(String movie);

    protected abstract BullyWoodMovies getBullyWoodMovie(String movie);
}//end of abstract class AbstractFactory


class HollyWoodMovieFactory extends AbstractFactory {

    @Override
    public HollyWoodMovies getHollyWoodMovie(String movie) {
        if (movie == null) {
            return null;
        } else if (movie.equalsIgnoreCase("action")) {
            return new HollyWoodAction();
        } else if (movie.equalsIgnoreCase("comedy")) {
            return new HollyWoodComedy();
        }
        return null;
    }//end of method


    @Override
    public BullyWoodMovies getBullyWoodMovie(String movie) {
        return null;
    }

}//end of class HollyWoodMovieFactory

class BullyWoodMovieFactory extends AbstractFactory {
    @Override
    public HollyWoodMovies getHollyWoodMovie(String movie) {
        return null;
    }

    @Override
    public BullyWoodMovies getBullyWoodMovie(String movie) {
        if (movie == null) {
            return null;
        } else if (movie.equalsIgnoreCase("action")) {
            return new BullyWoodAction();
        } else if (movie.equalsIgnoreCase("comedy")) {
            return new BullyWoodComedy();
        }
        return null;
    }
}//end of class BullyWoodMovieFactory