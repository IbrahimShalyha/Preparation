package day8class;

public class UseAirconditioner1 {
	public static void main(String[] args) {

		Airconditioner Ac1 = new Airconditioner();
		Ac1.brand = "Croma";
		Ac1.price = 35000;
		Ac1.color = "WHITE";
		Ac1.rating = 4.5f;

		Airconditioner Ac2 = new Airconditioner();
		Ac2.brand = "Diakin";
		Ac2.price = 30000;
		Ac2.color = "BLUE";
		Ac2.rating = 1.0f;

		Airconditioner Ac3 = new Airconditioner();
		Ac3.brand = "LG";
		Ac3.price = 45000;
		Ac3.color = "WHITE";
		Ac3.rating = 4.5f;

		Airconditioner Ac4 = new Airconditioner();
		Ac4.brand = "SAMSUNG";
		Ac4.price = 50000;
		Ac4.color = "GREY";
		Ac4.rating = 4.5f;

		Airconditioner[] acs = { Ac1, Ac2, Ac3, Ac4 };
//		Airconditioner max = acs[0];
//		Airconditioner min = acs[0];
//		for (int i = 0; i < acs.length; i++) {
//			System.out.println("BRAND = " + acs[i].brand + " PRICE = " + acs[i].price + " COLOR = " + acs[i].color
//					+ " RATING = " + acs[i].rating);
//		}

//		for (int i = 0; i < acs.length; i++) {
//			if (acs[i].color.equalsIgnoreCase("White")) {
//				System.out.println("BRAND = " + acs[i].brand + " PRICE = " + acs[i].price + " COLOR = " + acs[i].color
//						+ " RATING = " + acs[i].rating);
//			}
//		}
//		for (int i = 0; i < acs.length; i++) {
//			if (acs[i].rating > 2 && acs[i].rating < 5) {
//				System.out.println("BRAND = " + acs[i].brand + " PRICE = " + acs[i].price + " COLOR = " + acs[i].color
//						+ " RATING = " + acs[i].rating);
//
//			}
//		}
//	}
//}
//		for (int i = 0; i < acs.length; i++) {
//			if (acs[i].brand.length() % 2 == 0) {
//				System.out.println(acs[i].brand.toLowerCase());
//			}
//		}
//	}
////}
//        for(int i =0; i<acs.length; i++) {
//        	if(acs[i].price >= max.price) {
//        		max = acs[i];
//        	}
//        }
//        System.out.println("BRAND = "+max.brand+" PRICE = "+max.price+" COLOR = "+max.color+" RATING = "+max.rating);
//	}
//}

//		for (int i = 0; i < acs.length; i++) {
//			if (acs[i].price <= min.price) {
//				min = acs[i];
//			}
//		}
//		System.out.println(
//				"BRAND = " + min.brand + " PRICE = " + min.price + " COLOR = " + min.color + " RATING = " + min.rating);
//	}
//}
//		for( Airconditioner x: acs) {
//			System.out.println("BRAND = "+x.brand+" PRICE = "+x.price+" COLOR = "+x.color+" RATING = "+x.rating);
//		}
//		}
//			
//		}
//		for( Airconditioner x: acs) {
//			if(x.color.equals("WHITE")) {
//				System.out.println("BRAND = "+x.brand+" PRICE = "+x.price+" COLOR = "+x.color+" RATING = "+x.rating);
//			}
//		}
//	}
//}     
		for (Airconditioner x : acs) {
			if (x.brand.length() % 2 == 0) {
				System.out.println("BRAND = " + x.brand.toUpperCase() + " PRICE = " + x.price + " COLOR = "
						+ x.color.toUpperCase() + " RATING = " + x.rating);
			}
		}
	}
}