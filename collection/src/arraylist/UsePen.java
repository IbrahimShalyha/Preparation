package arraylist;

import java.util.*;

public class UsePen {
	public static void main(String[] args) {
		Pen p1 = new Pen("CELLO", 5, true);
		Pen p2 = new Pen("REYNOLDS", 100, false);
		Pen p3 = new Pen("CAMLIN", 80, true);
		Pen p4 = new Pen("NATARAJ", 35, true);

		ArrayList<Pen> pens = new ArrayList<>();
		ArrayList<Pen> ballpointPens = new ArrayList<>();

		pens.add(p1);
		pens.add(p2);
		pens.add(p3);
		pens.add(p4);

//		System.out.println(pens.get(2));

		for (int i = 0; i < pens.size(); i++) {
//			System.out.println(pens.get(i).getBrand());
//			System.out.println(pens);
//			System.out.println(pens.get(i));
//			System.out.println(pens.get(i).getBrand()+" "+pens.get(i).getPrice());
		}

		for (int i = 0; i < pens.size(); i++) {
			if (pens.get(i).getIsBallPoint() == true) {
				System.out.println(pens.get(i).getBrand());
			}
		}

		for (int i = 0; i < pens.size(); i++) {
			if (pens.get(i).getPrice() >= 80) {
				System.out.println(pens.get(i).getBrand());
			}
		}

		for (int i = 0; i < pens.size(); i++) {
			if (pens.get(i).getIsBallPoint() != true) {
				System.out.println(pens.get(i).getPrice() - 5);
			}
		}

		for (int i = 0; i < pens.size(); i++) {
			if (pens.get(i).getIsBallPoint() == false) {
				ballpointPens.add(pens.get(i));
			}
		}

		for (int i = 0; i < ballpointPens.size(); i++) {
			System.out.println(ballpointPens.get(i));
		}

	}

}
