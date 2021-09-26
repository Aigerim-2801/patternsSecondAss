import java.util.List;

public class User implements Observer{
    private String name;

    public User(String name) { this.name = name; }
    @Override
    public void update(List<String> movies, List<String> popularMovies) {
        System.out.println("Dear "+ this.name+"\nWe have some changes in list of movies " + movies);
        System.out.println("So we have some changes in list of popular movies " + popularMovies +"\n");
    }
}

