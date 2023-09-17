import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class CreatTitleFileText {
    @Test
    public static void creatTitle() throws IOException {
        File file = new File("F:\\DeskTop\\结对作业\\AnswerText.txt");
        file.createNewFile();
    }
    @Test
    public void writeTitle() throws IOException {
        PrintStream printStream = new PrintStream("F:\\DeskTop\\结对作业\\ExerciseText.txt");
        String s = "陈卓怡我非常爱你2";
        String s1 = "陈卓怡我非常爱你3";
        printStream.println(s);
        printStream.flush();
        printStream.println(s1);
        printStream.close();
    }
}
