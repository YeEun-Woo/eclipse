package ch08;

public class OracleDao implements DataAccessObject{
@Override
	public void select() {
		System.out.println("Oracle DB���� �˻�");

}

@Override
public void insert() {
	System.out.println("Oracle DB���� ����");

}

@Override
public void update() {
	System.out.println("Oracle DB���� ����");

}

@Override
public void delecte() {
	System.out.println("Oracle DB���� ����");

}
}