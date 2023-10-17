package sy_ooclab_isa2;

public class Main_java1 {
	public static void main(String args[]) {
		
		System.out.print("BLOOD DONATION DATABASE:: ");
		BD_camp camp[] = new BD_camp[5];
				
		BD_camp d0= new BD_camp("GMC       ","PLASMA",180.58,20);
		BD_camp d1= new BD_camp("Sanjivni  ","WBC   ",200.35,42);
		BD_camp d2= new BD_camp("Kanekar   ","PLASMA",540.45,36);
		BD_camp d3= new BD_camp("Borkar    ","RBC   ",480.55,24);
		BD_camp d4= new BD_camp("Appolo    ","RBC   ",600.15,19);
		
		camp[0]=d0;
		camp[1]=d1;
		camp[2]=d2;
		camp[3]=d3;
		camp[4]=d4;
		
		System.out.print("\n|Hospital  |cells |Litres|camps|\n");
		for(int p=0;p<camp.length;p++) {
			System.out.print("|"+camp[p].hname+"|"+camp[p].bcell+"|"+camp[p].qty+"|"+camp[p].bcount+"|\n");
		}
		
	}
}
