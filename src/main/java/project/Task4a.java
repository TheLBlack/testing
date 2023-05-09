package project;

public class Task4a {

    private int maxCapacity;
    private int bulletsInMagazine;

    public Task4a(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public void loadBullet(String bullet) {
        if (bulletsInMagazine < maxCapacity) {
            bulletsInMagazine++;
            System.out.println("Loading bullets: " + bulletsInMagazine + "/" + maxCapacity);
        } else System.out.println("FULL");
    }

    public boolean isLoaded() {
        return bulletsInMagazine != 0;
    }

    public void shot() {
        if (!isLoaded()) System.out.println("Empty");
        else {
            System.out.println("Number of bullet " + bulletsInMagazine);
            System.out.println("SHOT");
            bulletsInMagazine--;

            if (isLoaded()) System.out.println("next bullet ready");
            else System.out.println("Empty");
        }
    }
}
