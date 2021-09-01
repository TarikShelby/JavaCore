package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstException {
    public static void main(String[] args) {/*throws FileNotFoundException , даем понять java что может быть такая ошибка
                                                                            мы создаем файл которого может не существовать  */
        File file = new File("aabb");

        {
            try {
                Scanner scanner = new Scanner(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                System.out.println("File не найден"); //Checked Exception = исключениее в работе программы
                                                        //Unchecked = ошибка в работе программы (при запуске)
            }
        }
    }

}