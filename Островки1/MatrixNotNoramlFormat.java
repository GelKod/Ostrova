public class MatrixNotNoramlFormat extends Exception {
    public MatrixNotNoramlFormat(String a) {
        super("Матрица номер " + a + " записана не правильно.");
    }
}
