public class Ship {
  private int x;
  private int y;
  private int cooldown;
  private int lives;
  private boolean player;

  public Ship(int x, int y, int cooldown, int lives, boolean player) {
    this.x = x;
    this.y = y;
    this.cooldown = cooldown;
    this.lives = lives;
    this.player = player;
  }

  public Bullet fire() {
    Bullet b = null;
    if (this.cooldown == 0) {
      b = new Bullet(x, y, player);
      this.cooldown = 50;
    }
    return b;
  }

  public boolean isHit(Bullet b) {
    if (b.getX() >= this.x && b.getX() <= this.x + 10 &&
        b.getY() >= this.y && b.getY() <= this.y + 10) {
      return true;
    }
    return false;
  }

  public void print(int index) {
    if (player) {
      System.out.println("Player (" + this.x + ", " + this.y + ") has " +
          this.lives + " Lives");
    } else {
      System.out.println("Enemy " + index + " located at (" + this.x + ", " + this.y
          + ") has health " + this.lives);
    }
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public int getLives() {
    return this.lives;
  }

}
