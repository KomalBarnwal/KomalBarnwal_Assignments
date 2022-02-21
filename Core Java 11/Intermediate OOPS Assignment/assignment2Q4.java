abstract class Example{
    public Example( ) {  
    }
    public void Hard(){
        System.out.println("It is Hard");
    }
    public void Easy() {
        System.out.println("It is Easy");
    }
    public abstract void skip();
}
class levelOfDifficulty extends Example{
    public levelOfDifficulty( ) { }
    @Override
    public void skip() {
        System.out.println("Example is skipped...");
    }
}
public class assignment2Q4 
{
	public static void main(String[] args) 
	{
		Example an = new levelOfDifficulty();
		an.Easy();
		an.Hard();
		an.skip();
	}
}
