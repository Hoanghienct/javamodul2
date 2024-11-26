package ss16;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryCSVReader {


        public static List<Country> readCountriesFromCSV(String filePath) {
            List<Country> countries = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;

                while ((line = br.readLine()) != null) {
                    String[] values = line.split(",");

                    // Loại bỏ dấu ngoặc kép xung quanh các giá trị nếu có
                    int id = Integer.parseInt(values[0].trim());
                    String code = values[1].replace("\"", "").trim();
                    String name = values[2].replace("\"", "").trim();

                    Country country = new Country(id, code, name);
                    countries.add(country);
                }
            } catch (IOException e) {
                System.err.println("Lỗi khi đọc file: " + e.getMessage());
            }

            return countries;
        }

        public static void main(String[] args) {
            String filePath = "D:\\java_modul2\\ss16\\csv.csv"; // Thay thế đường dẫn thực tế của file CSV

            List<Country> countries = readCountriesFromCSV(filePath);

            System.out.println("Danh sách các quốc gia:");
            for (Country country : countries) {
                System.out.println(country);
            }
        }

    }

