public class Main {
int m=10,n;
public void div(int a) throws Exception{
n=m/a;
System.out.println(n);
}
public void div(int a,int b) {
n=a/b;
}
public static void main(String[]args) throws Exception{
Main o=new Main();
o.div(0);
}
}