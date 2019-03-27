package com.itheima.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;

import com.itheima.test.Region;


public class RegionDao {
	
	
	public void testAdd(ArrayList<Region> regionList ) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			// 1.获取连接
			conn = JDBCUtils.getConnection();
			 for (Region region : regionList) {
				   // 2.编写sql语句
					String sql = "insert into t_sys_org values(null,?,?,?,?,?,null,?,null)";
					// 3.获取执行sql语句对象
					pstmt = conn.prepareStatement(sql);
					// 4.设置参数
					pstmt.setString(1, region.getOrgid());
					pstmt.setString(2, region.getOrgCode());
					pstmt.setString(3, region.getVirtualCode());
					pstmt.setString(4, region.getOrgName());
					pstmt.setString(5, region.getParentOrgid());
				    SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				    Date  now = new Date();
					pstmt.setString(6, sdf3.format(now));
					// 5.执行插入操作
					int r=pstmt.executeUpdate();
					if(r>0){
						System.out.println("添加成功");
					}else{
						System.out.println("添加失败");
					}
			    }
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			// 6.释放资源
			JDBCUtils.release(conn, pstmt, null);
		}
	}
	

}
