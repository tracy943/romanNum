import java.util.Scanner;


public class numeralConverter {


public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Type a number");
int num = -1;
String roman = "";
do{
if(sc.hasNextInt())
num = sc.nextInt();
else{
System.out.println("Error");
sc.nextLine();
sc.next();
}

}while(num<=0 && num>3999);


while(num>=900){
if(num==900){
roman+="CM";
num=0;
}
else{
roman+="M";
num-=1000;
}
}
while(num>=400){
if(num==400){
roman+="CD";
num=0;
}
else{
roman+="D";
num-=500;
}
}
while(num>=90){
if(num==90){
roman+="XC";
num=0;
}
else{
roman+="C";
num-=100;
}
}
while(num>=40){
if(num==40){
roman+="XL";
num=0;
}
else{
roman+="L";
num-=50;
}
}
while(num>=9){
if(num==9){
roman+="IX";
num=0;
}
else{
roman+="X";
num-=10;
}
}
while(num>=4){
if(num==4){
roman+="IIIV";
num=0;
}
else{
roman+="V";
num-=5;
}
}
while(num>=1){
roman+="I";
num-=1;
}
System.out.println("Msg " +roman);



}

}