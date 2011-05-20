/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dbtest;

import java.sql.SQLException;

/**
 *
 * @author andrey
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        String s1 = "";
        String s2 = "123";
        String s3 = "12345";
        String s4 = "123456";

        System.out.println("String test 1: "+validator.isEmpty(s1));
        System.out.println("String test 2: "+validator.isEmpty(s2));
        System.out.println("String test 3: "+validator.validateString(s3, 5));
        System.out.println("String test 4: "+validator.validateString(s4, 5));
        System.out.println("================");

        String int1 = "123";
        String int2 = " 123";
        String int3 = "123 ";
        String int4 = " 123 ";
        String int5 = "";
        String int6 = " 123b ";
        String int7 = " 123 123 ";


        System.out.println("Integer test 1: "+validator.validateInteger(int1));
        System.out.println("Integer test 2: "+validator.validateInteger(int2));
        System.out.println("Integer test 3: "+validator.validateInteger(int3));
        System.out.println("Integer test 4: "+validator.validateInteger(int4));
        System.out.println("Integer test 5: "+validator.validateInteger(int5));
        System.out.println("Integer test 6: "+validator.validateInteger(int6));
        System.out.println("Integer test 7: "+validator.validateInteger(int7));
        int test = Integer.parseInt(int1);
        System.out.println("Integer test 8: "+Integer.toString(test));

        System.out.println("================");

        String float1 = "123";
        String float2 = " 123.";
        String float3 = "123.123";
        String float4 = " 12d. 23124 ";
        String float5 = "123 23.321 ";
        String float6 = " 23213.234.34";
        String float7 = ".214";


        System.out.println("Float test 1: "+validator.validateFloat(float1));
        System.out.println("Float test 2: "+validator.validateFloat(float2));
        System.out.println("Float test 3: "+validator.validateFloat(float3));
        System.out.println("Float test 4: "+validator.validateFloat(float4));
        System.out.println("Float test 5: "+validator.validateFloat(float5));
        System.out.println("Float test 6: "+validator.validateFloat(float6));
        System.out.println("Float test 7: "+validator.validateFloat(float7));
        System.out.println("================");

        String emial1 = "a1stek11@xakep.ru";
        String emial2 = " a s1 te @ xakep . ru";
        String emial3 = "ast1ek@xakep.ru";
        String emial4 = "as12tekxakep.ru";
        String emial5 = "1astek12@xakepru";
        String emial6 = "a@xakep.ru";

        System.out.println("Mail test 1: "+validator.validateEmail(emial1));
        System.out.println("Mail test 2: "+validator.validateEmail(emial2));
        System.out.println("Mail test 3: "+validator.validateEmail(emial3));
        System.out.println("Mail test 4: "+validator.validateEmail(emial4));
        System.out.println("Mail test 5: "+validator.validateEmail(emial5));
        System.out.println("Mail test 6: "+validator.validateEmail(emial6));
        System.out.println("================");


        System.out.println("String protect test");
        System.out.println("SELECT   \"user\".fio,  client.fio FROM  public.client WHERE  renta.user_id = \'user\'.id ");
        System.out.println(validator.protectString("SELECT   \"user\".fio,  client.fio FROM  public.client WHERE  renta.user_id = \'user\'.id "));

        SendMail mail = new SendMail("ahtung999@inbox.ru", "test post message", "Test message<br>test");
        mail.sendSSLEmail();
    }

}
