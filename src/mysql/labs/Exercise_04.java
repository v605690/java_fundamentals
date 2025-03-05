package mysql.labs;


/*
*  MySQL Exercise 4:
*
*   Now that you have mastered your air travel database, it's time to connect this DB to a Java application
*   using JDBC. You can start simple here and build your way up. Within a Java application, using JDBC, please
*   demonstrate how to:
*
*   Note: CRUD means (Create, Read, Update, Delete)
*
*       1.) CRUD new flights
*       2.) CRUD new passengers
*       3.) Bonus: flex those JDBC muscles! How nice, clean, useful can you make this? Show us what you've got!
*
*
*   Caution: Before you push this code to GitHub, be sure to REMOVE or REPLACE your DATABASE PASSWORD. You do not 
*   want to push your database password to GitHub. If you do push your password to GitHub you'll need to delete
*   the commit from your Git history. See, for instance: https://medium.com/multinetinventiv/removing-commits-from-git-history-4e2340288484 
*
 */

import java.sql.*;

public class Exercise_04 {

    public static <preparedStatement> void main(String[] args) {
        /*
        Just as a casual example - each of these operations should be in it's own method. Feel free to
        create all required classes/methods to accomplish this.

        createFlight(...); -> INSERT -> executeUpdate()
        queryFlight(...); -> SELECT -> executeQuery()
        updateFlight(...); -> UPDATE -> executeUpdate()
        deleteFlight(...); -> DELETE -> executeUpdate()


        createPassenger(...);
        queryPassenger(...);
        updatePassenger(...);
        deletePassenger(...);

         */

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connectionString = "jdbc:mysql://localhost/airTravelDB?"
                    +"user=root&password=K3yst0n3!!&useSSL=false";
            Connection connection = DriverManager.getConnection(connectionString);

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(
                    "SELECT * FROM airTravelDB.flights");

            while (resultSet.next()) {
                System.out.print("\n" + "flight ID " + resultSet.getInt("flight_id"));
                System.out.print(" " + "Flight Status: "+ resultSet.getString("flight_status"));
            }
                System.out.println();

             int i = statement.executeUpdate(
                        "INSERT INTO tickets (ticket_id, passenger_id, seat_number, ticket_price, ticket_type) " +
                                "VALUES (37, 108, 'F1C', 950, 'business')");
            System.out.println(i);

            int u = statement.executeUpdate(
                 "UPDATE tickets SET ticket_type = 'business'" +
                         "WHERE ticket_id = 9");
            System.out.println(u);

            int d = statement.executeUpdate(
                  "DELETE FROM tickets WHERE ticket_id > 14 AND ticket_id < 36");
            System.out.println(d);

            System.out.println();

            PreparedStatement preparedStatement = connection.prepareStatement(
                  "SELECT * FROM airTravelDB.airlines WHERE airline_name = ?"
            );
            preparedStatement.setString( 1, "united_airlines");
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                System.out.print("flight ID " + resultSet.getInt("airline_id"));
                System.out.println(" -> " + " Airliner -> " + resultSet.getString("airline_name"));
            }

            PreparedStatement preparedStatement2 = connection.prepareStatement(
                   "INSERT INTO airTravelDB.airlines (airline_name)" +
                           "VALUES (?)");
            preparedStatement2.setString(1, "silver_airways");

            int pi = preparedStatement2.executeUpdate();

            PreparedStatement prepareStatement = connection.prepareStatement(
                            "UPDATE airTravelDB.airlines SET airline_name = ? WHERE airline_id = 1008");

                   prepareStatement.setString(1, "allegiant_air");

                    int pu = prepareStatement.executeUpdate();

           PreparedStatement prepStatement2 = connection.prepareStatement(
                  "DELETE FROM airTravelDB.airlines WHERE airline_name = ?");

                   prepStatement2.setString(1, "frontier_airlines");

                  int pd = prepStatement2.executeUpdate();


        } catch (SQLException e) {
            System.out.println("Exception occurred");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Exception occurred +"
                    + " - driver not found on classpath");
            e.printStackTrace();
        } finally {

        }
    }
}
