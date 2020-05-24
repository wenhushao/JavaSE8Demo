import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CRUD {
    public static void main(String[] args) {
        CRUD crud = new CRUD();
        //crud.add();
        //crud.update();
        //crud.selectAll();
        crud.selectOne();
        //crud.delete();
    }

    Connection conn = BaseConn.getConn();
    PreparedStatement ps = null;
    ResultSet rs = null;

    public void add() {
        String sql = "insert into user(userId,username,password) values(?,?,?)";
        //获得Connection
        //创建PreparedStatement
        //处理查询结果ResultSet
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 6);
            ps.setString(2, "Test00");
            ps.setString(3, "Test0000");
            int a = ps.executeUpdate();
            if (a > 0) {
                System.out.println("Add Success!");
            } else {
                System.out.println("Add Fail!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //释放资源
            //ResultSet
            //Statement
            //Connection
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
    }

    public void selectAll() {
        String sql = "select * from user";
        try {
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            System.out.println("UserID\tUsername\tPassword");
            while (rs.next()) {
                System.out.println(rs.getInt("userId") + "\t" + rs.getString("username") + "\t" + rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void selectOne() {
        String sql = "select * from user where userId=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 6);
            rs = ps.executeQuery();
            System.out.println("UserID\tUsername\tPassword");
            while (rs.next()) {
                System.out.println(rs.getInt("userId") + "\t" + rs.getString("username") + "\t" + rs.getString("password"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

    public void update() {
        String sql = "update user set username=?,password=? where userId=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1, "update");
            ps.setString(2, "test02");
            ps.setInt(3, 6);
            int a = ps.executeUpdate();
            if (a > 0) {
                System.out.println("Update Success!");
            } else {
                System.out.println("Update Fail!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void delete() {
        String sql = "delete from user where userId=?";
        try {
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 6);
            int a = ps.executeUpdate();
            if (a > 0) {
                System.out.println("Delete Success!");
            } else {
                System.out.println("Delete Fail!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}