package corejava;

public class split {
public static void main(String[] args) {
	String fullname= "selenium-grid-hq";
	String [] toolname=fullname.split("-");
	 for (String a : toolname)
         System.out.println(a);
}
}
