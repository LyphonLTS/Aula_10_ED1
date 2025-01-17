package Controller;

public class HanoiTower {
  private long count;

  public HanoiTower() {
    this.count = 0;
  }

  private void mover(String origem, String destino) {
    System.out.println(origem + " -> " + destino);
    this.count++;
  }

  public long exec(int n, String origem, String destino, String aux) {
    if (0 < n) {
      exec(n - 1, origem, aux, destino);
      mover(origem, destino);
      exec(n - 1, aux, destino, origem);
    }

    return count;
  }
}
