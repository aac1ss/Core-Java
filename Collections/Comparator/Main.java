import java.util.*;

class Main {
	public static void main(String[] args){
		Laptop r=new Laptop();
		r.setBrand("KHAI K");
		r.setRam(2);		
		r.setPrice(222);
		System.out.println("--------------------------------------------------");
		System.out.println("----------- Laptops Before Sorting ---------------");
		System.out.println("--------------------------------------------------");
		
		System.out.println("|\tBrand\t"+"\tRAM\t"+"\tPrice\t"+" |");
		List<Laptop> laps=new ArrayList<>();
		laps.add(r);
		laps.add(new Laptop("Hp",8,1200));
		laps.add(new Laptop("Apple",12,1800));
		laps.add(new Laptop("MSI",32,5200));
		laps.add(new Laptop("Dell",6,900));
		laps.add(new Laptop("Dell",64,5200));
		
		for(Laptop l:laps){
		
			System.out.println(l);
		
		}

		System.out.println("--------------------------------------------------");
		System.out.println("----------- Laptops After Sorting ---------------");
		System.out.println("--------------------------------------------------");
		
		Comparator<Laptop> con=new Comparator<Laptop>(){
			@Override
			public int compare(Laptop L1,Laptop L2){
				return L1.getBrand().compareTo(L2.getBrand());
				
				}
				}

		Collections.sort(laps,con);

	//	Collections.sort(laps,Comparator.comparingInt(Laptop::getRam));
	for(Laptop l:laps){
		
			System.out.println(l);
	}	
	