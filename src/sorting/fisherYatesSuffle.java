

public class fisherYatesShuffle {
    public static void fisherYatesShuffle(int[] array) {
        Random r = new Random();
	int indexLast = array.length-1;
	for (int indexActual = indexLast; indexActual > 0; indexActual--) {
            int indexRandom = r.nextInt(indexActual);
	    int tmp = array[indexActual];
	    array[indexRandom] = array[indexActual];
	    array[indexActual] = tmp;
	}
    }

}
