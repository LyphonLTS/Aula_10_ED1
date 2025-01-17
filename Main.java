import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Controller.HanoiTower;

class Main {
  public static void main(String[] args) {
    HanoiTower hanoiTower = new HanoiTower();
    Scanner scanner = new Scanner(System.in);
    long startTime = System.currentTimeMillis();

    System.out.print("Digite o número de discos: ");
    int val = scanner.nextInt();

    long totalExec = hanoiTower.exec(val, "A", "C", "B");

    scanner.close();

    long endTime = System.currentTimeMillis();
    long pastTime = endTime - startTime;

    System.out.println();
    System.out.println("Tempo de execução: " + formatTime(pastTime) + "\nTotal de execuções: " + totalExec);
  }

  public static String formatTime(long timeMillis) {
    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss:SS");
    return sdf.format(new Date(timeMillis));
  }
}