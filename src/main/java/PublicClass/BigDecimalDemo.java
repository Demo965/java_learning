package PublicClass;

import java.math.BigDecimal;

public class BigDecimalDemo {
    public static void main(String[] args) {
//        //方式1.创建对象
//        BigDecimal bigDecimal1 = new BigDecimal("5.0");//这里必须传字符串
//        BigDecimal bigDecimal2 = new BigDecimal("4.9");
//        BigDecimal result = bigDecimal1.subtract(bigDecimal2);
//        System.out.println(result.toString());

        //方式2：
        BigDecimal bigDecimal1 = BigDecimal.valueOf(5.0);
        BigDecimal bigDecimal2 = BigDecimal.valueOf(4.9);
        BigDecimal result = bigDecimal1.subtract(bigDecimal2);
        System.out.println(result);
    }
}
