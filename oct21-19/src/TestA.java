
public class TestA {
	public static void main(String[] args) {
		
		Pen p = new Pen();
		
		p.cost = 100;
		p.color = "red";
		p.brand = "cello";
		
		System.out.println("cost is "+p.cost);
		System.out.println("color is "+p.color);
		System.out.println("brand is "+p.brand);
		
		p.write();
		
		System.out.println("***************************************************");
	
		Van v = new Van();
		
		v.cost = 500000;
		v.color = "black";
		
		System.out.println("van cost is "+v.cost);
		System.out.println("van color is "+v.color);
		
		v.move();
		
		System.out.println();
		
		Van v1 = new Van();
		
		v1.cost = 600000;
		v1.color = "blue";
		
		System.out.println("Van1 cost is "+v1.cost);
		System.out.println("van1 color is "+v1.color);
		
		v1.move();
	}
}
