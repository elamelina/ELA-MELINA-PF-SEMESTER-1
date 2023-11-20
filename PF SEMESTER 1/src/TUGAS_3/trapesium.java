package TUGAS_3;

public class trapesium {
    public static void main(String[] args) {
        double diagonal1 = 10;
        double diagonal2 = 20;
        double luasTrapesium = luasTrapesium(diagonal1, diagonal2);
        System.out.println("Luas trapesium adalah: "+luasTrapesium);
    }
    public static double luasTrapesium(double diagonal1, double diagonal2) {
        return (diagonal1 + diagonal2) / 2;
    }
}
