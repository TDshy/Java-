package com.resoft.java;

/**
 * @author Dshy
 * @ClassName: Type
 * @Description: 数据类型学习
 * @date 2020.01.17
 * @modified By:Dshy
 */
public class Type {
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
    public static void main(String[] args) {

    }

}
