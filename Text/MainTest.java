package Test;

import Utils.HammingUtils;
import Utils.SimHashUtils;
import Utils.TextUtils;

public class MainTest {
    public void origAndAllTest(){
        String[] str = new String[6];
        str[0] = TextUtils.readText("C:/test/orig.txt");
        str[1] = TextUtils.readText("C:/test/orig_0.8_add.txt");
        str[2] = TextUtils.readText("C:/test/orig_0.8_del.txt");
        str[3] = TextUtils.readText("C:/test/orig_0.8_dis_1.txt");
        str[4] = TextUtils.readText("C:/test/orig_0.8_dis_10.txt");
        str[5] = TextUtils.readText("C:/test/orig_0.8_dis_15.txt");
        String ansFileName = "D:/test/ansAll.txt";
        for(int i = 0; i <= 5; i++){
            double ans = HammingUtils.getSimilarity(SimHashUtils.getSimHash(str[0]), SimHashUtils.getSimHash(str[i]));
            TextUtils.writeText(ans, ansFileName);
        }
    }
}
