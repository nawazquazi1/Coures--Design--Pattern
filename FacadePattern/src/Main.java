import com.java.course.facade.HomeTheatre;
import com.java.course.subSystem.RoomLight;
import com.java.course.subSystem.SoundSystem;
import com.java.course.subSystem.Television;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        RoomLight roomLight = new RoomLight();
        Television television = new Television();
        SoundSystem soundSystem = new SoundSystem();
        HomeTheatre homeTheatre = new HomeTheatre(roomLight, television, soundSystem);
        homeTheatre.watchMovie();
        Thread.sleep(10000);
        homeTheatre.StopWatchMovie();
    }
}
