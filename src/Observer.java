import java.util.List;

public interface Observer {
    void update(List<String> movies,List<String> popularMovies);
}