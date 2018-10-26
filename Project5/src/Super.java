abstract class LivingThings{
 public abstract void resperate();
 interface Living
 {
  public abstract void walk();
 }
}
class Super implements LivingThings.Living{
 @Override
 public void walk() {
  System.out.println("Human Can Walk");
 }
}