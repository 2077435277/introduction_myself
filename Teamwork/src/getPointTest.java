import org.junit.Test;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.Formatter;
public class getPointTest {
    @Test
    public void getPointTest(){
        Random random = new Random();
        BigDecimal two = new BigDecimal(random.nextDouble());
        double point = two.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        int integer = random.nextInt(10);
        String[] arr = new String[2];//用来存储分数与分母
        arr[0] = String.valueOf(integer);//获得整数部分
        int numerator,denominator;//定义分子分母
        numerator = (int)(point * 10);
        denominator = 10;
        int divisor = 1;//公约数
        if(numerator != 0)
        divisor = findDivisor(denominator,numerator);
        String s;
        if((numerator/divisor) == 0)
            s = "";
        else
            s = "'"+(numerator/divisor)+"/"+(denominator/divisor);
        arr[1] = s;
        System.out.println(findDivisor(2,4));
        return ;
    }
    public static int findDivisor(int m,int n){
        int x = Math.max(m,n);
        int y = Math.min(m,n);
        while (y!=0)
        {
            int a = x % y;
            x = y;
            y = a;
        }
        return x;
    }
}
