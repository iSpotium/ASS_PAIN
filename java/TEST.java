import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TEST {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TestString ts = new TestString();
		List<String> ovString = new ArrayList();
		
		String tesStr1 = "Oven : POWER_CONSUMPTION=1000, WEIGHT=10, CAPACITY=32, DEPTH=60, HEIGHT=45.5, WIDTH=59.5";
		String tesStr2 = "Oven : POWER_CONSUMPTION=1500, WEIGHT=12, CAPACITY=33, DEPTH=60, HEIGHT=45, WIDTH=68";
		String tesStr3 = "Oven : POWER_CONSUMPTION=2000, WEIGHT=11, CAPACITY=33, DEPTH=60, HEIGHT=40, WIDTH=70";
		
		ovString.add(tesStr1);
		ovString.add(tesStr2);
		ovString.add(tesStr3);
		
		List<Oven> ovList = new ArrayList();
		String[] temp = null;
		for(String i : ovString) {
			temp = ts.splitString(i);
			ovList.add(ts.initOven(temp));
		}
		
		ts.printObj(ovList);
		
		
}

}

/*
 * List<String> text = new ArrayList<>();
 * 
 * try { File file = new File("D:\\WorkSpace\\appliances_db.txt"); FileReader fr
 * = new FileReader(file); BufferedReader bf = new BufferedReader(fr); String
 * line = bf.readLine(); text.add(line);
 * 
 * while (line != null) { line = bf.readLine(); text.add(line); } bf.close(); }
 * catch (FileNotFoundException e) { e.printStackTrace(); } catch (IOException
 * e) { e.printStackTrace(); } text.remove(text.size() - 1);
 * 
 * for(int i = 0; i < text.size(); i++) { System.out.println(text.get(i));
 */
////////////////////////////////////////////////////////////////////////////////////////////////////////

/*
 * List<String> ovenList = new ArrayList<>(); //String temp = "Oven "; for (int
 * i = 0; i < text.size(); i++) { if(text.get(i).contains(temp)){
 * ovenList.add(text.get(i));
 * 
 * }
 */

// System.out.println(l);
// String l = text.get(i);
// System.out.println(l);
// for (int j = 0; j < ovenList.size(); j++) {
// System.out.println(ovenList.size());
