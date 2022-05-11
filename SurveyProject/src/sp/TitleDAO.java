package sp;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TitleDAO {
	private JdbcTemplate jdbcTemplate;
	Connection conn = null;
	PreparedStatement pstmt = null;

	TitleDAO() {
		jdbcTemplate = JdbcTemplate.getInstance();
	}

//   //selectAll
//   public ArrayList<TitleVO> selectAll() {
//	      ArrayList<TitleVO> ls = new ArrayList<>();
//	      ResultSet rs = null;
//	      String sql = "SELECT * FROM TITLE";
//	   
//	      try {
//	         conn = jdbcTemplate.getConnection();
//	         pstmt = conn.prepareStatement(sql);
//	         rs = pstmt.executeQuery();
//	         
//	         while(rs.next()) {
//	        	 TitleVO tmp= new TitleVO(
//	        			 rs.getInt(1),
//	        			 rs.getString(2),
//	        			 rs.getInt(3));
//	        	 ls.add(tmp);
//	         }
//	      }catch(SQLException e) {
//	         e.printStackTrace();
//	      }finally {
//	         if(pstmt != null) {
//	            try {
//	               pstmt.close();
//	            } catch (SQLException e) {
//	               e.printStackTrace();
//	            }
//	         }
//	         if(conn != null) {
//	            try {
//	               conn.close();
//	            } catch (SQLException e) {
//	               e.printStackTrace();
//	            }
//	         }
//	      }
//	      return (ls.size()==0) ? null:ls;
//	   }
	// Update
	public void updateTitle(int num) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "update \"TITLE\" set COUNT = COUNT+1 where NUM=?";

		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			
//			if (num == 0)
//				num = getMaxNum();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}

	}// List

	public List<TitleVO> getAllList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		List<TitleVO> vlist = new ArrayList<>();
		try {
			conn = jdbcTemplate.getConnection();
			sql = "select * from Title order by num asc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				TitleVO tdao = new TitleVO(rs.getInt(1), rs.getString(2), rs.getInt(3));
				vlist.add(tdao);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return (vlist.size() != 0) ? vlist : null;
	}

	// Insert
	public void TitleInsert(TitleVO tvo) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = null;

		try {
			conn = jdbcTemplate.getConnection();
			sql = "insert into Title(num, item, count)" + "values(?,?,?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, tvo.getNum());
			pstmt.setString(2, tvo.getItem());
			pstmt.setInt(3, tvo.getCount());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private int getMaxNum() {
		return 0;
	}
	public List<TitleVO> getBest(){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "SELECT * FROM TITLE ORDER BY COUNT DESC";
		List<TitleVO> vlist = new ArrayList<>();
		try {
			conn = jdbcTemplate.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				TitleVO tdao = new TitleVO(rs.getInt(1), rs.getString(2), rs.getInt(3));
				vlist.add(tdao);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

		}
		return (vlist.size() != 0) ? vlist : null;
	}
}
