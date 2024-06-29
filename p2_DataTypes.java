import java.nio.charset.StandardCharsets;

public class p2_DataTypes
{
    /* There are two types of Data types (Primitive and Non-Primitive Data types )
    Primitive Data Types
    |
    |------Boolean---->boolean
    |
    |-----Numeric
            |
            |-----Character------->char
            |
            |-----Intergral
                    |
                    |------Integer---->(byte_1b,short_2b,int_4b,long_8b)
                    |
                    |-----Floating Point----->(float_4,double_8)

    Non_primitives Data types
    |
    |-------strings, arrays,objects etc

     */

    public static void main(String[] args) {
        boolean b= true;
        char charVar='d';
        int myintNum= 25; // declaration and initialization both

        short shortVar= 10000;// short can take only this much value
        long longVar= 1000000000;// long can take that much value

        float floatVar=10000f ;

        String stVar= "Jai";

        System.out.println(stVar.concat("Hello"));
    }



}
