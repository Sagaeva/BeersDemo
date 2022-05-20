package beerPackage.repositories;

import beerPackage.data.Brewers;
import beerPackage.data.Categories;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategotiesRerository {

    private Connection connection =
            ConnectionFactory.getConnection();

    public CategotiesRerository() throws SQLException {

    }

    public void createOne(Categories categories) throws SQLException{

    /* Statement statement = connection.createStatement();
     String query = "INSERT INTO Beers(Id, Name, BrewerId, CategoryId) VALUES ( "
             + beers.getId()+ ", ' "
             + beers.getName()+ " ',"
             + beers.getBrewerId()+","
             + beers.getCategoryId();
     statement.executeUpdate(query); */

        PreparedStatement preparedStatement = connection
                .prepareStatement("INSERT INTO Categories(Id, Category VALUES(?,?);");
        preparedStatement.setInt(1, categories.getId());
        preparedStatement.setString(2, categories.getCategory());
        preparedStatement.executeUpdate();

    }

    public Categories findOneById (int id) throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM Categories WHERE Id = " + id;
        ResultSet resultSet = statement.executeQuery(query);
        Categories categories = null;
        while (resultSet.next()) {
            categories = new Categories(resultSet.getInt("Id"),
                    resultSet.getString("Category"));

        }
        return categories;
    }

    public List<Categories> findAll() throws SQLException {
        Statement statement = connection.createStatement();
        String query = "SELECT * FROM Categories";
        ResultSet resultSet = statement.executeQuery(query);
        List<Categories> categoriesList = new ArrayList<>();
        while (resultSet.next()) {
            categoriesList.add(new Categories(resultSet.getInt("Id"),
                    resultSet.getString("Category")));

        }
        return categoriesList;
    }

    public void updateOne(Categories categories, int id) throws SQLException {

        PreparedStatement preparedStatement = connection
                .prepareStatement("UPDATE Categories SET Id =?, Category = ?;");
        preparedStatement.setInt(1, categories.getId());
        preparedStatement.setString(2, categories.getCategory());
        preparedStatement.executeUpdate();

    }
    public void deleteOne(int id) throws SQLException {

        Statement statement = connection.createStatement();
        String query = "DELETE FROM CAategories Where id=" + id + ";";
        statement.executeUpdate(query);

    }
}
