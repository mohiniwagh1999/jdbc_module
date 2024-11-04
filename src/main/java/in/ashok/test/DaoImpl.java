package in.ashok.test;

import org.springframework.jdbc.core.JdbcTemplate;

public class DaoImpl implements Dao {

	 private JdbcTemplate template;
	 
	 public void setjdbc(JdbcTemplate template)
	 {
		 this.template=template;
	 }
	@Override
	public boolean save() {
		// TODO Auto-generated method stub
		String query="insert into book values(1,'java',200)";
		template.execute(query);
		return true;
	}

}
