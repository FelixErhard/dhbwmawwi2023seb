package lecture.chapter6;

public class Bird extends Animal{

  private boolean canFly;

  public Bird(String description, float weight, float size, boolean canFly) {
    super(description, weight, size);
    setCanFly(canFly);
  }

  public void tweet(){
    System.out.println("Der Vogel " + getDescription() + " zwitschert! *trillili*");
  }

  public boolean isCanFly() {
    return canFly;
  }

  public void setCanFly(boolean canFly) {
    this.canFly = canFly;
  }
}
