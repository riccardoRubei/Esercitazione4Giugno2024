package designPatterns;

public class singletonMain {

	public static void main(String[] args) {

		FileManager manager = new FileManager("result.txt");

		String data = manager.readData();
		System.out.println(data);
		manager.writeData(data+"Nuova Stringa");
		
		manager = new FileManager("anotherResult.txt");
	}

}
