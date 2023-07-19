package main;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args)
	{
		System.out.println("There is no God but Allah, and Muhammad is the messenger of Allah.");
		System.out.println("O Allah, we ask for your peace and blessings upon our Prophet Muhammad."+"\n");
		Scanner x = new Scanner(System.in);
		System.out.println("The Tower of Hanoi! 2021-2022");
		System.out.println("Write for playing with the f, g and h character.");
		System.out.println("example: write f-g to move a number from the first pole to the second pole.");
		int a=0, w3=0, p1,p2=-1,p3=-1;
		String c;
		while(a==0||a==392||a==393||a<-9||a==2019||a==2020||a==3713317||a==10){
			System.out.println("Enter the number of numbers to play (1:8).");
			a=x.nextInt();
        	        if (a<-9) {System.out.println("The Tower of Hanoi! by fb/Mohamed3713317/ Ashref Sayed (Alshaer Alkatep)");}
			else if (a==392 || a==393) {System.out.println("Faculty of Science in Cairo, Al Azhar University"+"\n"+"Dr. Ramy E. Abdel-Khaleq  *_Abu Abdulrahman_*");}
			else if (a==2019) {System.out.println("I would like to thank my dear friend"+"\n"+"Youssef Abdel-Nasser El-Sayed Mahmoud Salem");}
			else if (a==2020||a==3713317) {System.out.println("The Tower of Hanoi! by Mohamed Ashref Sayed Mohamed Aly");}
			else if (a==10) {System.out.println("You can download the game from here:"+"\n"+"www.mediafire.com/file/d2rkdietdf6k0mk");}
			else if (a==0) {System.out.println("To nothingness and beyond!");}
                    }
                if (a>9) {a=8;} else {a=Math.abs(a);}
		p1=a-1;
                int[] a1= new int[a];
		int[] a2= new int[a];
		int[] a3= new int[a];
		System.out.println("f   g   h");
		for (int i=1;i<=a;i++) {
			a1[i-1]=a-i+1;
			System.out.println(i+"   |   |");
		}
		System.out.println("----------");
		System.out.println("The lowest steps is "+((int)Math.pow(2,a)-1));
                System.out.println("Press Enter key or if you want the computer to play for you, write 'computer'.");
                c=etr();
                if (c.equals("computer")) {c="1";System.out.println("Write 'y' to stop the computer and play by yourself,");} else {c="0";}
		System.out.println("Write 'n' to show the number of your moves,");
		System.out.println("Write 'f' to finish playing.");
		if (c.equals("0")){System.out.println("Write for playing with the f, g and h character.");}
		g(a,a1,a2,a3,p1,p2,p3,w3,c);
                System.out.println("Do you want to play again ?! Y/N");
		c=etr();
                if (c.equals("y")||c.equals("yes")) {
                    main(args);
                }
	}
	static String etr(){
		Scanner x = new Scanner(System.in);
		String a =x.nextLine();
		return a.toLowerCase().replaceAll(" ", "");
	}
	static void g(int a, int[] a1, int[] a2, int[] a3, int p1, int p2, int p3, int w3, String c){
		String w1="",w2="", y="";
		if (c.equals("0")) {System.out.println("write ..");} 
		else {System.out.println("press Enter key");y=etr();
			if(y.equals("y")){c="0";System.out.println("write ..");}}
		if (c.equals("0")) {y=etr();}
		else if (!y.equals("n")&&!y.equals("f")) {
			if ((a%2==0&&w3%3==0)||(a%2==1&&w3%3==1)) {
				if (p2==-1||(p1>-1&&a1[p1]<a2[p2])) {y="f --> g";} else {y="g --> f";}
			}
			else if ((a%2==0&&w3%3==1)||(a%2==1&&w3%3==0)) {
				if (p3==-1||(p1>-1&&a1[p1]<a3[p3])) {y="f --> h";} else {y="h --> f";}
			}
			else if (w3%3==2) {
				if (p3==-1||(p2>-1&&a2[p2]<a3[p3])) {y="g --> h";} else {y="h --> g";}
			}
			System.out.println(y);
		}
		if (y.length()>=2){w1=y.substring(0,1);w2=y.substring(y.length()-1);}
		if (y.equals("n")) {System.out.println("The number of your steps is "+w3);}
		else if (y.equals("f")) {System.out.println("the number of steps is "+w3);}
		else if (!w1.equals(w2)&&(w1.equals("f")||w1.equals("g")||w1.equals("h"))&&(w2.equals("f")||w2.equals("g")||w2.equals("h"))) {
			w3++;
			if (w1.equals("f")&&w2.equals("g")&&p1>=0&&(p2==-1||a2[p2]>a1[p1])) {p2++;a2[p2]=a1[p1];a1[p1]=0;p1--;}
			else if (w1.equals("f")&&w2.equals("h")&&p1>=0&&(p3==-1||a3[p3]>a1[p1])) {p3++;a3[p3]=a1[p1];a1[p1]=0;p1--;}
			else if (w1.equals("g")&&w2.equals("f")&&p2>=0&&(p1==-1||a1[p1]>a2[p2])) {p1++;a1[p1]=a2[p2];a2[p2]=0;p2--;}
			else if (w1.equals("h")&&w2.equals("f")&&p3>=0&&(p1==-1||a1[p1]>a3[p3])) {p1++;a1[p1]=a3[p3];a3[p3]=0;p3--;}
			else if (w1.equals("g")&&w2.equals("h")&&p2>=0&&(p3==-1||a3[p3]>a2[p2])) {p3++;a3[p3]=a2[p2];a2[p2]=0;p2--;}
			else if (w1.equals("h")&&w2.equals("g")&&p3>=0&&(p2==-1||a2[p2]>a3[p3])) {p2++;a2[p2]=a3[p3];a3[p3]=0;p3--;}
			else {System.out.println("Not possible :|");w3--;}
		}
		else {System.out.println("Wrong entry :(");}
		if (!y.equals("n")&&!y.equals("f")){
		System.out.println("f   g   h");
		for (int i=a-1;i>=0;i--) {
			if (a1[i]==0) {System.out.print("|   ");} else {System.out.print(a1[i]+"   ");}
			if (a2[i]==0) {System.out.print("|   ");} else {System.out.print(a2[i]+"   ");}
			if (a3[i]==0) {System.out.print("|   ");} else {System.out.print(a3[i]+"   ");}
			System.out.println();
		}}
		if (p1==-1&&p2==-1) {
			if (c.equals("1")) {System.out.println("the number of computer steps is "+w3);}
			else {System.out.println("You won :D and the no. your steps is "+w3);}
		}
		else if (!y.equals("f")) {g(a,a1,a2,a3,p1,p2,p3,w3,c);}
	}
}
