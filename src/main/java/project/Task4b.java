package project;

import java.util.ArrayList;
import java.util.List;

public class Task4b {

    private List<String> bullets = new ArrayList<>();
    private int size;

    public Task4b(int size) {
        this.size = size;
    }

    public void loadBullet(String bullet) {
        if (bullets.size() < size) bullets.add(bullet);
        else System.out.println("Magazine is full");
    }

    public boolean isLoaded() {
        return !this.bullets.isEmpty();
    }

    public void shot() {
        if (!this.isLoaded()) System.out.println("EMPTY MAGAZINE");
        else {
            String bulletInUse = this.bullets.remove(0);
            System.out.println(bulletInUse);
        }
    }
}
