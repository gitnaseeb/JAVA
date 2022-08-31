package aspire;
 enum states {
	
 TamilNadu("chennai"),Andhra("vskp"),Kerala("tvm"),UttarPardesh("lucknow"),Delhi("new delhi");
 states(String string){}
	String capital;
	String getcapital() {
		return capital;
	}
	
}

public class enum2 {

	public static void main(String[] args) {
System.out.println(states.Andhra);
states mystates= states.UttarPardesh;
//mystates.getcapital("Tami");
//states mystates=states.Kerala;	
if(states.valueOf("UttarPardesh")==mystates) {
	System.out.println("im frm UP"+" "+mystates.getcapital());
}
switch (mystates ) {
case TamilNadu:{
	System.out.println("im frm TN");
	break;
}
case UttarPardesh:{
	System.out.println("im frm up");
	break;
}
default :{
	System.out.println("invalid");
	break;
}
}
states[] allstates =states.values();
for (states s:allstates) {
	System.out.println(s);
}
	}

	}
