package PublicClass;

import com.sun.imageio.plugins.jpeg.JPEGStreamMetadataFormat;

public class Type {

    public static void main(String[] args) {
        int i =10;
        Integer integer = i;//自动装箱
        int j = integer;//自动拆箱
        Integer integer1 = 128;
        Integer integer2 = 128;
        System.out.println(integer1==integer2);
    }
}
