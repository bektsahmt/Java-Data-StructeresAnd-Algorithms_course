package HashTables;

public class Main {

	public static void main(String[] args) {
		
		HashTable myHashTable = new HashTable();

        myHashTable.printTable();
        
        System.out.println("------------------");
        
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.set("lumber", 80);
        myHashTable.set("bolts", 200);
        myHashTable.set("screws", 140);

        myHashTable.printTable();
        
        System.out.println("----------------------------");
        
        
        System.out.println("Lumber:");
        System.out.println( myHashTable.get("lumber") );
        
        System.out.println("\nTape:");
        System.out.println( myHashTable.get("tape") );
        
        System.out.println("---------------------------");
        
        System.out.println(myHashTable.keys());

	}

}
