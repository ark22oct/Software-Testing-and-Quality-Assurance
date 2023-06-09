/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;
import java.sql.*;
import java.util.*;

/**
 *
 * @author a19khan
 */
public class lol {
    
    public static void query1() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name, avgKDA FROM player WHERE avgKDA > 2");
            while (rs.next()){
                String name = rs.getString("name");
                String kda = rs.getString("avgKDA");
                System.out.println(name +"|KDA: "+ kda);
            }
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }

    public static void query2() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT role, avgCSR FROM player WHERE avgCSR > 5");
            while (rs.next()){
                String role = rs.getString("role");
                String CSR = rs.getString("avgCSR");
                System.out.println(role + "|CSR: " + CSR);
            }
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void query3() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT skin, MAX(winrate) as maxWR FROM champion");
            while (rs.next()){
                String skin = rs.getString("skin");
                 String maxWR = rs.getString("maxWR");
                System.out.println(skin +"|Max Win Rate: " + maxWR);
            }
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void query4() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name, MAX(pickrate) as maxPR FROM champion");
            while (rs.next()){
                String name = rs.getString("name");
                String maxPR= rs.getString("maxPR");
                System.out.println(name +"|Max Pick Rate: "+ maxPR);
            }
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void query5() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name, MIN(banrate) as minBR FROM champion");
            while (rs.next()){
                String name = rs.getString("name");
                String minBR = rs.getString("minBR");
                System.out.println(name +"|Minimum Ban Rate: "+ minBR);
            }
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void query6() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT name, avgDragonsSlaughtered FROM team WHERE avgDragonsSlaughtered > 2");
            while (rs.next()){
                String name = rs.getString("name");
                String avgDragonsSlaughtered = rs.getString("avgDragonsSlaughtered");
                System.out.println(name +"|Average Dragons Slaughtered per Game: "+ avgDragonsSlaughtered);
            }
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void query7() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT region, MIN(avgGameDuration) AS minAvgGameDuration FROM team");
            while (rs.next()){
                String region = rs.getString("region");
                String minAvgGameDuration = rs.getString("minAvgGameDuration");
                System.out.println(region +"|Length of Game: "+ minAvgGameDuration);
            }
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void query8() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            String sql = "UPDATE team SET name ='Akafrf' WHERE name='Akafr'";
            stmt.execute(sql);
            System.out.println("Akafr has been updated to Akafrf");
            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void query9() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX(purse) as maxPurse FROM contest");
            while (rs.next()){
                String maxPurse = rs.getString("maxPurse");
                System.out.println("Maximum Purse Available: $"+ maxPurse);
            }

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }
    
    public static void query10() {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:lol.db");
            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT COUNT(name) AS numberOfTRContests FROM contest WHERE region = 'TR'");
            while (rs.next()){
                String numberOfTRContests = rs.getString("numberOfTRContests");
                System.out.println( "tournament(s) held in the TR region:" +numberOfTRContests);
            }

            stmt.close();
            c.commit();
            c.close();
        } catch (Exception e) {
            System.err.println( e.getClass().getName() + ": " + e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
      
        
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        System.out.println("League of Legends (LoL) database:");
        
        do{
            System.out.println("From one of the following options, choose via");
            System.out.println("entering a number from 0-10 (where 0 will exit the application): ");
            System.out.println("(1) Locate all players who have KDAs greater than 2");
            System.out.println("(2) Locate the role that has the highest Creep-Score-Ratio (CSR)");
            System.out.println("(3) Locate the skin of a champion that offers the maximum win rate");
            System.out.println("(4) Locate the champion with the highest pick rate");
            System.out.println("(5) Locate the champion with the minimum ban rate");
            System.out.println("(6) Locate all teams that have slaughtered over 2 average dragons per game");
            System.out.println("(7) Locate the region with the shortest game duration");
            System.out.println("(8) Alter the name of Akafr to Akafrf");
            System.out.println("(9) Locate the contest that offers the maximum purse available");
            System.out.println("(10) Count the number of tournament(s) held in the TR region");
            System.out.print("Query Number: ");
            
            int choice = sc.nextInt();
            if (choice == 0) {
                System.out.println("Exiting...Completed!");
                running = false;
            } else if (choice == 1) {
                query1();
            } else if (choice == 2) {
                query2();
            } else if (choice == 3) {
                query3();
            } else if (choice == 4) {
                query4();
            } else if (choice == 5) {
                query5();
            } else if (choice == 6) {
                query6();
            } else if (choice == 7) {
                query7();
            } else if (choice == 8) {
                query8();
            } else if (choice == 9) {
                query9();
            } else if (choice == 10) {
                query10();
            } else {
                System.out.println("Invalid, try again!");
            }
        } while(running != false);

    }
    
}
