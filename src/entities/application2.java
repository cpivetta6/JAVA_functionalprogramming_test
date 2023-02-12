package entities;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class application2 {

	public static void main(String[] args) {
		
		
		try (BufferedReader br = new BufferedReader(new FileReader("c:\\pregister.txt"))){
			
			List<Product> products = new ArrayList<Product>();
			List<Client> clients = new ArrayList<Client>();
			
			String line = br.readLine();
			while(line != null) {
				String[] fields = line.split(",");
				clients.add(new Client(fields[0], fields[1]));
				products.add(new Product(Double.parseDouble(fields[3]), fields[2]));
				line = br.readLine();
				
			}
			
			Map<Client, Product> list = new HashMap<Client, Product>();
			
			for(Client c : clients) {
				
			}
			
			int i = 0;
			while(i < clients.size()) {
				list.put(clients.get(i), products.get(i)); 
				i++;
			}
			
			list.forEach((key, value) -> System.out.println("Client: " + key.getName() +" email: "+ key.getEmail() +
															", Product: " + value.getName() + ": " + value.getPrice()));
			
			
			
			
		}catch (IOException e) {
			System.out.println("Error"+ e.getStackTrace());
		}
		
		
		
		
	}
	
}
