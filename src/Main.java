public class Main {

    public static void main(String[] args) {
        MovieSite hdRezka = new MovieSite();
        hdRezka.addMovie("Крик");
        User someUser = new User("Aiko");
        hdRezka.addMovie("Дюна");
        hdRezka.addPopularMovie("Тетрадь смерти");
        hdRezka.registerUser(someUser);
        User secondUser = new User("Abe");
        hdRezka.registerUser(secondUser);
        hdRezka.addPopularMovie("Монстр");
        hdRezka.addMovie("Клаустрофобры");
        hdRezka.removeMovie("Крик") ;
        hdRezka.unregisterUser(secondUser);
        hdRezka.addPopularMovie("Паразиты");
    }
}
