/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice21ce25.fjavafx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class abc
{
    public abc() throws SQLException
    {
        Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Employee","cynara","password");
        System.out.println("Connection Created");
    }
}