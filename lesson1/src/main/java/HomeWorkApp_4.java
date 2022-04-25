package consoleApp;

import java.util.Random;
import java.util.Scanner;

public class HomeWorkApp_4 {

    public static String heroName = "Red Schewhart";
    public static char player = '@';
    public static int heroHealth = 100;
    public static int heroPower;
    public static int heroCoins = 0;
    public static int heroExp = 0;
    public static int heroPosX;
    public static int heroPosY;
    public static final int playerMoveUp = 8;
    public static final int playerMoveDown = 2;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;
    public static int heroValueMin = 10;
    public static int heroValueMax = 60;

    public static String enemyName = "Mutant";
    public static char enemy = '!';
    public static int enemyHealth;
    public static int enemyPower;
    public static int enemiesCount;
    public static int enemyValueMin = 20;
    public static int enemyValueMax = 50;

    public static char coins = '$';
    public static int countCoins;

    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 2;
    public static int mapSizeMax = 5;
    public static char[][] map;
    public static char emptyCell = '_';

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        createMap();

        spawnHeroes();
        spawnCoins();
        spawnEnemy();

        while (true) {
            showMap();
            playerMoveAction();

            if (!isPlayerAlive()) {
                System.out.println(heroName + " is dead. Count coins = " + heroCoins);
                break;
            }

            if (!isEnemyExist()) {
                System.out.println(heroName + " is win. Count coins = " + heroCoins + " Go to the next level!");
                createMap();
                spawnHeroes();
                spawnCoins();
                spawnEnemy();
            }
        }
        showMap();
        System.out.println("Game over!");
    }

    public static void createMap(){
        mapWidth = randomValue(mapSizeMin,mapSizeMax);
        mapHeight = randomValue(mapSizeMin,mapSizeMax);
        map = new char[mapWidth][mapHeight];
        for(int i = 0; i < mapWidth; i++){
            for(int j = 0; j < mapHeight; j++){
                map[i][j] = emptyCell;
            }
        }
        System.out.println("Create map [" + mapWidth + "x" + mapHeight + "]");
    }

    public static void showMap(){
        System.out.println("MAP");
        for(int i = 0; i < mapWidth; i++){
            for(int j = 0;j < mapHeight; j++){
                if (map[i][j] == '!'){
                    System.out.print("_" + "|");
                }
                else{
                    System.out.print(map[i][j] + "|");
                }
            }
            System.out.println();
        }
        System.out.println("MAP");
    }

    public static int randomValue(int min, int max){
        return min + random.nextInt(max - min + 1);
    }

    public static void spawnHeroes(){
        heroPosX = randomValue(0,mapWidth - 1);
        heroPosY = randomValue(0,mapHeight - 1);
        heroPower = randomValue(heroValueMin, heroValueMax);
        map[heroPosX][heroPosY] = player;
    }

    public static void spawnCoins(){

        int coinsPosX;
        int coinsPosY;

        countCoins = (mapWidth + mapHeight) / 2;

        for (int i = 1; i <= countCoins; i++) {

            do {
                coinsPosX = random.nextInt(mapWidth);
                coinsPosY = random.nextInt(mapHeight);
            } while (!isCellClear(coinsPosX, coinsPosY));
            map[coinsPosX][coinsPosY] = coins;
        }
    }

    public static void spawnEnemy(){
        enemyHealth = randomValue(enemyValueMin, enemyValueMax);
        enemyPower = randomValue(enemyValueMin, enemyValueMax);
        enemiesCount = (mapWidth + mapHeight) / 2;

        int enemyPosX;
        int enemyPosY;

        for (int i = 1; i <= enemiesCount; i++) {

            do {
                enemyPosX = random.nextInt(mapWidth);
                enemyPosY = random.nextInt(mapHeight);
            } while (!isCellClear(enemyPosX, enemyPosY));
            map[enemyPosX][enemyPosY] = enemy;
        }
    }

    public static void playerMoveAction() {
        int playerLastPositionX = heroPosX;
        int playerLastPositionY = heroPosY;

        int playerMoveCode;

        do {
            System.out.print("Enter destination: (UP-" + playerMoveUp + "|DOWN-" + playerMoveDown +
                    "|LEFT-" + playerMoveLeft + "|RIGHT-" + playerMoveRight + ") > ");
            playerMoveCode = scanner.nextInt();

            switch (playerMoveCode) {
                case playerMoveUp:
                    heroPosX -= 1;
                    break;
                case playerMoveDown:
                    heroPosX += 1;
                    break;
                case playerMoveLeft:
                    heroPosY -= 1;
                    break;
                case playerMoveRight:
                    heroPosY += 1;
                    break;
            }

        } while (!isValidPlayerMove(playerLastPositionX, playerLastPositionY, heroPosX, heroPosY));

        playerNextCellAction();

        map[heroPosX][heroPosY] = player;
        map[playerLastPositionX][playerLastPositionY] = emptyCell;

    }

    public static boolean isValidPlayerMove(int lastX, int lastY, int nextX, int nextY) {
        if (isCellValid(nextX, nextY)) {
            System.out.println(heroName + " has move to [" + nextX + ":" + nextY + "]");
            return true;
        } else {
            System.out.println(heroName + " move to [" + nextX + ":" + nextY + "] invalid");
            heroPosX = lastX;
            heroPosY = lastY;
            return false;
        }
    }

    public static void playerNextCellAction() {
        if (map[heroPosX][heroPosY] == enemy) {
            enemiesCount--;
            heroExp += 250;
            System.out.println(heroName + " fight with " + enemyName + "!");
            System.out.println(heroName + " power = " + heroPower);
            System.out.println(enemyName + " power = " + enemyPower);
            if (heroPower < enemyPower){
                heroHealth -= enemyPower;
                System.out.println(heroName + " get damage " + enemyPower + ". " + heroName + " HP= " + heroHealth);
            }
            if (heroHealth > 0) {
                System.out.println(heroName + " Win! ");
            }

        }
        if (map[heroPosX][heroPosY] == coins) {
            int count = randomValue(100, 300);
            heroCoins += count;
            System.out.println(heroName + " get " + count + " coins. " + heroName + " coins = " + heroName);
        }
    }

    public static boolean isCellClear(int x, int y) {
        return map[x][y] == emptyCell;
    }

    public static boolean isCellValid(int x, int y) {
        return x >= 0 && x < mapWidth && y >= 0 && y < mapHeight;
    }

    public static boolean isPlayerAlive() {
        return heroHealth > 0;
    }

    public static boolean isEnemyExist() {
        return enemiesCount > 0;
    }
    public static boolean isCoinsExist() {
        return countCoins > 0;
    }
}
