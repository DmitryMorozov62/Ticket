import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        String[] words = {"hello","have a good day","World","World","hello","have a good day","oh, it's working",
                "Hooray!!!","have a good day","World","World","hello"};

        int n = words.length;

        for ( int i = 0, m; i != n; i++, n = m ) {
            for ( int j = m = i + 1; j != n; j++ ) {
                if ( !words[j].equals(words[i])){
                    if (m != j )
                        words[m] = words[j];
                    m++;
                }
            }
        }
        if ( n != words.length ) {
            String[] b = new String[n];
            System.arraycopy(words, 0, b, 0, n);
            System.out.println(Arrays.toString(b));
        }

    }
}
