public interface Observable {
    void registerUser(Observer user);
    void unregisterUser(Observer user);
    void notifyAllUsers();
}