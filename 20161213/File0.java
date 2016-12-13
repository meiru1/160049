import java.io.*;

public class File {
	public static void main(String[] args ){
		try {
			File inFile = new File("data.txt");
			FileReader fr = new FileReader(inFile);
			BufferedReader br = new BufferedReader(fr);

			String line = br.readLine();
			System.out.println(line);

			br.clpse();
		} catch (IOException e) {
				System.out.println("era-");
		}
	}
}

