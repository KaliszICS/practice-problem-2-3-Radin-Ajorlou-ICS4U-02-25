public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void bubbleSortString(String[] strings) {
		boolean swapped = true;
		for (int a = 0; a < strings.length - 1 && swapped;  a++){
			swapped = false;
			for (int b = 0; b < strings.length - a - 1; b++){
				int vs = strings[b].compareToIgnoreCase(strings[b + 1]);
				if (vs > 0){
					String temp = strings[b];
					strings[b] = strings[b + 1];
					strings[b + 1] = temp;
					swapped = true;
				}
			}
		}

		for (int i = 0 ; i < strings.length; i++){
			System.out.print(strings[i]+ " ");
		}
	}

}
