import java.util.ArrayList;
import java.util.Scanner;

public class sorting1 {
	static ArrayList<Integer> arr;
	static Scanner scan;
	
	static int n;
	
	public static void inputData() {
	
		arr = new ArrayList<Integer>();
		scan = new Scanner(System.in);
		
		System.out.println("masukkan panjang data: ");
		n = scan.nextInt();
		
		System.out.println(">> input datamu << ");
		for(int i=0; i<n; i++) {
			
			arr.add(scan.nextInt());
		}		
		System.out.println(">> berhasil diinput << ");
	}
	
	public static void exchangeSortAsc() {
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr.get(i)>arr.get(j)){
					temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
				
	}
	// yang bawah exchangeSortDsc
	public static void exchangeSortDsc() {
		int temp;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr.get(i)<arr.get(j)){
					temp = arr.get(i);
					arr.set(i, arr.get(j));
					arr.set(j, temp);
				}
			}
		}
				
	}
	
	public static void selectionSortDsc(){
		int temp;
		int indek;
		for(int i=0;i<n;i++){
			indek = i;
			for(int j=i+1;j<n;j++){
				if(arr.get(j)>arr.get(indek)){
					indek = j;
				}
			}
			if(indek!=i){
				temp = arr.get(i);
				arr.set(i, arr.get(indek));
				arr.set(indek, temp);
			}
		}
	}
	
	// yang selectionSortAsc
	public static void selectionSortAsc(){
		int temp;
		int indek;
		for(int i=0;i<n;i++){
			indek = i;
			for(int j=i+1;j<n;j++){
				if(arr.get(j)<arr.get(indek)){
					indek = j;
				}
			}
			if(indek!=i){
				temp = arr.get(i);
				arr.set(i, arr.get(indek));
				arr.set(indek, temp);
			}
		}
	}
	
	public static void bubbleSortDsc() {
		int temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr.get(j)<arr.get(j+1)){
					System.out.println("tukar data: " + arr.get(j) + " dan " + arr.get(j+1));
					temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
				
	}
	
	public static void bubbleSortDsc() {
		int temp;
		for(int i=0;i<n;i++){
			for(int j=0;j<n-1;j++){
				if(arr.get(j)>arr.get(j+1)){
					System.out.println("tukar data: " + arr.get(j) + " dan " + arr.get(j+1));
					temp = arr.get(j);
					arr.set(j, arr.get(j+1));
					arr.set(j+1, temp);
				}
			}
		}
				
	}
	
	public static void insertionSortAsc() {
		// BELUM dibuat males

				
	}
	
	
	public static void displayData(){
		if(arr.isEmpty()) {
			System.out.println("kosong..waduh...");
		}		
		else {
			System.out.println("Data ditampilkan seperti berikut: ");
			for(int i=0; i<arr.size(); i++) {
				
				System.out.println(arr.get(i));
			}
		}
	}

	public static void main(String[] args){
		inputData();
		bubbleSortDsc();
		displayData();
	}
}
