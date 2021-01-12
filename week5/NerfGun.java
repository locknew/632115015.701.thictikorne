package week5;
//632115015 thictikorne vin
public class NerfGun {
    public int ammo = 0,id;
    public static int count=0;
    public NerfGun() {
    count++;
    this.id = count;

    }

    public NerfGun(int bullet) {
        ammo = bullet;
        count++;
        this.id=count;
    }

    public void fire() {
        if (this.ammo == 0) {
            System.out.println("there is no bullet");
            return;
        }
            System.out.println("BANG !!!");
        ammo--;
    }

    public void reload(int bullet) {

        ammo += bullet;
        if(ammo>15)
        {
            System.out.println("Error!! ammo is overload ");
            ammo -=bullet;
            return;
        }
    }

    public void displayNumOfAmmunition() {
        System.out.println(this.ammo + "  bullet left ");
    }

    public void displayGunID() {
        System.out.println("the id of this gun is " + this.id);
    }

}
