
package trabalhpronto;

import java.util.Scanner;

public class Trabalhpronto {


    public static void main(String[] args) {
        Scanner in = new Scanner (System.in); 
        
        String palavra; //String usada para guardar a(s) palavras
        System.out.println("Digite abaixo:"); //solicita a(s) palavras
        palavra = in.nextLine(); //onde o usuario irá definir as palavras
        char[] letra = palavra.toCharArray(); // onde será convertido em char
        int letlarg = 6; // largura das letras grandes 
        int letalt = 5; // atltura das letras grandes
        int tmn =letra.length * letlarg;  // tamanho da(s) palavra(s)
        char [][] letid = new char[letalt][]; // ident. das letras definidas
        char [][] bigletter= new char[letalt][tmn];  //caracter da let.gran.
         
        for(int i = 0;i<letra.length;i++){   // função que identifica todas os caracteres existentes em cada pos   
            if(letra[i]=='a'){
              letid = letraA();
            }else if(letra[i]=='b'){
               letid = letraB();
            }else if(letra[i]=='c'){
               letid = letraC();
            }else if(letra[i]=='d'){
               letid = letraD();
            }else if(letra[i]=='e'){
               letid = letraE();
            }else if(letra[i]=='f'){
               letid = letraF();
            }else if(letra[i]=='g'){
               letid = letraG();
            }else if(letra[i]=='h'){
               letid = letraH();
            }else if(letra[i]=='i'){
               letid = letraI();
            }else if(letra[i]=='j'){
               letid = letraJ();
            }else if(letra[i]=='k'){
               letid = letraK();
            }else if(letra[i]=='l'){
               letid = letraL();
            }else if(letra[i]=='m'){
               letid = letraM();
            }else if(letra[i]=='n'){
               letid = letraN();
            }else if(letra[i]=='o'){
               letid = letraO();
            }else if(letra[i]=='p'){
               letid = letraP();
            }else if(letra[i]=='q'){
               letid = letraQ();
            }else if(letra[i]=='r'){
               letid = letraR();
            }else if(letra[i]=='s'){
               letid = letraS();
            }else if(letra[i]=='t'){
               letid = letraT();
            }else if(letra[i]=='u'){
               letid = letraU();
            }else if(letra[i]=='v'){
               letid = letraV();
            }else if(letra[i]=='w'){
               letid = letraW();
            }else if(letra[i]=='x'){
               letid = letraX();
            }else if(letra[i]=='y'){
               letid = letraY();
            }else if(letra[i]=='z'){
               letid = letraZ();
            }else if(letra[i]=='0'){
               letid = num0();
            }else if(letra[i]=='1'){
               letid = num1();
            }else if(letra[i]=='2'){
               letid = num2();
            }else if(letra[i]=='3'){
               letid = num3();
            }else if(letra[i]=='4'){
               letid = num4();
            }else if(letra[i]=='5'){
               letid = num5();
            }else if(letra[i]=='6'){
               letid = num6();
            }else if(letra[i]=='7'){
               letid = num7();
            }else if(letra[i]=='8'){
               letid = num8();
            }else if(letra[i]=='9'){
               letid = num9();
            }
            else{
                letid = esp();
            }
             // define as letras 
            for(int f=0;f<letalt;f++){
                for(int a=0;a<letlarg;a++){
                bigletter[f][i*letid[0].length+a]=letid[f][a];
                }
            }
        }
        for(int i=0;i<letalt;i++){
            System.out.println(bigletter[i]);
    }   
}
    
    
    public static char[][] letraA(){
        char[][]letraA = {{'X','X','X','X','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '}};
        return letraA;
    }
    public static char[][] letraB(){
        char[][]letraB = {{'X','X','X','X',' ',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X',' ',' '}};
        return letraB;
    }
    public static char[][] letraC(){
        char[][]letraC ={{'X','X','X','X','X',' '},
                         {'X',' ',' ',' ',' ',' '},
                         {'X',' ',' ',' ',' ',' '},
                         {'X',' ',' ',' ',' ',' '},
                         {'X','X','X','X','X',' '}};
        return letraC;
    }
    public static char[][] letraD(){
        char[][]letraD = {{'X','X','X','X',' ',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X',' ',' '}};
        return letraD;
    }
    public static char[][] letraE(){
        char[][]letraE = {{'X','X','X','X','X',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X','X','X','X','X',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X','X','X','X','X',' '}};
        return letraE;
    }
    public static char[][] letraF(){
        char[][]letraF = {{'X','X','X','X','X',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X','X','X','X',' ',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X',' ',' ',' ',' ',' '}};
        return letraF;
    }
    public static char[][] letraG(){
        char[][]letraG = {{'X','X','X','X','X',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X',' ','X','X','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '}};
        return letraG;
    }
    public static char[][] letraH(){
        char[][]letraH = {{'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '}};
        return letraH;
    }
    public static char[][] letraI(){
        char[][]letraI = {{'X','X','X','X','X',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ',' ','X',' ',' ',' '},
                          {'X','X','X','X','X',' '}};
        return letraI;
    }
    public static char[][] letraJ(){
        char[][]letraJ = {{' ',' ','X','X','X',' '},
                          {' ',' ',' ','X',' ',' '},
                          {' ',' ',' ','X',' ',' '},
                          {'X',' ',' ','X',' ',' '},
                          {'X','X','X','X',' ',' '}};
        return letraJ;
    }
    public static char[][] letraK(){
        char[][]letraK = {{'X',' ',' ',' ','X',' '},
                          {'X',' ',' ','X',' ',' '},
                          {'X','X','X',' ',' ',' '},
                          {'X',' ',' ','X',' ',' '},
                          {'X',' ',' ',' ','X',' '}};
           return letraK;
    }
    public static char[][] letraL(){
        char[][]letraL = {{'X',' ',' ',' ',' ',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X','X','X','X','X',' '}};  
        return letraL;
    }
    public static char[][] letraM(){
        char[][]letraM = {{'X',' ',' ',' ','X',' '},
                          {'X','X',' ','X','X',' '},
                          {'X',' ','X',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '}};  
        return letraM;
    }
    public static char[][] letraN(){
        char[][]letraN = {{'X',' ',' ',' ','X',' '},
                          {'X','X',' ',' ','X',' '},
                          {'X',' ','X',' ','X',' '},
                          {'X',' ',' ','X','X',' '},
                          {'X',' ',' ',' ','X',' '}};  
        return letraN;
    }
    public static char[][] letraO(){
        char[][]letraO = {{' ','X','X','X',' ',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {' ','X','X','X',' ',' '}}; 
        return letraO;
    }
    public static char[][] letraP(){
       char[][]letraP =  {{'X','X','X','X','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X',' ',' ',' ',' ',' '}};
        return letraP;
    }
    public static char[][] letraQ(){
        char[][]letraG = {{'X','X','X','X','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '},
                          {' ',' ',' ',' ','X',' '}};
        return letraG;
    }
    public static char[][] letraR(){
        char[][]letraR = {{'X','X','X','X','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '},
                          {'X',' ','X',' ',' ',' '},
                          {'X',' ',' ','X','X',' '}};
        return letraR;
    }
    public static char[][] letraS(){
        char[][]letraS = {{'X','X','X','X','X',' '},
                          {'X',' ',' ',' ',' ',' '},
                          {'X','X','X','X','X',' '},
                          {' ',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '}};
        return letraS;
    }
    public static char[][] letraT(){
        char[][]letraT = {{'X','X','X','X','X',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ',' ','X',' ',' ',' '}};
        return letraT;
    }
    public static char[][] letraU(){
        char[][]letraU = {{'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X','X','X','X','X',' '}};
        return letraU;
    }
    public static char[][] letraV(){
        char[][]letraV = {{'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {'X',' ',' ',' ','X',' '},
                          {' ','X',' ','X',' ',' '},
                          {' ',' ','X',' ',' ',' '}};
        return letraV;
    }
    public static char[][] letraW(){
        char[][]letraW = {{'X',' ','X',' ','X',' '},
                          {'X',' ','X',' ','X',' '},
                          {'X',' ','X',' ','X',' '},
                          {'X',' ','X',' ','X',' '},
                          {' ','X',' ','X',' ',' '}};
        return letraW;
    }
    public static char[][] letraX(){
        char[][]letraX = {{'X',' ',' ',' ','X',' '},
                          {' ','X',' ','X',' ',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ','X',' ','X',' ',' '},
                          {'X',' ',' ',' ','X',' '}};
        return letraX;
    }
    public static char[][] letraY(){
        char[][]letraY = {{'X',' ',' ',' ','X',' '},
                          {' ','X',' ','X',' ',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ','X',' ',' ',' ',' '},
                          {'X',' ',' ',' ',' ',' '}};
        return letraY;
    }
    public static char[][] letraZ(){
        char[][]letraZ = {{'X','X','X','X','X',' '},
                          {' ',' ',' ','X',' ',' '},
                          {' ',' ','X',' ',' ',' '},
                          {' ','X',' ',' ',' ',' '},
                          {'X','X','X','X','X',' '}};
        return letraZ;
    }
    public static char[][] num0(){
        char[][]num0 = {{'X','X','X','X','X',' '},
                        {'X',' ',' ',' ','X',' '},
                        {'X',' ',' ',' ','X',' '},
                        {'X',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '}};
        return num0;
    }
    public static char[][] num1(){
        char[][]num1 = {{'X','X','X',' ',' ',' '},
                        {' ',' ','X',' ',' ',' '},
                        {' ',' ','X',' ',' ',' '},
                        {' ',' ','X',' ',' ',' '},
                        {'X','X','X','X','X',' '}};
        return num1;
    }
    public static char[][] num2(){
        char[][]num2 = {{'X','X','X','X','X',' '},
                        {' ',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '},
                        {'X',' ',' ',' ',' ',' '},
                        {'X','X','X','X','X',' '}};
        return num2;
    }
    public static char[][] num3(){
        char[][]num3 = {{'X','X','X','X','X',' '},
                        {' ',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '},
                        {' ',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '}};
        return num3;
    }
    public static char[][] num4(){
        char[][]num4 = {{'X',' ',' ',' ','X',' '},
                        {'X',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '},
                        {' ',' ',' ',' ','X',' '},
                        {' ',' ',' ',' ','X',' '}};
        return num4;
    }
    public static char[][] num5(){
        char[][]num5 = {{'X','X','X','X','X',' '},
                        {'X',' ',' ',' ',' ',' '},
                        {'X','X','X','X','X',' '},
                        {' ',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '}};
        return num5;
    }
    public static char[][] num6(){
        char[][]num6 = {{'X','X','X','X','X',' '},
                        {'X',' ',' ',' ',' ',' '},
                        {'X','X','X','X','X',' '},
                        {'X',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '}};
        return num6;
    }
    public static char[][] num7(){
        char[][]num7 = {{'X','X','X','X','X',' '},
                        {' ',' ',' ','X',' ',' '},
                        {' ',' ','X',' ',' ',' '},
                        {' ','X',' ',' ',' ',' '},
                        {'X',' ',' ',' ',' ',' '}};
        return num7;
    }
    public static char[][] num8(){
        char[][]num8 = {{'X','X','X','X','X',' '},
                        {'X',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '},
                        {'X',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '}};
        return num8;
    }
    public static char[][] num9(){
        char[][]num9 = {{'X','X','X','X','X',' '},
                        {'X',' ',' ',' ','X',' '},
                        {'X','X','X','X','X',' '},
                        {' ',' ',' ',' ','X',' '},
                        {' ',' ',' ',' ','X',' '}};
        return num9;
    }
    public static char[][] esp(){
       char[][] esp = {{' ',' ',' ',' ',' ',' '},
                       {' ',' ',' ',' ',' ',' '},
                       {' ',' ',' ',' ',' ',' '},
                       {' ',' ',' ',' ',' ',' '},
                       {' ',' ',' ',' ',' ',' '}};
        return esp;
     }  
}