import java.util.*;

public class MovieSite implements Observable{
    private List<String> movies = new ArrayList<>();
    private List<Observer> users = new ArrayList<>();
    private List<String> popularMovies = new ArrayList<>();

    public void addMovie(String movie){
        this.movies.add(movie);
        notifyAllUsers();
    }
    public void removeMovie(String movie){
        this.movies.remove(movie);
        notifyAllUsers();
    }
    public void addPopularMovie(String popularMovie){
        this.popularMovies.add(popularMovie);
        notifyAllUsers();
    }
    public void removePopularMovie(String popularMovie){
        this.popularMovies.remove(popularMovie);
        notifyAllUsers();
    }
    @Override
    public void registerUser(Observer user) { this.users.add(user); }

    @Override
    public void unregisterUser(Observer user) {
        this.users.remove(user);
    }

    @Override
    public void notifyAllUsers() {
        for(Observer user:users){
            user.update(this.movies,this.popularMovies);
        }
    }
}