import java.math.BigDecimal;
import java.util.Random;

public class getPoints {
    public String[] getPoint(int num){
        Random random = new Random();
        BigDecimal two = new BigDecimal(random.nextDouble());
        double point = two.setScale(1,BigDecimal.ROUND_HALF_UP).doubleValue();
        int integer = random.nextInt(num);//随机获得整数
        String[] strings = new String[3];//用来存储分数与分母
        strings[0] = String.valueOf(integer);//获得整数部分
        strings[1] = "'";
        int numerator,denominator;//定义分子分母
        numerator = (int)(point * 10);
        denominator = 10;
        int divisor = 1;//公约数
        if(numerator != 0)
            divisor = getPointTest.findDivisor(denominator,numerator);
        String s;
        if((numerator/divisor) == 0)
        s = "0/1";
        else
            s = (numerator/divisor)+"/"+(denominator/divisor);
        strings[2] = s;
        return strings;
    }
}
