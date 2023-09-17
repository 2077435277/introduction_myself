import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readTitle {
    public void readTitle() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("F:\\DeskTop\\结对作业\\ExerciseText.txt"));
        String s;
        while((s = bf.readLine() ) != null){
            System.out.println(s);
        }
        bf.close();
    }
}
