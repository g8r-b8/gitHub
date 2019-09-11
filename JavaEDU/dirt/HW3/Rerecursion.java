import java.util.ArrayList;

public class Rerecursion{
	
	public static int compareTo(String one, String two){

		int rez = 99;

		char[] oneAr = one.toCharArray();
		char[] twoAr = two.toCharArray();

		int i = oneAr.length;
		int j = twoAr.length;

		if(i<j){rez=-1;}
		else if (j<i){rez=1;}
		else{
			int index = 0;
			boolean cnt = true;
			while(cnt){
				int a1 = (int) oneAr[index];
				int a2 = (int) twoAr[index];

				if(a1<a2){
					rez=-1;
					cnt=false;
				}
				else if(a2<a1){
					rez=1;
					cnt=false;
				}
				else if(index==i){
					rez=0;
					cnt=false;
				}
				index++;
			}
		}
		return rez;
	}

	public static String findMin(ArrayList<String> strAr){
		
		if(strAr.size()>=2){

			String currentMin = null;

			String a = strAr.get(0);
			String b = strAr.get(1);


			int rez = Rerecursion.compareTo(a,b);

			
			
			if(rez==-1){
				currentMin=a;
				strAr.remove(1);
			}
			else if (rez==1){
				currentMin=b;
				strAr.remove(0);
			}
			else{
				currentMin=a;
				strAr.remove(1);
			}
			return findMin(strAr);
		}

	
 	return String.format(strAr.get(0));
	
	



	}


	public static void main(String[] args){
		
		int ans = Rerecursion.compareTo("a","b");

		ArrayList<String> arList = new ArrayList<>();

		arList.add("a");
		arList.add("b");
		arList.add("c");

		String newAns = Rerecursion.findMin(arList);

		System.out.println(ans);

	}

}