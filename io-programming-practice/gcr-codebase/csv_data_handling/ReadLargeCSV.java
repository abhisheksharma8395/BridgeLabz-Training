package csv_data_handling;

import com.opencsv.CSVReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSV {
    public static void main(String[] args) throws Exception {
        String filePath = "io-programming-practice/gcr-codebase/csv_data_handling/large.csv";
        int chunkSize = 100;
        int totalCount = 0;

        try (CSVReader reader = new CSVReader(new FileReader(filePath))) {
            List<String[]> chunk = new ArrayList<>(chunkSize);
            String[] nextLine;

            while ((nextLine = reader.readNext()) != null) {
                chunk.add(nextLine);

                if (chunk.size() == chunkSize) {
                    totalCount += chunk.size();
                    System.out.println("Processed: " + totalCount + " records");
                    chunk.clear();
                }
            }

            if (!chunk.isEmpty()) {
                totalCount += chunk.size();
                System.out.println("Processed: " + totalCount + " records (final)");
            }
        }
    }
}

