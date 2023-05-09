package project;

import java.util.Deque;
import java.util.LinkedList;

public class Task4c {

    private int size;
    private Deque<String> bullets = new LinkedList<>();

    public Task4c(int size) {
        this.size = size;
    }

    public void loadBullet(String bullet) {
        if (bullets.size() < size) {
            bullets.add(bullet);
        }
        else System.out.println("The magazine is full!");
    }

    public boolean isLoaded() {
        return bullets.size() > 0;
    }

    public void shot(){
        if (isLoaded()){
            System.out.println("Shot! " + bullets.getLast());
            bullets.removeLast();
        }else{
            System.out.println("Empty magazine!");
        }
    }
}
