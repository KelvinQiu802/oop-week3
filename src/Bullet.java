public class Bullet {
  private int x;
  private int y;
  private boolean up;

  public Bullet(int x, int y, boolean up) {
    this.x = x;
    this.y = y;
    this.up = up;
  }

  public int getX() {
    return this.x;
  }

  public int getY() {
    return this.y;
  }

  public void print() {
    if (this.up) {
      System.out.println("Bullet located at (" + this.x + ", " + this.y + ") moving up");
    } else {
      System.out.println("Bullet located at (" + this.x + ", " + this.y + ") moving down");
    }
  }
}
