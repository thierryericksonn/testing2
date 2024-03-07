/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator1;

/**
 *
 * @author Admin
 */
public class Processkalkulator {
    int operator=0;
    double number1,number2,number3,result;
    
    String Iprocess;
    
    public void setNumber (String opr){
        if(!opr.equals("")){
            if(operator==0){
                number1=Double.valueOf(opr);
            }else{
                number2=Double.valueOf(opr);
            }
        }
    }
    public void setOperator(int operator){
        this.operator=operator;
    }
    public double getResult(){
        return result;
    }
    public void setResult(double hasil){
        this.result = hasil;
    }
    public void process(){
        switch(operator){
            case 1:
                result = number1+number2;
                Iprocess="+";
                break;
            case 2:
                result = number1 - number2;
                Iprocess="-";
                break;
            case 3:
                result = number1 * number2;
                Iprocess="*";
                break;
            case 4:
                result = number1 / number2;
                Iprocess="/";
                break;
        }
        number3 = number1;
    number1 = result;
    }
}
