package birds;

import java.io.*;
import java.util.List;
import java.io.File;

public class BirdsWriter {

    private Writer writer ;

    public void writeToFile(final List<Bird> birdList) {

        try {
            File file = new File("E:\\foo\\work71/list.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            OutputStream stream = new FileOutputStream(file);
            writer = new PrintWriter(stream);
            for (Bird bird : birdList) {
                writer.write(bird.getHeaders());
                writer.write(bird.toCSV());

            }
            writer.close();

        } catch(IOException e){
            e.getStackTrace();

        }
    }
}

