package Course.Course2.Efremov.Lessons.JavaLesson1.Interfaces;

public class CharCounter {

    private final Reader reader;
    private final Writer writer;


    public CharCounter(Reader reader, Writer writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void count() { // a,b,c...z, A,B,C...Z
        String text = reader.read();
        int[] c = new int[127];
        char[] chars = text.toCharArray();
        for (char ch : chars) {
            c[ch]++;
        }
        for (int i = 0; i < c.length; i++) {
            if (c[i] != 0) {
                writer.write((char)i + " встретилось " + c[i]);
            }

        }
    }
}
