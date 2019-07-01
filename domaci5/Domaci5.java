package domaci5;

import java.util.Scanner;

public class Domaci5 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int id=1;
		int j=0;
		boolean popustUto=false, popustCet=false;
		double popUto=0,popCet=0;
		String konacniRacun=" ";
		System.out.println("koji je dan?");
		String dan=s.next();
		int racun=0;
		System.out.println("unesi broj pica i idjeve pica");
		int unos=s.nextInt();
		int idPice;
		while(unos!=-1) {
			konacniRacun+=("\nRacun za musteriju id"+id);
			j++;
			for(int i=1;i<=unos;i++) {
				idPice=s.nextInt();
				switch(idPice) {
					case 2: if(i%4==0) {konacniRacun+=("\nAKCIJA 3+1    Capricciosa 0");}
					        if(j==7) {konacniRacun+=("\nAKCIJA #7    Capricciosa 0");j=0;}
					        else {konacniRacun+=("\nPizza   Capricciosa 320");racun+=320;}
					        if((dan).equalsIgnoreCase("cet")) {popustCet=true; popCet+=320*0.10;}
					        break;
					case 3: if(i%4==0) {konacniRacun+=("\nAKCIJA 3+1    Pepperoni 0");}
					        if(j==7) {konacniRacun+=("\nAKCIJA #7    Pepperoni 0");j=0;}
					        else {konacniRacun+=("\nPizza   Pepperoni 290");racun+=290;}
					        break;
					case 5: if(i%4==0) {konacniRacun+=("\nAKCIJA 3+1    Vesuvio 0");}
					        if(j==7) {konacniRacun+=("\nAKCIJA #7    Vesuvio 0");j=0;}
					        else {konacniRacun+=("\nPizza    Vesuvio 320");racun+=320;}
					        if((dan).equalsIgnoreCase("uto")) {popustUto=true; popUto+=320*0.10;}
					        break;
			     }
		    }   
			
			konacniRacun+=("            \nUkupno: "+racun);
		    
			if(((dan).contentEquals("sub")) || ((dan).contentEquals("ned"))) {
				racun-=racun*0.15;
				konacniRacun+=("\nDNEVNA 15% SVE      -"+racun*0.15);
				
			}
				if (popustUto==true) {konacniRacun+=("\nDNEVNA 10%    Vesuvio -"+popUto);racun-=popUto;}
				if (popustCet==true) {konacniRacun+=("\nDNEVNA 10%    Capricciosa -"+popCet);racun-=popCet;}
				konacniRacun+=("           \nUkupno:"+racun+"\n-----------------------------");
			
			unos=s.nextInt();
		    id++;
		    popUto=0;
		    popCet=0;
		    racun=0;
	    }
		System.out.println(konacniRacun);
		
   }
}





