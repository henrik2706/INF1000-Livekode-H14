
public class Bondegard {
	private Gris[] grisebinge = new Gris[10];
	private Hest[] stall = new Hest[5];
	private Ku[] fjos = new Ku[30];
	
	void settInnGris(Gris g){
		for(int i = 0; i < grisebinge.length; i++){
			if(grisebinge[i] == null){
				grisebinge[i] = g;
				break;
			}
		}
		if(grisebinge[grisebinge.length-1] != null){
			System.out.println("Bingen er fullt");
		}
	}
	
	void settInnHest(Hest h){
		for(int i = 0; i < stall.length; i++){
			if(stall[i] == null){
				stall[i] = h;
				break;
			}
		}
		if(stall[stall.length-1] != null){
			System.out.println("Stallen er fullt");
		}
	}
	
	void settInnKu(Ku k){
		for(int i = 0; i < fjos.length; i++){
			if(fjos[i] == null){
				fjos[i] = k;
				break;
			}
		}
		if(fjos[fjos.length-1] != null){
			System.out.println("Fjoset er fullt");
		}
	}

	void selgDyr(String type, int antall){
		if(type.equalsIgnoreCase("gris")){
			for(int i = 0; i < grisebinge.length; i++){
				if(grisebinge[i] != null && antall != 0){
					System.out.println("Solgte en gris");
					grisebinge[i] = null;
					antall--;
				}
			}
		}
		
		if(type.equalsIgnoreCase("hest")){
			for(int i = 0; i < stall.length; i++){
				if(stall[i] != null && antall != 0){
					System.out.println("Solgte en hest");
					stall[i] = null;
					antall--;
				}
			}
		}
		
		if(type.equalsIgnoreCase("ku")){
			for(int i = 0; i < fjos.length; i++){
				if(fjos[i] != null && antall != 0){
					System.out.println("Solgte en ku");
					fjos[i] = null;
					antall--;
				}
			}
		}
	}
}








