package electricity.meter.app;

import com.zaxxer.hikari.HikariDataSource;
import electricity.meter.models.Input;
import electricity.meter.repositories.DataRepository;
import electricity.meter.repositories.DataRepositoryJdbcImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) throws SQLException {
        HikariDataSource dataSource = new HikariDataSource();

        final String pathDB = "jdbc:postgresql://localhost:5432/postgres";
        dataSource.setJdbcUrl(pathDB);//путь к базе данных
        dataSource.setUsername("wrickard");//логин пользователя
        dataSource.setPassword("");//пароль пользователя

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите код плательщика: ");
        Long id = scan.nextLong();
        System.out.println("Введите период показаний [MMYYYY]: ");
        Integer period = scan.nextInt();
        System.out.println("Введите показания счетчика [кВт/ч]: ");
        Double data = scan.nextDouble();
        //System.out.println("Id: " + id + "\nPeriod: " + period + "\nData: " + data);
        Input userData = new Input(id, period, data);
        DataRepository dataRepository = new DataRepositoryJdbcImpl(dataSource);
        dataRepository.save(userData);

    }
}
