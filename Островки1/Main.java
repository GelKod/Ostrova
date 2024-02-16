import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Writer;

class Main {
    public static void main(String[] args) throws ClassNotFoundException, MatrixNotNoramlFormat, IOException {
        // throws IOException, ClassNotFoundException
        int[][] m = new int[][] { { 5, 0, 3, 2, 4, 6, 7, 5, 5, 6, 7, 3 },
                { 4, 4, 4, 3, 4, 5, 2, 2, 4, 5, 6, 2 },
                { 4, 4, 4, 3, 2, 2, 4, 5, 4, 5, 6, 2 },
                { 4, 4, 4, 3, 2, 2, 5, 4, 5, 3, 2, 5 },
                { 6, 5, 5, 5, 3, 4, 5, 3, 6, 6, 5, 3 },
                { 4, 5, 5, 5, 3, 4, 5, 3, 6, 6, 4, 3 },
                { 1, 5, 5, 5, 4, 3, 5, 4, 3, 5, 3, 4 } };
        int[][] n = new int[][] { { 2, 2 }, { 2, 2 } };
        // System.out.println(Ostrov.too(m));
        Ostrov o1 = new Ostrov(2, 2);
        Ostrov o2 = new Ostrov(2, 2);
        o1.setMatrix(m);
        o2.setMatrix(n);
        Ostrov[] o3 = new Ostrov[] { o1, o2 };
        FileOutputStream fos = new FileOutputStream("Exercise.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(o3);

        // try {
        // FileInputStream fis = new FileInputStream("Answer.txt");
        // ObjectInputStream ois = new ObjectInputStream(fis);
        // Ostrov[] o1 = (Ostrov[]) ois.readObject();
        // if (o1[0].getR() < 1 && o1[0].getC() < 1) {
        // throw new MatrixNotNoramlFormat("1");
        // } else if (o1[1].getR() < 1 && o1[1].getC() < 1) {
        // throw new MatrixNotNoramlFormat("2");
        // }
        // int a = Ostrov.too(o1[0].getMatrix());
        // int b = Ostrov.too(o1[1].getMatrix());
        // FileWriter fr = new FileWriter("123.txt");
        // fr.write("В первом - " + a);
        // fr.write("\nВо втором - " + b);
        // String c;
        // if (a > b) {
        // c = "\nВ первом больше";
        // } else {
        // c = "\nВо втором больше";
        // }
        // fr.write(c);
        // fr.flush();
        // fr.close();
        // ois.close();
        // } catch (FileNotFoundException e) {
        // System.out.println("Файл не найден");
        // } catch (IOException e) {
        // System.out.println("Ошибка ввода вывода");
        // }
    }
}

// задание остров
// Остров это квадрат из одного числа причем рядом этих чисел не существует
// пример
// 0, 0, 0, 0, 0, 0, 0
// 0, 5, 5, 5, 0, 0, 0
// 0, 5, 5, 5, 0, 1, 1
// 0, 5, 5, 5, 0, 1, 1
// 0, 0, 0, 0, 0, 1, 1
// это остров