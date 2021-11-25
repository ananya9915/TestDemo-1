package CodeCamp1.ArraySum;
import org.junit.Assert;
import org.junit.Test;

public class AppTest{
	@Test
	public void PairTest1(){
		Assert.assertEquals(1, App.findPairs(new int[] {3,4,5,2,6,8}, 7));
	}
	@Test
	public void PairTest2(){
		Assert.assertEquals(-1, App.findPairs(new int[] {3,4,5,2,6,8}, 56));
	}
	@Test
	public void PairTest3(){
		Assert.assertEquals(-1, App.findPairs(new int[] {3,4,5,2,6,8}, 16));
	}
	@Test
	public void PairTest4(){
		Assert.assertEquals(-1, App.findPairs(new int[] {3,4,5,2,6,8}, 42));
	}
	@Test
	public void PairTest5(){
		Assert.assertEquals(-1, App.findPairs(new int[] {3,4,5,2,6,8}, 78));
	}
	@Test
	public void PairTest6(){
		Assert.assertEquals(1, App.findPairs(new int[] {3,4,5,2,6,8}, 14));
	}
}