package aula7;
public class Aula7 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "Franca", 1.75f, 68.f, 31, 11, 2, 1);
        l[1] = new Lutador("Putty", "BRasil",  1.68f, 57.8f, 29, 13, 2, 3);
        l[2] = new Lutador("Snapshadow", "Eua", 1.65f, 80.9f, 35, 12, 2, 1);
        l[3] = new Lutador("DeadCode", "Australia", 1.93f, 81.6f, 28, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "Brasil", 1.7f, 119.3f, 37, 4, 3, 2);
        l[5] = new Lutador("Nerdaar", "EUA", 1.81f, 105.7f, 30, 12, 2, 4);

        l[3].status();
        l[3].ganharLuta();
        l[3].status();
        
    }
}
