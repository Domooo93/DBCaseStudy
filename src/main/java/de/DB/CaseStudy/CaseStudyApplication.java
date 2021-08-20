package de.DB.CaseStudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;
import java.util.ArrayList;


@SpringBootApplication
public class CaseStudyApplication {

	public static ArrayList<Betriebsstelle> betriebsstellen = new ArrayList<Betriebsstelle>();

	public static void main(String[] args) throws FileNotFoundException {
		SpringApplication.run(CaseStudyApplication.class, args);

		readCSV();
	}

	private static void readCSV() {
		try (BufferedReader br = new BufferedReader(new FileReader
				("./src/main/resources/csv_Datei/DBNetz-Betriebsstellenverzeichnis-Stand2021-07.csv"))) {
			String line;
			while ((line = br.readLine()) != null) {
				String[] values = line.split(";");
				betriebsstellen.add(new Betriebsstelle(values[0],values[1],values[2],values[3],values[4],values[5],
						values[6],values[7],values[8],values[9],values[10],values[11]));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
