/*LARAVEL

MVC

composer create-project laravel/laravel pro_4b1




JAVA
*/
interface bike
{
 	int speed = 60;
	public void coverDistance();
}
interface car
{
int distance = 60;
public void speed();
}

class TwoWheeler implements bike,car
{
@Override
public void speed()
{
System.out.println("Speed"+distance/speed);
}
@Override
public void coverDistance()
{
System.out.println("Distance"+speed*distance);
}

}
public class Tester
{
public static void main(String args[]){
TwoWheeler splender = new TwoWheeler();
splender.speed();
splender.coverDistance();
}
}