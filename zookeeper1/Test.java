public class Test {

	public static void main(String[] args) {
		
		Gorilla coco = new Gorilla(100);
		
		coco.throwPoop();
		coco.throwPoop();
		coco.throwPoop();
		
		coco.eatBanana();
		coco.eatBanana();
		
		coco.climbTree();
		System.out.println(coco.energy);
		
	}

}
