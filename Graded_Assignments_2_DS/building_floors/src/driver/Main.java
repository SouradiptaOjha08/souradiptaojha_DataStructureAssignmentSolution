package driver;

import java.util.Scanner;

import building_floor_service.Construction;

public class Main {




	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the total no of floors in the building");
		int floors=s.nextInt();
		Construction c=new Construction();
		c.getFloorSize(floors);
		c.constructionOrder();		
		s.close();

	}

}
