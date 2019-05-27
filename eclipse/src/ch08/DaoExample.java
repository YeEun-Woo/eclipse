package ch08;

public class DaoExample {

	public static void dbWork(DataAccessObject dao) {
	dao.select();
	dao.insert();
	dao.update();
	dao.delecte();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());
	}

}
