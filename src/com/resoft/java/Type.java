package com.resoft.java;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * @author Dshy
 * @ClassName: Type
 * @Description: 数据类型学习
 * @date 2020.01.17
 * @modified By:Dshy
 */
public class Type {
    /**变量**/
    /**整型**/
    private int aInt;
    private short aShort;
    private long aLong;
    private byte aByte;

    /**浮点型
     * 不适用于精禁止出现舍入误差的计算，如2.0-1.1=0.8999999999999非0.9
     * **/
    /**有效位数6-7位**/
    private float aFloat;
    /**有效位数15位**/
    private double aDouble;

    /**char型
     * 建议不要在程序中使用
     * **/
    private char aChar;

    /**boolean型
     * java中不能和数值型进行相互转换
     * **/
    private boolean aBoolean;

    /**不提倡一行中声明多个变量
     * 声明尽量放在变量第一次使用的地方
    */

    /**常量
     * final表示  表示该变量只能被赋值一次
     * 常量名全大写
     * **/
    /**static final 表示类常量 */
    private static final int PUBLIC_NUMBER=1;

    /**自增量
     * n++  先赋值后计算
     * ++n  先计算后赋值
     * 不建议在表达式内部使用++
     * */


    /**字符串
     * 不能对字符串中的字符进行单独修改
     * */
    private String aString;

    public static void main(String[] args) {
        Type type=new Type();
        type.aString();




    }

    public void aString(){
        aString="ABC";
        /**substring
         * 返回值为new String ，新建一个子串
         * */
        aString.substring(0,2);
        /**concat拼接
         * +左右可以为null，concat左右均不能为null，为会空指针
         * +号编译后就是使用了StringBuiler来拼接，所以一行+的语句就会创建一个StringBuilder
         * */
        String x=aString.concat(aString);
        String y=aString+aString;
        /**length、codePointCount
         * length返回字符串的代码单元数量，大多数字符占用一个代码单元，但是辅助字符占用两个代码单元
         * codePointCount返回代码点的数量,实际长度
         * 两者可能不相等
         * */
        aString.length();
        aString.codePointCount(0,aString.length());
        /**常用API*/
        /** char charAt(int index);
         *  返回给定位置的代码单元。除非对底层的代码单元感兴趣，否则不需要调用这个方法。
         */
        /** int codePointAt(int index);
         *  返回从给定位置开始或结束的代码点。
         */
        /** int offsetByCodePoints(int startIndex,int cpCount);
         *  返回从startIndex代码点开始，位移cpCount后的代码点索引。
         */
        /** int compareTo(String other);
         *  按照字典顺序，如果字符串位于other之前，返回一个负数；如果字符串位于other之后，返回一个正数；如果两个字符串相等，返回0。
         */
        /** char endsWith(int index);
         *  返回给定位置的代码单元。除非对底层的代码单元感兴趣，否则不需要调用这个方法。
         */
        /** boolean endsWith(String suffix);
         *  如果字符串以 suffix 结尾，返回 true。
         */
        /** boolean equals(Object other);
         *  如果字符串与other相等，返回true。
         */
        /** boolean equalsIgnoreCase(Object other);
         *  如果字符串与other相等(忽略大小写)，返回true。
         */
        /** int indexOf(String str);
         *  int indexOf(String str, int fromIndex)
         *  int indexOf(int cp)
         *  int indexOf(int cp, int fromIndex)
         *  返回与字符串 str 或代码点 cp 匹配的第一个子串的开始位置。这个位置从索引 0 或 fromIndex 开始计算。如果在原始串中不存在 str，返回 –1
         */
        /** int lastIndexOf(String str);
         *  int lastIndexOf(String str, int fromIndex)
         *  int lastIndexOf(int cp)
         *  int lastIndexOf(int cp, int fromIndex)
         *  返回与字符串 str 或代码点 cp 匹配的最后一个子串的开始位置。这个位置从索引 0 或 fromIndex 开始计算。如果在原始串中不存在 str，返回 –1
         */
        /** String replace(CharSequence oldString,CharSequence newString);
         *  返回一个新字符串。这个字符串用 newString 代替原始字符串中所有的 oldString。可用 String 或 StringBuilder 对象作为 CharSequence 参数。
         */
        /** boolean startsWith(String prefix);
         *  如果字符串以 preffix 字符串开始，返回 true。
         */
        /** String trim();
         *  返回一个新字符串。这个字符串将删除了原始字符串头部和尾部的空格。
         */

        /**StringBuilder、StringBuffer
         * StringBuffer线程安全，效率稍低，但是可以多线程操作
         * StringBuilder线程不安全，用于单线程编辑，速度快
         * 对于经常修改的内容，不建议采用String
         */
        StringBuilder stringBuilder=new StringBuilder();
        StringBuffer stringBuffer=new StringBuffer();
        /**输出
         * %n$s   n为第n个参数  参数索引值
         * %1$s   第一个参数值   %2$tB  第二个参数值
         */
        System.out.printf("%1$s %2$tB %2$te, %2$tY","Date:",new Date());
        /**大数值
         * BigInteger（整数运算） 和 BigDecimal（浮点数运算）
         * 没法使用+，-，*，/。需要使用大数值类中的方法
         */
        BigDecimal bigDecimal=BigDecimal.valueOf(1.445);
        BigInteger bigInteger=BigInteger.valueOf(100);






    }

}
