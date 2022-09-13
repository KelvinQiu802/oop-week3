public class App {
    Ship player = new Ship(50, 400, 0, 3, true);
    int numberOfEnemies = 3;
    Ship[] enemyShips = new Ship[numberOfEnemies];

    public static void main(String[] args) throws Exception {
        App a = new App();
        a.test();
    }

    void test() {
        enemyShips[0] = new Ship(70, 50, 15, 1, false);
        enemyShips[1] = new Ship(90, 50, 20, 1, false);
        enemyShips[2] = new Ship(110, 50, 0, 1, false);

        Bullet b1 = player.fire();
        b1.print();

        System.out.println("Player (" + player.getX() + ", " + player.getY() + ") has " +
                player.getLives() + " Lives");
        for (int i = 0; i < numberOfEnemies; i++) {
            System.out.println("Enemy " + i + " located at (" + enemyShips[i].getX() + ", " + enemyShips[i].getY()
                    + ") has health " + enemyShips[i].getLives());
        }
        removeShip(1);
        for (int i = 0; i < numberOfEnemies; i++) {
            System.out.println("Enemy " + i + " located at (" + enemyShips[i].getX() + ", " + enemyShips[i].getY()
                    + ") has health " + enemyShips[i].getLives());
        }
    }

    void removeShip(int index) {
        if (index < numberOfEnemies && index >= 0) {
            for (int i = index; i < numberOfEnemies - 1; i++) {
                enemyShips[i] = enemyShips[i + 1];
            }
            enemyShips[numberOfEnemies - 1] = null;
            numberOfEnemies--;
        }
    }
}
